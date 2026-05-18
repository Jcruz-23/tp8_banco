public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public int getAño() {
        return año;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String ToString(){
        return dia + "/" + mes + "/" + año;
    }
}
