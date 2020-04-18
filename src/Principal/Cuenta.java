
package Principal;
public class Cuenta {
   
    private int numeroCuenta;
    private double saldo = 0;

    
    String tipoTransacciones;

    

    public Cuenta(int numeroCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }


    public void transaccion(double cantidad, int tipoTransaccion){
        
        // DEPOSITO
        if(tipoTransaccion == 1){
            this.saldo += cantidad;
            
            tipoTransacciones = "Deposito";
        }
        
        // RETIRO
        if(tipoTransaccion == 2){
            if (this.saldo < cantidad ) {
                System.out.println("ERROR: Fondos Insuficientes");
                //this.saldo = 0;
            }else{
                this.saldo -= cantidad;
                tipoTransacciones = "Retiro";
            }
        }
        
        if(tipoTransaccion == 0){
            System.out.println("ERROR");
        }
    }
    
    public void ConsultaTransacc( ){
        System.out.println("El tipo de transaccion fue: " + tipoTransacciones + " Con el nuevo saldo: B/. " + saldo);
    }
    
    public void Consultar( ){
        System.out.println(" con el numero de Cuenta: " + numeroCuenta + " con un saldo total de: B/. " + saldo);
    }
}
