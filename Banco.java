import java.util.*;
import java.io.*;

/** 
* Representa al banco
*@author Sanchez Juan, Rocio Garzon
*/
public class Banco {
    private final ArrayList<Cliente> clientes;
    private final ArrayList<Personal> empleados;
    private final Random rand = new Random();


    /**
     * Constructor de objetos de la clase Banco
     */
    public Banco(){
        clientes = new ArrayList<Cliente>();
        empleados = new ArrayList<Personal>();
    }

    /**
     * Ingresa un objeto cliente al ArrayList clientes
     * @param dni del cliente
     * @param nombre del cliente
     * @param saldo de las cuentas del cliente  
     */
    public void registrarCliente(Integer dni, String nombre, Double saldo_pesos, Double saldo_dolares){
        buscarDniCliente(dni);
        if(nombre.equals("")) throw new IllegalArgumentException("Nombre no puede estar vacio");
        if(dni < 1000000 || dni > 48000000) throw new IllegalArgumentException("Dni no esta en el rango permitido");
        if(saldo_pesos < 0) throw new IllegalArgumentException("Saldo no puede ser negativo");
        if(saldo_dolares < 0) throw new IllegalArgumentException("Saldo no puede ser negativo");

        Cuenta cuentaDolares = new Cuenta("Dolares", rand.nextInt(10000), saldo_dolares, "activa");
        Cuenta cuentaPesos = new Cuenta("Pesos", rand.nextInt(10000), saldo_pesos, "activa");

        Cliente cliente = new Cliente(dni, nombre, 2026,rand.nextInt(10000), "Activo", cuentaDolares, cuentaPesos);
        clientes.add(cliente);
    }

    /**
     * Ingresa un objeto Personal al ArrayList empleados
     * @param dni del empleado
     * @param nombre del empleado
     * @param cargo del empleado 
     */
    public void registrarEmpleado(Integer dni, String nombre, String cargo){
        buscarDniEmpleado(dni);
        if(nombre.equals("")) throw new IllegalArgumentException("Nombre no puede estar vacio");
        if(dni < 10000000 || dni > 48000000) throw new  IllegalArgumentException("Dni no esta en el rango permitido");
        if(cargo.equals("")) throw new IllegalArgumentException("Cargo no puede estar vacio");
        Personal empleado = new Personal(dni, nombre, 2026, cargo);
        empleados.add(empleado);
    }
    
    /**
     * Muestra todas las transacciones de todos los clientes
     * @throws IOException Si hay un error al usar el archivo
     * @throws FileNotFoundException Si no se encuentra el archivo
     */
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

    /**
     * Muestra todas las transacciones de un mes
     * @param mes de las transacciones
     * @throws IOException Si hay un error al usar el archivo
     * @throws FileNotFoundException Si no se encuentra el archivo
     */
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

    /**
     * Muestra todas las transacciones de un anio
     * @param anio de las transacciones
     * @throws IOException Si hay un error al usar el archivo
     * @throws FileNotFoundException Si no se encuenta el archivo
     */
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
    /**
     * Muestra todas las transacciones de un cliente 
     * @param dni del cliente
     * @throws IOException Si hay un error al usar el archivo
     * @throws FileNotFoundException Si no se encuentra el archivo
     */
    public void listarTransaccionesCliente(Integer dni) throws IOException, FileNotFoundException{
        for (Cliente c : clientes){
            if(c.getDni().equals(dni)){
            BufferedReader br = new BufferedReader(new FileReader(c.getNombre() + "_" + c.getDni()));
            String linea;
            while((linea = br.readLine()) != null){
                System.out.println(linea);
                }
            br.close();
            }
        }    
    }
    
    /**
     * Muestra todos los clientes agregados 
     */
    public void listarClientes(){
        for(Cliente c : clientes){
            System.out.println(c.Descripcion());
        }
    }   
    /**
     * Muestra todos los empleados agregados
     */
    public void listarPersonal(){
        for(Personal p : empleados){
            System.out.println(p.Descripcion());
        }
    }
    

    private void buscarDniEmpleado(Integer dni){
        for(Personal p : empleados){
            if(dni.equals(p.getDni())) throw new RuntimeException("Empleado ya existente");
        }
    }

    private void buscarDniCliente(Integer dni){
        for(Cliente c : clientes){
            if(dni.equals(c.getDni())) throw new RuntimeException("cliente ya existe"); 
        }
    }

    /**
     * Actualiza el estado de un cliente
     * @param dni del cliente
     * @param estado al que quieres cambiar
     * @throws ClienteNoEncontradoException si el cliente no se encuentra
     */
    public void cambiarEstadoCliente(Integer dni, String estado) throws ClienteNoEncontradoException{
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
        throw new ClienteNoEncontradoException("No se econtro el cliente " + dni);
    }
}