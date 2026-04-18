package repository;

import model.Producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoRepository {

    private List<Producto> productos;

    public ProductoRepository() {
        this.productos = new ArrayList<>();
    }

    public void guardar(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }

    // Code smell: búsqueda lineal, no optimizada  --> RESUELTO
   public Producto buscarPorNombre(String nombre) {
    String nombreMinuscula = nombre.toLowerCase();
    return productos.stream()
            .filter(p -> p.getNombre().toLowerCase().contains(nombreMinuscula))
            .findFirst()
            .orElse(null);
        }


    public List<Producto> listar() {
        return productos;
    }
}
