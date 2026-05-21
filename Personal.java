/**
 * Representa el personal del banco
 * Hereda el comportamiento de Persona
 * @author Rocio Garzon
 * @version 1.0
 */
public class Personal extends Persona{
    private String cargo;

    /**
     * Constructor de objetos de la clase Personal
     * @param dni del empleado
     * @param nombre del empleado
     * @param anio_ingreso al banco
     * @param cargo que tiene en el banco
     */
    public Personal(Integer dni, String nombre, Integer anio_ingreso, String cargo){
        super(dni, nombre, anio_ingreso);
        this.cargo = cargo;
    }

    /**
     * Setea el nombre del cargo del empleado
     * @param cargo 
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Retorna el cargo del empleado
     * @return cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Retorna una cadena con las caracteristicas del empleado
     * @return cadena de datos
     */
    String Descripcion(){
        return ToString() + ", " + cargo;
    }
}

