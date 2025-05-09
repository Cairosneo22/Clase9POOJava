package java9POOFundamentos;

public class CuentaBancaria {
    private String tipoCuenta;
    private String nombreTitular;
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria() {}

    public CuentaBancaria(String tipoCuenta, String nombreTitular, int numeroCuenta, double saldo) {
        this.tipoCuenta=tipoCuenta;
        this.nombreTitular=nombreTitular;
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;

        }

        //GET/SET


    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }


    //Métodos
    public void depositar(double monto){
if(monto>0){
    this.saldo+=monto;
    System.out.println("Usted ha depositado: "+monto);
}else{
    System.out.println("Monto inválido");
}

    }

    public void retirar(double monto){
if(saldo>0 && saldo>=monto){
    this.saldo-=monto;
    System.out.println("Usted ha Retirado: "+monto);
}else{
    System.out.println("Usted intentó retirar: "+monto+" Y no cuenta con ese saldo");
}
}

public void mostrarDatosCuenta(){
        System.out.println("Tipo: "+tipoCuenta);
        System.out.println("Titular: "+nombreTitular);
        System.out.println("Numero: "+numeroCuenta);
        System.out.println("Saldo: "+saldo);
}

}
