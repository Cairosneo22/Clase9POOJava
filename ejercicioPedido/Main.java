package java9POOFundamentos.ejercicioPedido;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pedido pedido1 = new Pedido();
        pedido1.setNumeroPedido(1);
        pedido1.setNombreCliente("Carlos Díaz");
        pedido1.agregarProducto("Hamburguesa", 25500);
        pedido1.agregarProducto("Papitas Fritas", 12000);
        pedido1.agregarProducto("MR Tee", 4000);
        pedido1.calcularDescuento(-10);
        pedido1.calcularDescuento(10);
        pedido1.mostrarPedido();


        List<String> productos = new ArrayList<>();

        Pedido pedido2 = new Pedido(1,"juan",productos,double total);
Pedido
        

        Pedido pedido3 = new Pedido(2,"Carlitos",productos,double total);




    }
}
