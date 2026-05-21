public class Personal extends Persona{
    private String cargo;

    public Personal(Integer dni, String nombre, Integer anio_ingreso, String estado, String cargo){
        super(dni, nombre, anio_ingreso, estado);
        this.cargo = cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getCargo() {
        return cargo;
    }

    String toString(){
        return nombre + ", " + anio_ingreso + ", " + dni + ", " + cargo + ", " + estado ;
    }
}

