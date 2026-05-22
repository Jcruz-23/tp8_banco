/**
 * Representa una Persona
 * @author Rocio Garzon
 * @version 1.0
 */
public class Persona{
 private 
 Integer dni;
 String nombre;
 Integer anio_ingreso;
 
 /**
  * Constructor de objetos de la clase Persona
  * @param dni de la persona
  * @param nombre de la persona 
  * @param anio_ingreso al sistema
  */
 public Persona(Integer dni, String nombre, Integer anio_ingreso){
    this.dni = dni;
    this.nombre = nombre;
    this.anio_ingreso = anio_ingreso;
 }

 /**
  * Setea el anio de ingreso
  * @param anio_ingreso al sistema
  */
    public void setAnio_ingreso(Integer anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    /**
     * Setea el dni
     * @param dni de la persona
     */
    public void setDni(Integer dni) {
        this.dni = dni;
    }

    /**
     * Setea el nombre
     * @param nombre de la persona
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna el anio de ingreso
     * @return anio_ingreso al sistema
     */
    public Integer getAnio_ingreso() {
        return anio_ingreso;
    }

    /**
     * Retorna el dni
     * @return dni de la persona
     */
    public Integer getDni() {
        return dni;
    }
    
    /**
     * Retorna el nombre 
     * @return nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna una cadena de texto con los atributos de persona
     * @return cadena con atributos ingresados
     */
    String ToString(){
        return nombre + ", " + anio_ingreso + ", " + dni;
    }
}
