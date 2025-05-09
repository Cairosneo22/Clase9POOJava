package java9POOFundamentos;

public class Auto2 {

    private String marca;
    private String modelo;
    private int anio;
    private int kilometraje;
    private boolean detallado;
    private int pruebaM;

    public Auto2() {
       }


    public Auto2(String marca, String modelo, int anio, int kilometraje, boolean detallado) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.kilometraje = kilometraje;
    }

//SET/GET

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public void setDetallado(boolean detallado) {
        this.detallado = detallado;
    }

    public void setPruebaM(int pruebaM) {
        this.pruebaM = pruebaM;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnio() {
        return anio;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public boolean isDetallado() {
        return detallado;
    }

    public int getPruebaM() {
        return pruebaM;
    }



    public void mostrarInformacion(){
        if(detallado==true){
        System.out.println("===Datos del auto===");
        System.out.println("color: " + marca);
        System.out.println("marca: " + modelo);
        System.out.println("modelo: " + anio);
        System.out.println("Kilometraje: " + kilometraje);}
        else{System.out.println("===Datos del auto===");
            System.out.println("color: " + marca);
            System.out.println("marca: " + modelo);
            System.out.println("modelo: " + anio);
        }

        }
    public void actualizarKilometraje(int pruebaM){
         if(pruebaM>0){
             System.out.println("Su anterior kilometraje era: " +kilometraje+" Y su recorrido fue: "+pruebaM);
             this.kilometraje+=pruebaM;
        System.out.println("Su nuevo Kilometraje es: " + kilometraje);}
         else{System.out.println("No se puede hacer ese tipo de recorrido");}
    }
}
