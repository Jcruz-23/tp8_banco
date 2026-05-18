/**
 * Clase Transaccion
 * @author Sanchez Solano Juan Cruz
 */

public class Transaccion{
    private float monto;
    private String descripcion; 
    private int hora;
    Fecha fecha;

    public Transaccion(float monto, Fecha fecha, String descripcion, int hora){
        this.monto = monto;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;   
    }
    
    public void setMonto(float monto){
        this.monto = monto;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setHora(int hora) {
        this.hora = hora;
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
}