/**
 * Clase Transaccion
 * @author Sagnchez Solano Juan Cruz
 */

public class Transaccion{
    private Float monto;
    private String descripcion; 
    private Integer[] hora = new Integer[2];
    Fecha fecha;

    public Transaccion(float monto, String descripcion, int hora, int minuto){
        setMonto(monto);
        setDescripcion(descripcion);
        this.fecha = new Fecha(23, 05, 2026);//Simulacion de fecha automatica"
        setHora(hora, minuto);   
    }
    
    public void setMonto(float monto){
        this.monto = monto;
    }

    public void setDescripcion(String descripcion) {
        if(descripcion == null) throw new NullPointerException("Error: Descripcion no puede ser nulo");
        if(descripcion.isBlank()) throw new IllegalArgumentException("Error: Descripcion no puede estar en blanco");
        this.descripcion = descripcion;
    }

    public void setHora(int hora, int minuto) {
        if(hora > 23 || hora < 00) throw new IllegalArgumentException("Error: Hora tiene que estar en el rango [00, 23]");
        if(minuto > 59 || minuto < 0) throw new IllegalArgumentException("Error: Minuto tiene que estar en el rango [00, 59]");
        this.hora[0] = hora;
        this.hora[1] = minuto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public float getMonto() {
        return monto;
    }
    
    public String toString(){        
        return fecha.toString() + hora[0] + ":" + hora[1] + monto + "'" + descripcion + "'"; 
    }
}