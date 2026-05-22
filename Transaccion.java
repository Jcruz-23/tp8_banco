import java.util.*;

/**
 * Representa una transaccion
 * @author Sanchez Juan
 * @version 1.0
 */

public class Transaccion{
    private Integer monto;
    private Integer[] hora = new Integer[2];
    private String tipo;
    private Random rand = new Random();
    Fecha fecha;

    /**
     * Constructor de objetos de la clase Transaccion
     * @param monto de la Transaccion
     * @param tipo de transaccion
     */
    public Transaccion(Integer monto, String tipo){
        this.monto = monto;
        this.tipo = tipo;
        this.fecha = new Fecha(23, 05, 2026);//Simulacion de fecha automatica"
        this.hora[0] = rand.nextInt(24);//de 0 a 23
        this.hora[1] = rand.nextInt(60);//de 0 a 59
    }

    /**
     * @return Fecha de la transaccion
     */
    public Fecha getFecha() {
        return fecha;
    }
    
    /**
     * Retorna hora de la transaccion
     * @return Integer[]
     */
    public Integer[] getHora(){
        return hora;
    }

    /**
     * Retorna monto de la transaccion
     * @return Integer
     */
    public Integer getMonto() {
        return monto;
    }
    
    /**
     * Retorna descripcion de la transaccion
     * @return String 
     */
    public String ToString(){        
        return fecha.ToString() + ", " + hora[0] + ":" + hora[1] + ", " + monto;
    }

    /**
     * Realiza la extraccion o el deposito segun el tipo de transaccion
     * @param cuenta del cliente
     */
    public void realizarTransaccion(Cuenta cuenta){
        if(tipo.equals("extraccion")) cuenta.actualizarSaldo(monto*(-1));
        if(tipo.equals("deposito")) cuenta.actualizarSaldo(monto);  
    }
}