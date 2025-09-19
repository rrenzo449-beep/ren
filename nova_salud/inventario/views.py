from django.shortcuts import render, redirect
from .models import Producto, Cliente, Venta, DetalleVenta
from django.db.models import F, Sum
from django.contrib import messages
from django.utils import timezone

# Página inicio con alertas
def inicio(request):
    productos_bajo_stock = Producto.objects.filter(stock__lte=5)  # Umbral de alerta
    contexto = {
        'productos_bajo_stock': productos_bajo_stock,
    }
    return render(request, 'inventario/inicio.html', contexto)

# Listado productos
def lista_productos(request):
    productos = Producto.objects.all()
    return render(request, 'inventario/lista_productos.html', {'productos': productos})

# Crear nueva venta (simplificado)
def nueva_venta(request):
    clientes = Cliente.objects.all()
    productos = Producto.objects.filter(stock__gt=0)

    if request.method == 'POST':
        cliente_id = request.POST.get('cliente')
        productos_ids = request.POST.getlist('producto')
        cantidades = request.POST.getlist('cantidad')

        if not cliente_id:
            messages.error(request, "Debe seleccionar un cliente.")
            return redirect('nueva_venta')

        if not productos_ids or not cantidades:
            messages.error(request, "Debe seleccionar productos y cantidades.")
            return redirect('nueva_venta')

        cliente = Cliente.objects.get(id=cliente_id)
        venta = Venta.objects.create(cliente=cliente, fecha=timezone.now())

        total_venta = 0
        for prod_id, cant in zip(productos_ids, cantidades):
            prod = Producto.objects.get(id=prod_id)
            cantidad = int(cant)
            if cantidad > prod.stock:
                messages.error(request, f"Stock insuficiente para {prod.nombre}.")
                venta.delete()
                return redirect('nueva_venta')

            subtotal = prod.precio * cantidad
            DetalleVenta.objects.create(venta=venta, producto=prod, cantidad=cantidad, subtotal=subtotal)

            prod.stock = F('stock') - cantidad
            prod.save()

            total_venta += subtotal

        venta.total = total_venta
        venta.save()
        messages.success(request, "Venta registrada exitosamente.")
        return redirect('inicio')

    return render(request, 'inventario/nueva_venta.html', {'clientes': clientes, 'productos': productos})
