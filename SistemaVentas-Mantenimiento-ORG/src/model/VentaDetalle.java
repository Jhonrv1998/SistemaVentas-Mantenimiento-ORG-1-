package model;
import java.math.BigDecimal;

public class VentaDetalle {

    private Producto producto;
    private int cantidad;

    public VentaDetalle(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public BigDecimal calcularSubtotal() {
    // 1. Validar lógica: si la cantidad es menor o igual a cero, el subtotal es 0
    if (cantidad <= 0 || producto.getPrecio() == null) {
        return BigDecimal.ZERO;
    }
    
    // 2. Usar el método multiply para BigDecimal
    return producto.getPrecio().multiply(new BigDecimal(cantidad));
}
}
