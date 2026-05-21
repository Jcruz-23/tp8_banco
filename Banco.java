import java.util.*;

public class Banco {
    private final ArrayList<Cliente> clientes;
    private final ArrayList<Transaccion> transacciones;
    private final Random rand = new Random();

    public Banco(){
        this.clientes = new ArrayList<Cliente>();
        this.transacciones = new ArrayList<Transaccion>();
    }

    public void registrarCliente(Integer dni, String nombre, double saldo){
        Cuenta cuentaDolares = new Cuenta("Dolares", rand.nextInt(10000), saldo, "Activa");
        Cuenta cuentaPesos = new Cuenta("Pesos", rand.nextInt(10000), saldo, "Activa");

        Cliente cliente = new Cliente(dni, nombre, 2026, "Activo", cuentaDolares, cuentaPesos);
        clientes.add(cliente);
    }
}
