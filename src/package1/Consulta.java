package package1;

public class Consulta extends Menu_Opciones {

    @Override
    public void Transacciones() {

        System.out.println("--------------------------------------------------------"
                + "\n Tu saldo actual es de: " + getSaldo()
                + "\n--------------------------------------------------------");
    }
}
