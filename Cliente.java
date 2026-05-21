import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
/**
 * Representa un Cliente 
 * Hereda el comportamiento de Persona
 * @author Rocio Garzon
 * @version 1.0
 * 
 */
public class Cliente extends Persona{
    private 
    Integer nro_cliente;
    String estado;
    Cuenta cuentaDolares;
    Cuenta cuentaPesos;

    /**
     * Constructor de objetos de la clase Cliente
     * @param dni del cliente
     * @param nombre del cliente
     * @param anio_ingreso como cliente del banco
     * @param nro_cliente del banco
     * @param estado si aun es cliente o no
     * @param cuenta la cuenta que le fue asignada 
     */
    public Cliente(Integer dni, String nombre, Integer anio_ingreso, Integer nro_cliente, String estado, Cuenta cuentaDolares, Cuenta cuentaPesos){
        super(dni, nombre, anio_ingreso);
        this.nro_cliente = nro_cliente;
        this.estado = estado;
        this.cuentaPesos = cuentaPesos;
        this.cuentaDolares = cuentaDolares;
    }

    /**
     * Setea el numero de cliente
     * @param nro_cliente
     */
    public void setNro_cliente(Integer nro_cliente) {
        this.nro_cliente = nro_cliente;
    }

    /**
     * Setea si el cliente esta activo o no
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * Retorna el estado del cliente con el banco
     * @return estado activo o inactivo
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Retorna el numero de cliente 
     * @return nro_cliente dado por el banco
     */
    public Integer getNro_cliente() {
        return nro_cliente;
    }

    public 
    /**
     * Permite que el cliente ejecute una transaccion de deposito o extraccion en su cuenta de pesos o dolares
     * @param monto que se desee extraer o depositar
     * @param tipo_transaccion si es extraccion o deposito
     * @throws IllegalStateException si se intenta operar en una cuenta inactiva o con un cliente inactivo
     * @throws IllegalArgumentException si se intenta operar una transaccion no permitida o si el monto a operar es no valido
     */
    void realizarTransaccion(Cuenta cuenta, Integer monto, String tipo_transaccion){

        if(cuenta.getEstado().equals("inactivo") || getEstado().equals("inactivo")){
            throw new IllegalStateException("La cuenta no esta activa");
        }
        if(!tipo_transaccion.equals("deposito") && !tipo_transaccion.equals("Deposito") && !tipo_transaccion.equals("transaccion") && !tipo_transaccion.equals("Transaccion")) {
        throw new IllegalArgumentException("El tipo de transaccion no es valido");
        }
        if(monto <= 0){
            throw new IllegalArgumentException("El monto de transaccion no puede ser menor o igual a cero");
        }
        if(tipo_cuenta.equals("pesos")){
        Transaccion transaccion = new Transaccion(monto, tipo_transaccion);
        transaccion.realizarTransaccion(cuentaPesos);
        }else if(tipo_cuenta.equals("dolares")){
            Transaccion transaccion = new Transaccion(monto, tipo_transaccion);
        transaccion.realizarTransaccion(cuentaDolares);
        }
        actualizarArchivo(transaccion.ToString());
    }

    /**
     * Ingresa la transaccion realizada a por el cliente a un archivo de texto
     * @param datos con las caracteristicas de la transaccion
     * @throws IOException si el archivo tiene algun error
     */
    private void actualizarArchivo(String datos) throws IOException{
        FileWriter a = new FileWriter(getNombre() + "_" + getDni(), true);
        BufferedWriter b = new BufferedWriter(a);
        b.write(datos);
        b.newLine();
        b.close();
    }

    /**
     * Retorna en una cadena los datos del cliente
     * @return cadena con datos 
     */
    public String Descripcion(){
        return ToString() + nro_cliente + ", " + estado ;
    }
}
