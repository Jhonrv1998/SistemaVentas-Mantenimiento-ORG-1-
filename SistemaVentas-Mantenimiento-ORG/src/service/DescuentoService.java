package service;

public class DescuentoService {
      public double calcularDescuento(double monto, String tipoCliente) {
        IdescuentoStrategy estrategia = DescuentoFactory.obtenerEstrategia(tipoCliente);
        return estrategia.aplicar(monto);
    }
}
