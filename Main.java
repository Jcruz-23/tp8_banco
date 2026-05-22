import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        try{
        banco.registrarCliente(45589354, "Maria", 3568.25);
        banco.registrarCliente(29665741, "Ana", 98714.23);
        banco.registrarCliente(23587412, "Carlos", 896547.3);
        banco.registrarEmpleado(45879852, "Juan", "Limpieza");
        banco.registrarEmpleado(21054785, "Carlo", "Gerente");
        banco.cambiarEstadoCliente(29665741, "inactivo");
        banco.listarClientes();
        banco.listarPersonal();
        Cliente c = banco.buscarCliente(45589354);
        c.realizarTransaccion("pesos", 3000, "deposito");
        System.out.println("Datos del cliente: " + c.Descripcion());
        banco.listarTransaccionesCliente(2358741);
        banco.listarTransaccionesMes("5");
        banco.listarTransaccionesAnio("2026");
        banco.listarTransacciones();

        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }catch(RuntimeException ex){
            System.out.println("Error: " + ex.getMessage());
        }catch(FileNotFoundException exce){
            System.out.println("Error: " + exce.getMessage());
        }catch(ClienteNoEncontradoException excep){
            System.out.println("Error: " + excep.getMessage());
        }catch(IOException exc){
            System.out.println("Error: " + exc.getMessage());
        }
}
}