import java.util.*;
import java.io.*;

public class Banco {
    private final ArrayList<Cliente> clientes;
    private final ArrayList<Personal> empleados;
    private final Random rand = new Random();

    public Banco(){
        this.clientes = new ArrayList<Cliente>();
        this.transacciones = new ArrayList<Transaccion>();
        this.empleados = new ArrayList<Personal>();
    }

    public void registrarCliente(Integer dni, String nombre, double saldo){

        Cuenta cuentaDolares = new Cuenta("Dolares", rand.nextInt(10000), saldo, "Activa");
        Cuenta cuentaPesos = new Cuenta("Pesos", rand.nextInt(10000), saldo, "Activa");

        Cliente cliente = new Cliente(dni, nombre, 2026,rand.nextInt(10000), "Activo", cuentaDolares, cuentaPesos);
        clientes.add(cliente);
    }

    public void registarEmpleado(Integer dni, String nombre, String cargo){
        Personal empleado = new Personal(dni, nombre, 2026, cargo);
        empleados.add(empleado);
    }
    
    public void listarTransaccionesClientes(){
        for(Cliente c : clientes){
            try(BufferedReader br = new BufferedReader(new FileReader(c.getNombre() + "_" + c.getDni))){
                String linea;
                while((linea = br.readLine()) != null){
                    linea = linea.replace(",", " ");
                    system.out.println(linea);
                }
            }
            
        }
        
    }
}


