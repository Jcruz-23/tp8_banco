import java.util.*;

/**
 * Clase Transaccion
 * @author Sagnchez Solano Juan Cruz
 */

public class Transaccion{
    private Float monto;
    private String descripcion; 
    private Random rand = new Random();
    private Integer[] hora = new Integer[2];
    Fecha fecha;

    public Transaccion(float monto, String descripcion){
        if(descripcion == null) throw new NullPointerException("Error: Descripcion no puede ser nulo");
        if(descripcion.isBlank()) throw new IllegalArgumentException("Error: Descripcion no puede estar en blanco");
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = new Fecha(23, 05, 2026);//Simulacion de fecha automatica"
        this.hora[0] = rand.nextInt(24)//de 0 a 23
        this.hora[1] = rand.nextInt(60);//de 0 a 59
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Fecha getFecha() {
        return fecha;
    }
    
    public Integer[] getHora(){
        return hora;
    }

    public Float getMonto() {
        return monto;
    }
    
    public String toString(){        
        return fecha.toString() + hora[0] + ":" + hora[1] + monto + "'" + descripcion + "'"; 
    }


}