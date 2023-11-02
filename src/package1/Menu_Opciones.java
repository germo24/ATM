package package1;

import java.util.Scanner;

public abstract class Menu_Opciones {

    protected int retiro, deposito, transacciones;
    private static int Saldo;
    Scanner entrada = new Scanner(System.in);

    public void Opciones_Operacion() {

        // "bandera" funciona como un booleano para cancelar el ciclado del programa.
        int bandera = 0;
        int Opciones = 0;

        do {
            do {
                System.out.println("-----------------------------------------------------");
                System.out.println(" Por favor seleccione la operación que dea realizar: ");
                System.out.println("      1. Consulta de saldo. ");
                System.out.println("      2. Deposito de efectivo.");
                System.out.println("      3. Retiro de efectivo. ");
                System.out.println("      4. Salir. ");
                System.out.println("-----------------------------------------------------");
                Opciones = entrada.nextInt();

                switch (Opciones) {

                    case 1:

                        Menu_Opciones mensajeroC = new Consulta();
                         mensajeroC.Transacciones();
                          break;

                    case 2:

                        Menu_Opciones mensajeroD = new Deposito();
                         mensajeroD.Transacciones();
                          break;

                    case 3:

                        Menu_Opciones mensajeroR = new Retiro();
                         mensajeroR.Transacciones();
                          break;

                    case 4:

                        Menu_Opciones mensajeroE = new Exit();
                         mensajeroE.Transacciones();
                          bandera = 2;
                           break;

                    default:
                        
                        System.out.println(" La opción seleccionada es invalida, intentelo nuevamente");
                         break;
                }

            } while (bandera == 0);

        } while (bandera != 2);
    }

    // Método abstracto para el Polimorfismo.
    public abstract void Transacciones();

    // Método para pedir el número a retirar y guardarlo.    
    public void Retiro() {
        retiro = entrada.nextInt();
    }

    // Método para pedir el número a depositar y guardarlo.    
    public void Deposito() {
        deposito = entrada.nextInt();
    }

    // Método para obtener el saldo encapsulado (que debe mantenerse así porque es un dato frágil).
    public int getSaldo() {
        return Saldo;
    }

    // Método para cambiar el saldo encapsulado.
    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }
}
