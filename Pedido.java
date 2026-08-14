import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Producto> productos;

    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public double calcularTotalConDescuento(double porcentajeDescuento) {
        double total = calcularTotal();
        double descuento = total * (porcentajeDescuento / 100);
        return total - descuento;
    }

    public double calcularTotalConImpuesto(double porcentajeImpuesto) {
        double total = calcularTotal();
        double impuesto = total * (porcentajeImpuesto / 100);
        return total + impuesto;
    }
    
    public double calcularDescuentoPorVolumen() {
        int cantidad = productos.size();
        if (cantidad >= 10) {
            return 15.0;
        } else if (cantidad >= 5) {
            return 10.0;
        } else if (cantidad >= 3) {
            return 5.0;
        }
        return 0.0;
    }

    public double calcularTotalConDescuentoPorVolumen() {
        double total = calcularTotal();
        double porcentaje = calcularDescuentoPorVolumen();
        double descuento = total * (porcentaje / 100);
        return total - descuento;
    }

    public List<Producto> getProductos() {
        return productos;
    }
}