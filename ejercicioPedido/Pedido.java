package java9POOFundamentos.ejercicioPedido;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numeroPedido;
    private String nombreCliente;
    private double total;
   private double precio;
    private List<String> productos;


    public Pedido() {
        this.productos = new ArrayList<>();
    }

    public Pedido(int numeroPedido, String nombreCliente, List<String> productos,
                  double precio) {
        this.numeroPedido = numeroPedido;
        this.nombreCliente = nombreCliente;
        this.productos = productos;
        this.precio = precio;
    }

    //GET/SET


    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public double getTotal() {
        return total;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void agregarProducto(String producto, double precio) {
        productos.add(producto);
        total += precio;
        System.out.println("Usted ha Añadido: " + producto+ " A su orden");
    }

    public void calcularDescuento(double porcentaje) {
        if (porcentaje >= 0 && porcentaje <= 100) {
            double descuento = total * (porcentaje / 100);
            total -= descuento;
            System.out.println("Su ahorro es de: " + descuento);
            System.out.println("El total del pedido es: " + total);
        } else {
            System.out.println("El porcentaje "+porcentaje+"% No aplica");
        }
    }

    public void mostrarPedido() {
        System.out.println("Número de pedido: " + numeroPedido);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("---Detalle de Pedido---");
        for (String producto : productos) {
            System.out.println(" - " + producto);
        }
        System.out.println("Total: $" + total);
        System.out.println("-------------Fin-------------");
    }
}


