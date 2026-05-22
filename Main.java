
public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        try(){
        banco.registrarCliente(45589354, "Maria", 3658.25);
        banco.registrarCliente(29665741, "Ana", 98714.23);
        banco.registrarCliente(23587412, "Carlos", 896547.3, "Cajero");
        banco.registrarEmpleado(45879852, "Juan", 251.3, "Limpieza");
        banco.registrarEmpleado(21054785, "Carlo", 3.2, "Gerente");
        banco.cambiarEstado(29665741, "inactivo");
        banco.listarClientes();
        banco.listarPersonal();
        banco.listarTransaccionesCliente(2358741);
        banco.listarTransaccionesMes(5);
        banco.TransaccionesAnio(2026);
        banco.listarTransacciones();

        Cliente c = banco.buscarCliente(45589354);
        c.realizarTransaccion("pesos", 3000, "deposito");
        System.out.println("Datos del cliente: " + c.descripcion());
        }catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }catch(RuntimeException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
