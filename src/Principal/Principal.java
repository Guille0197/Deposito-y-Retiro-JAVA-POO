
package Principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
      
        String nombre; 
        String apellido;
        String telefono;        
        String direccion;
        String email;
        
        int tipoTransaccion;
        double cantidad;
        
        int numeroCuenta;
        double saldo;
        
        int respuesta;
        
        Scanner reader = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|******************************** BIENVENIDO ***********************************|");
        System.out.println("---------------------------------------------------------------------------------");
        
        System.out.println("---- Registro de datos del Cliente No.1 ----");
        
        System.out.println("Ingrese el nombre:");
        nombre = reader.next();

        System.out.println("Ingrese el apellido:");
        apellido = reader.next();

        System.out.println("Ingrese el telefono:");
        telefono = reader.next();

        System.out.println("Ingrese la direccion:");
        direccion = reader.next();

        System.out.println("Ingrese el email:");
        email = reader.next();
        
        // Datos para la Clase Cuenta
        System.out.println("*************************************************************************");
                
        System.out.println("Ingrese el saldo inicial del cliente No.1:");
        saldo = reader.nextDouble();

        System.out.println("Ingrese el numero de cuenta del cliente No.1:");
        numeroCuenta = reader.nextInt();

        // Constructores
        Persona p1 = new Persona(nombre, apellido, telefono, direccion, email);
        Cuenta c1 = new Cuenta(numeroCuenta, saldo);
        
        System.out.println("\n");
        
        System.out.println("*************************************************************************");
        
        System.out.println("---- Registro de datos del Cliente No.2 ----");
        
        System.out.println("Ingrese el nombre:");
        nombre = reader.next();

        System.out.println("Ingrese el apellido:");
        apellido = reader.next();

        System.out.println("Ingrese el telefono:");
        telefono = reader.next();

        System.out.println("Ingrese la direccion:");
        direccion = reader.next();

        System.out.println("Ingrese el email:");
        email = reader.next();
        
        // Datos para la Clase Cuenta
        System.out.println("*************************************************************************");
                
        System.out.println("Ingrese el saldo inicial del cliente No.2:");
        saldo = reader.nextDouble();

        System.out.println("Ingrese el numero de cuenta del cliente No.2:");
        numeroCuenta = reader.nextInt();

        // Constructores
        Persona p2 = new Persona(nombre, apellido, telefono, direccion, email);
        Cuenta c2 = new Cuenta(numeroCuenta, saldo);

        
        System.out.println("\n");
        
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|****************************** TRANSACCIONES **********************************|");
        System.out.println("---------------------------------------------------------------------------------");
        
            
            System.out.println("*********** CLIENTE NO.1 **********");
            respuesta = 1;
            // WHILE CLIENTE 1
            while(respuesta != 2 ){
                
                System.out.println("Tipo de Transaccion del Cliente No.1: [1-Depósito o 2- Retirar]: ");
                tipoTransaccion = sc.nextInt();

                System.out.println("Monto de la Transaccion del cliente No.1: ");
                cantidad = sc.nextDouble();

                c1.transaccion(cantidad, tipoTransaccion);

                System.out.println("*************************************************************************");
                c1.ConsultaTransacc();
                System.out.println("*************************************************************************");
                
                System.out.println("Desea registrar otra transaccion para el cliente No.1? (1-SI O 2-NO):");
                respuesta = sc.nextInt();
            } 
            
            System.out.println("\n");
            
            
            System.out.println("*********** CLIENTE NO.2 **********");
            respuesta =1;
            // WHILE CLIENTE 2
            while(respuesta != 2 ){
                System.out.println("Tipo de Transaccion del Cliente No.2: [1-Depósito o 2- Retirar]:");
                tipoTransaccion = sc.nextInt();

                System.out.println("Monto de la Transaccion del cliente No.2: ");
                cantidad = sc.nextDouble();

                c2.transaccion(cantidad, tipoTransaccion);

                System.out.println("*************************************************************************");
                c2.ConsultaTransacc();
                System.out.println("*************************************************************************");
                
                System.out.println("Desea registrar otra transaccion para los dos clientes No.2? (1-SI O 2-NO):");
                respuesta = sc.nextInt();
            } 
            System.out.println("\n");
        
        System.out.println("---------------------------------------------------------------------------------");
        
        p1.Consultar();
        c1.Consultar(); 
        p2.Consultar();
        c2.Consultar();
    }
}
