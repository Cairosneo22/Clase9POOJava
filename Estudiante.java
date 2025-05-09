package java9POOFundamentos;

public class Estudiante {
    private String nombre;
    private String apellido;
    private int codigo;

    public Estudiante() {}

    public Estudiante(String nombre, String apellido, int codigo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigo = codigo;
    }
//AQUÍ VAN GETT Y SETT


    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    //Método para que diga su nombre
    public void decirNombre() {
        System.out.println("El nombre es: " + nombre);

    }
}
