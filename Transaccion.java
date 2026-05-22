import java.util.*;

/**
 * Clase Transaccion
 * @author Sagnchez Solano Juan Cruz
 */

public class Transaccion{
    private Integer monto;
    private Integer[] hora = new Integer[2];
    private String tipo;
    private Random rand = new Random();
    Fecha fecha;

    public Transaccion(Integer monto, String tipo){
        this.monto = monto;
        this.tipo = tipo;
        this.fecha = new Fecha(23, 05, 2026);//Simulacion de fecha automatica"
        this.hora[0] = rand.nextInt(24);//de 0 a 23
        this.hora[1] = rand.nextInt(60);//de 0 a 59
    }

    public Fecha getFecha() {
        return fecha;
    }
    
    public Integer[] getHora(){
        return hora;
    }

    public Integer getMonto() {
        return monto;
    }
    
    public String ToString(){        
        return fecha.toString() + hora[0] + ":" + hora[1] + monto;
    }

    public void realizarTransaccion(Cuenta cuenta){
        if(tipo.equals("extraccion")) cuenta.actualizarSaldo(monto*(-1));
        if(tipo.equals("deposito")) cuenta.actualizarSaldo(monto);  
    }
}