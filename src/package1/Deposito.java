package package1;

public class Deposito extends Menu_Opciones {

    @Override

    public void Transacciones() {

        System.out.print("--------------------------------------------------------"
                + "\n Cuánto dinero desea depositar? : ");
        
        // Se llama al método Deposito para obtener el número y transacciones guarda el saldo actual, para luego calcular el nuevo.
         Deposito();
          transacciones = getSaldo();
          setSaldo(transacciones + deposito);
          
          System.out.println("------------------------------------------------");
          System.out.println(" Usted ha depositado un total de S" + deposito);
          System.out.println(" Tu saldo es de $" + getSaldo());
          System.out.println("------------------------------------------------");
        
    }
}
