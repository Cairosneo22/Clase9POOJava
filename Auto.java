package java9POOFundamentos;

public class Auto {
    //Crear los atributos
    String color;
    String marca;
    int modelo;

    //Constructores
    //Características: Mismo nombre de la clase, no lleva void, no retorna algo, debe ser public
    //Constructor vacío

    public Auto() {
        this.marca = "Desconocido";

            }
    //Constructor lleno
    public Auto(String color, String marca, int modelo) {
        this.color = color; //This para diferenciar lo que va a entrar de los atributos
        this.modelo = modelo;
        this.marca = marca;
    }


    //crear los métodos

    public void arrancar(){
        System.out.println("El auto arrancó, el " + color);
    }
    public void frenar(){
        System.out.println("El auto Frenó");
    }

    //Mostrar datos
    public void mostrarDatos(){
        System.out.println("===Datos del auto===");
        System.out.println("color: " + color);
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
    }
}
