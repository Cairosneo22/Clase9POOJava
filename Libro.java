package java9POOFundamentos;

public class Libro {

    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean disponible = true;

    public Libro() {
    }

    public Libro(String titulo, String autor, int anioPublicacion, boolean disponible) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.disponible = disponible;
    }


    //GET/SET


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void prestar() {
        if (disponible == true) {
            this.disponible = false;
            System.out.println("Usted ha Retirado el libro: " + titulo);
        } else {
            System.out.println("El libro que requieres no esta disponible: ");
        }
    }


    public void devolver() {
        if (disponible == false) {
            this.disponible = true;
            System.out.println("Gracias por devolvernos el libro : " + titulo);
        } else {
            System.out.println("El libro que traes no es nuestro");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("El año de Publicacion es : " + anioPublicacion);
        System.out.println("Se encuentra disponible: ");


    }
}
