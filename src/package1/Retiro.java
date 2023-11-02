package package1;

public class Retiro extends Menu_Opciones {
    
     @Override

    public void Transacciones() {

        System.out.print("--------------------------------------------------------"
                + "\n Cuánto dinero desea retirar? : ");
        
        // Se llama al método Retiro para obtener el número y transacciones guarda el saldo actual, para luego calcular el nuevo.
         Retiro();
         
         if(retiro <= getSaldo()){
         
          transacciones = getSaldo();
          setSaldo(transacciones - retiro);
          
          System.out.println("------------------------------------------------");
          System.out.println(" Usted ha retirado un total de S" + retiro);
          System.out.println(" Tu saldo es de $" + getSaldo());
          System.out.println("------------------------------------------------");
        
         }
         else{
         
         System.out.print(" Dinero insuficiente, intente con otro monto");
         System.out.println("--------------------------------------------");
         
         }
    }
}
