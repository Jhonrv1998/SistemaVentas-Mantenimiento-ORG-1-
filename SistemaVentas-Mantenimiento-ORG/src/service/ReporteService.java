package service;

import model.Venta;
import model.VentaDetalle;
import repository.VentaRepository;
import util.Console;

import java.util.List;

public class ReporteService {

    private VentaRepository ventaRepo;

    public ReporteService(VentaRepository ventaRepo) {
        this.ventaRepo = ventaRepo;
    }

    public void mostrarReporteVentas() {
    List<Venta> ventas = ventaRepo.listar();

    // Corrección de lógica: Validar si no hay datos
    if (ventas.isEmpty()) {
        Console.info("No hay ventas registradas para generar el reporte.");
        return;
    }

    Console.info("=== REPORTE DE VENTAS ===");
    int i = 1;
    for (Venta v : ventas) {
        imprimirCabeceraVenta(i++, v);
        imprimirDetallesVenta(v);
        Console.info("TOTAL: " + v.calcularTotal());
        Console.info("-----------------------------");
    }
    }

// Métodos auxiliares para eliminar el "Método Largo"
private void imprimirCabeceraVenta(int indice, Venta v) {
    Console.info("Venta #" + indice + " Cliente: " + v.getCliente().getNombre());
    }

private void imprimirDetallesVenta(Venta v) {
    for (VentaDetalle d : v.getDetalles()) {
        Console.info("- " + d.getProducto().getNombre() 
            + " x " + d.getCantidad() 
            + " = " + d.calcularSubtotal());
    }
    }

public void mostrarResumen() {
    int totalVentas = ventaRepo.contarVentas();
    // BUG corregido: Ahora informa explícitamente si está vacío
    if (totalVentas == 0) {
        Console.info("Resumen: No se realizaron ventas el día de hoy.");
    } else {
        Console.info("TOTAL VENTAS REALIZADAS: " + totalVentas);
    }
    }

}
