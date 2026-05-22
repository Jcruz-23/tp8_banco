/**
 * Representa la fecha
 * @author Sanchez Juan
 * @versionb 1.0
 */
public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anio;

    /**
     * Constructor de objetos de la clase Fecha
     * @param dia
     * @param mes
     * @param anio
     */
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    /**
     * Retorna el anio
     * @return Integer
     */
    public Integer getAnio() {
        return anio;
    }
    
    /**
     * Retorna el dia
     * @return Integer
     */
    public Integer getDia() {
        return dia;
    }

    /**
     * Retorna el mes
     * @return Integer
     */
    public Integer getMes() {
        return mes;
    }

    /**
     * Retorna descripcion de la fecha
     * @return String
     */
    public String ToString(){
        return dia + "/" + mes + "/" + anio;
    }
}
