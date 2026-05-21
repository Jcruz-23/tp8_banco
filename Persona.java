<<<<<<< HEAD
public class Persona{
=======
public class Persona {
>>>>>>> 27b1da735889c65e2a8a94cc1b588ecee9721867
 private 
 int dni;
 String nombre;
 int anio_ingreso;
 
 
 public Persona(int dni, String nombre, int anio_ingreso){
    this.dni = dni;
    this.nombre = nombre;
    this.anio_ingreso = anio_ingreso;
 }

    public void setAnio_ingreso(int anio_ingreso) {
        this.anio_ingreso = anio_ingreso;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio_ingreso() {
        return anio_ingreso;
    }

    public int getDni() {
        return dni;
    }
    
    public String getNombre() {
        return nombre;
    }
<<<<<<< HEAD
}
=======

    String toString(){
        return nombre + ", " + anio_ingreso + ", " + dni;
    }
}
>>>>>>> 27b1da735889c65e2a8a94cc1b588ecee9721867
