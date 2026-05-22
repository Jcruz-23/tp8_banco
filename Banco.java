import java.util.*;
import java.io.*;

public class Banco {
    private final ArrayList<Cliente> clientes;
    private final ArrayList<Personal> empleados;
    private final Random rand = new Random();

    public Banco(){
        clientes = new ArrayList<Cliente>();
        empleados = new ArrayList<Personal>();

    public void registrarCliente(Integer dni, String nombre, double saldo){
        buscarDniCliente(dni);
        if(nombre.equals("")) throw new IllegalArgumentException("Nombre no puede estar vacio");
        if(dni < 1000000 || dni > 48000000) throw new IllegalArgumentException("Dni no esta en el rango permitido");
        if(saldo<0) throw new IllegalArgumentException("Saldo no puede ser negativo");

        Cuenta cuentaDolares = new Cuenta("Dolares", rand.nextInt(10000), saldo, "activa");
        Cuenta cuentaPesos = new Cuenta("Pesos", rand.nextInt(10000), saldo, "activa");

        Cliente cliente = new Cliente(dni, nombre, 2026,rand.nextInt(10000), "Activo", cuentaDolares, cuentaPesos);
        clientes.add(cliente);
    }

    public void registarEmpleado(Integer dni, String nombre, String cargo){
        buscarDniEmpleado(dni);
        if(nombre.equals("")) throw new IllegalArgumentException("Nombre no puede estar vacio");
        if(dni < 10000000 || dni > 48000000) throw new  IllegalArgumentException("Dni no esta en el rango permitido");
        if(cargo.equals("")) throw new IllegalArgumentException("Cargo no puede estar vacio");
        Personal empleado = new Personal(dni, nombre, 2026, cargo);
        empleados.add(empleado);
    }
    
    public void listarTransacciones() throws IOException, FileNotFoundException{
        for(Cliente c : clientes){
            BufferedReader br = new BufferedReader(new FileReader(c.getNombre() + "_" + c.getDni()));
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
            }
            br.close();
        }
    }

    public void listarTransaccionesMes(String mes) throws IOException, FileNotFoundException{
        for(Cliente c : clientes){
            BufferedReader br = new BufferedReader(new FileReader(c.getNombre() + "_" + c.getDni()));
                String linea;
                while((linea = br.readLine()) != null){
                    if(linea.contains(mes)){
                        System.out.println(linea);
                    }
                }
                br.close();
            }
    }

    public void listarTransaccionesAnio(String anio) throws IOException, FileNotFoundException{
        for(Cliente c : clientes){
            BufferedReader br = new BufferedReader(new FileReader(c.getNombre() + "_" + c.getDni()));
                String linea;
                while((linea = br.readLine()) != null){
                    if(linea.contains(anio)){
                        System.out.println(linea);
                    }
                }
                br.close();
            }
    }

    public void listarClientes(){
        for(Cliente c : clientes){
            System.out.println(c.Descripcion());
        }
    }   
    public void listarPersonal(){
        for(Personal p : empleados){
            System.out.println(p.Descripcion());
        }
    }
    
    public void buscarDniEmpleado(Integer dni){
        for(Personal p : empleados){
            if(dni.equals(p.getDni())) throw new RuntimeException("Empleado ya existente");
        }
    }

    public void buscarDniCliente(Integer dni){
        for(Cliente c : clientes){
            if(dni.equals(c.getDni())) throw new RuntimeException("cliente ya existe"); 
        }
    }

    public void cambiarEstadoCliente(Integer dni, String estado) throws ClienteNoEncontradoEcxeption{
        if(estado.equals("") || (!estado.equals("activo") && !estado.equals("inactivo"))) throw new IllegalArgumentException("Estado no es valido"); 
        Cliente c = buscarCliente(dni);
        c.setEstado(estado);
    }
    
    /**
     * Busca un cliente por dni
     * @throws ClienteNoEncontradoEcxeption si no encuentra el cliente en el listado
     * @param dni del cliente a buscar
     */
    public Cliente buscarCliente(Integer dni) throws ClienteNoEncontradoException {
        for(Cliente c : clientes){
            if(c.getDni().equals(dni)){
            return c;
            }
        }
        throw new ProductoNoEncontradoException("No se econtro el cliente " + dni);
    }
}
}