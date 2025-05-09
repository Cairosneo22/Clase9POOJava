package java9POOFundamentos;

import java9POOFundamentos.ejercicioPedido.Pedido;

import java.util.ArrayList;
import java.util.List;

public class Main {
public static void main(String[] args) {


    Auto2 auto2 = new Auto2();
    auto2.setMarca ("BMW");
    auto2.setModelo("330i");
    auto2.setAnio(2022);
    auto2.setKilometraje(120);
    auto2.setDetallado(true);
    auto2.mostrarInformacion();


    Auto2 auto3 = new Auto2("Cherolet", "Cruze", 2017, 0, true);
    auto3.mostrarInformacion();

    Auto2 auto4 = new Auto2("Renault", "Captiva", 2020, 0, false);
    auto4.mostrarInformacion();


   System.out.println("__________Prueba Auto2__________");
   auto2.actualizarKilometraje(200);
   auto2.actualizarKilometraje(-10);
   System.out.println("____________Fin Auto2___:_______");










    //EJERCICIO LIBRO
    Libro libro1 = new Libro("Cien Años de Soledad", "Gabo", 1993, true);

    libro1.mostrarDetalles();

    System.out.println("________________Libro1_________________");
    libro1.prestar();
    libro1.prestar();
    libro1.devolver();
    libro1.prestar();
    System.out.println("________________FinLibro1_______________");



//EJERCICIO CUENTA BANCARIA

    CuentaBancaria crearCta1 = new CuentaBancaria();
    CuentaBancaria crearCta2 = new CuentaBancaria("Ahorros", "Francisco Goez", 9887766, 0);

    crearCta2.mostrarDatosCuenta();


     crearCta1.setTipoCuenta("Ahorros");
    crearCta1.setNombreTitular("Paulo Rojas");
    crearCta1.setNumeroCuenta(12746476);
    crearCta1.setSaldo(250);
    System.out.println("Querid@ "+crearCta1.getNombreTitular()+" Se ha creado la cuenta "
            +crearCta1.getTipoCuenta()+" Número: "+crearCta1.getNumeroCuenta()+
            " y Actualmente su saldo es: "+crearCta1.getSaldo());


    System.out.println("________________Const2_________________");
    crearCta2.depositar(500);
    System.out.println("Su nuevo saldo es: "+crearCta2.getSaldo());
    crearCta2.retirar(16000);
    System.out.println("Su nuevo saldo es: "+crearCta2.getSaldo());
    crearCta2.retirar(400);
    System.out.println("Su nuevo saldo es: "+crearCta2.getSaldo());
    System.out.println("________________FinCons2_______________");


    System.out.println("________________Const1_________________");
    crearCta1.depositar(5000);
    System.out.println("Su nuevo saldo es: "+crearCta1.getSaldo());
    crearCta1.retirar(16000);
    System.out.println("Su nuevo saldo es: "+crearCta1.getSaldo());
    crearCta1.retirar(4000);
    System.out.println("________________FinCons1_______________");









//
//    Estudiante estudiante1 = new Estudiante();
//    Estudiante estudiante2 = new Estudiante("Aleja","Paiva", 4554);
//
//    System.out.println("El estudiante 2 es " + estudiante2.getNombre());
//
//    //asignando variable
//    String apellido=estudiante2.getApellido();
//    System.out.println("El apellido es " + apellido);
//
//    estudiante1.setNombre("Paulo");
//    estudiante1.setApellido("Cohelo");
//    estudiante1.setCodigo(1223);
//
//    //Editar/Cambiar
//    estudiante2.setCodigo(5678);
//    System.out.println("El codigo del estudiante 2 es " + estudiante1.getCodigo());











//    //Usar el constructor vacío
//    Persona persona1 = new Persona();
//    System.out.println(persona1.nombre);
//
//    // construrctor lleno
//    Persona datosPersona= new Persona("Nicolay", "Tesla", 65);
//    System.out.println("impresión de datosPersona" + datosPersona.nombre );
//    datosPersona.mostrarInfo();
//






//    //Usar el constructor vacío
//    Auto auto1 = new Auto();
//    System.out.println(auto1.marca);
//
//    // construrctor lleno
//    Auto autoConParametros= new Auto("negro", "chevrolet", 2022);
//    System.out.println(autoConParametros.modelo);
//    autoConParametros.mostrarDatos();
























    //    //Creo mi objeto
//    Auto miCarro = new Auto();
//    //Asignamos valores
//    miCarro.color = "Rojo";
//    miCarro.modelo = 2025;
//    miCarro.marca = "Tesla";
//
//    System.out.println("El color es: " + miCarro.color);
//    System.out.println("El Modelo es: " + miCarro.modelo);
//    System.out.println("La marca es: " + miCarro.marca);
//
//
//
//    //Creo mi objeto
//    Auto miCarro2 = new Auto();
//    //Asignamos valores
//    miCarro2.color = "Azul";
//    miCarro2.modelo = 2022;
//    miCarro2.marca = "BMW";
//
//    System.out.println("El color es: " + miCarro2.color);
//    System.out.println("El Modelo es: " + miCarro2.modelo);
//    System.out.println("La marca es: " + miCarro2.marca);
//
//    //Usando métodos
//    miCarro.mostrarDatos();
//    miCarro.arrancar();
//
//    miCarro2.frenar();
//    miCarro2.mostrarDatos();



}
}
