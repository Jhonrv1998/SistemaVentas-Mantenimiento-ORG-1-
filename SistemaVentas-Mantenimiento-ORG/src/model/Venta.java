package model;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venta {

    private Cliente cliente;
    private List<VentaDetalle> detalles;
    private boolean finalizada;

    public Venta(Cliente cliente) {
        this.cliente = cliente;
        this.detalles = new ArrayList<>();
        this.finalizada = false;
    }

    public void agregarDetalle(Producto producto, int cantidad) {
        detalles.add(new VentaDetalle(producto, cantidad));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<VentaDetalle> getDetalles() {
        return detalles;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void finalizar() {
        this.finalizada = true;
    }

    
public BigDecimal calcularTotal() {
    BigDecimal total = BigDecimal.ZERO; // Inicializa en 0
    for (VentaDetalle d : detalles) {
        if (d.calcularSubtotal() != null) {
            // Usamos .add() para sumar objetos BigDecimal
            total = total.add(d.calcularSubtotal());
        }
    }
    return total;
}
}
