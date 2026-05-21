import java.util.*;

/**
 * Clase Transaccion
 * @author Sagnchez Solano Juan Cruz
 */

public class Transaccion{
    private Float monto;
    private String descripcion; 
    private Integer[] hora = new Integer[2];
<<<<<<< HEAD
    Fecha fecha;

    public Transaccion(float monto, String descripcion, int hora, int minuto){
        
        if(descripcion == null) throw new NullPointerException("Error: Descripcion no puede ser nulo");
        if(descripcion.isBlank()) throw new IllegalArgumentException("Error: Descripcion no puede estar en blanco");
        if(hora > 23 || hora < 00) throw new IllegalArgumentException("Error: Hora tiene que estar en el rango [00, 23]");
        if(minuto > 59 || minuto < 0) throw new IllegalArgumentException("Error: Minuto tiene que estar en el rango [00, 59]");
        this.monto = monto;
        this.fecha = new Fecha(23, 05, 2026);//Simulacion de fecha automatica"
        this.hora[0] = hora;
        this.hora[1] = minuto;
=======
    private String tipo;
    private Random rand = new Random();
    Fecha fecha;

    public Transaccion(float monto, String descripcion, String tipo){
        if(descripcion == null) throw new NullPointerException("Error: Descripcion no puede ser nulo");
        if(descripcion.isBlank()) throw new IllegalArgumentException("Error: Descripcion no puede estar en blanco");
        this.monto = monto;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.fecha = new Fecha(23, 05, 2026);//Simulacion de fecha automatica"
        this.hora[0] = rand.nextInt(24);//de 0 a 23
        this.hora[1] = rand.nextInt(60);//de 0 a 59
>>>>>>> 588835f1f7b30619b92285ff492a769a328b266f
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Fecha getFecha() {
        return fecha;
    }
<<<<<<< HEAD

    public Integer[] getHora(){
        return hora;
    }

    public Float getMonto() {
        return monto;
    }
    
    public String toString(){        
        return fecha.toString() + hora[0] + ":" + hora[1] + monto + "'" + descripcion + "'"; 
    }
=======
    
    public Integer[] getHora(){
        return hora;
    }

    public Float getMonto() {
        return monto;
    }
    
    public String toString(){        
        return fecha.toString() + hora[0] + ":" + hora[1] + monto + "'" + descripcion + "'"; 
    }

    public void realizarTransaccion(Cuenta cuenta){
        if(tipo.equals("extraccion")) cuenta.actualizarSaldo(monto*(-1));
        if(tipo.equals("deposito")) cuenta.actualizarSaldo(monto);  
    }
>>>>>>> 588835f1f7b30619b92285ff492a769a328b266f
}