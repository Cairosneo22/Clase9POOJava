package java9POOFundamentos;

public class Persona {
        //Crear los atributos
        String nombre;
        String apellido;
        int edad;

        //Constructores
        //Características: Mismo nombre de la clase, no lleva void, no retorna algo, debe ser public
        //Constructor vacío

        public Persona() {
            this.nombre = "Ene Ene";
        }

        //Constructor lleno
        public Persona(String nombre, String apellido, int edad) {
            this.nombre = nombre; //This para diferenciar lo que va a entrar de los atributos
            this.apellido = apellido;
            this.edad = edad;
        }

        //crear los métodos

        public void hobbies() {
            System.out.println("Le gusta bailar a" + nombre);
        }

        public void deporte() {
            System.out.println("Le gusta correr a" + apellido);
        }

        //Mostrar datos
        public void mostrarInfo() {
            System.out.println("--Datos generales--");
            System.out.println("Tu Nombre es: " + nombre);
            System.out.println("Tu Apellido es: " + apellido);
            System.out.println("y Claro, tu Edad: " + edad);


        }
    }