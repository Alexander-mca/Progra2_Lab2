public class Cuenta {
    private double saldo;

    public Cuenta(double saldo){
        this.saldo = saldo;
    }

    public void Depositar(double monto){
        this.saldo += monto; 
    }

    public void Retirar(double monto){
        
        if(this.saldo>=monto){
            this.saldo -= monto;
        }else{
            System.out.println("No es posible retirar la cantidad Solicitada.\nSaldo insuficiente. Monto a retirar Q"+monto);
        }
    }

    public void MostrarSaldo(){
        System.out.println("El saldo actual en la cuenta es de Q"+this.saldo);
    }
}
