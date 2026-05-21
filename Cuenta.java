/**
 * Representa la cuenta de un cliente
 * @author Rocio Garzon
 * @version 1.0
 */
public class Cuenta {
    private 
    String tipo_cuenta;
    Integer nro_cuenta;
    double saldo;
    String estado;

    /**
     * Constructor de objetos de la clase cuenta
     * @param tipo_cuenta si es caja de ahorro en dolares o en pesos
     * @param nro_cuenta asignada por el banco
     * @param saldo dentro de la cuenta
     * @param estado si esta activa para operaciones o no
     */
    public Cuenta(String tipo_cuenta, Integer nro_cuenta, double saldo, String estado){
        this.tipo_cuenta = tipo_cuenta;
        this.nro_cuenta = nro_cuenta;
        this.saldo = saldo;
        this.estado = estado;
    }

    /**
     * Sete el numero de cuenta
     * @param nro_cuenta designado por el banco
     */
    public void setNro_cuenta(Integer nro_cuenta) {
        this.nro_cuenta = nro_cuenta;
    }

    /**
     * Setea el saldo de la cuenta
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Setea el tipo de cuenta que es
     * @param tipo_cuenta si es en pesos o en dolares
     */
    public void setTipo_cuenta(String tipo_cuenta) {
        this.tipo_cuenta = tipo_cuenta;
    }

    /**
     * Setea el estado de la cuenta si esta activo o inactivo
     * @param estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * Retorna el numero de cuenta
     * @return nro_cuenta
     */
    public Integer getNro_cuenta() {
        return nro_cuenta;
    }

    /**
     * Retorna el saldo que posee la cuenta
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Retorna el tipo de cuenta
     * @return tipo_cuenta
     */
    public String getTipo_cuenta() {
        return tipo_cuenta;
    }

    /**
     * Retorna el estado de la cuenta si es activo o inactivo
     * @return estado
     */
    public String getEstado() {
        return estado;
    }
    
    /**
     * Actualiza el saldo de la cuenta cuando se opera con ella
     * @param monto a extraer o depositar
     */
    public void actualizarSaldo(double monto){
        saldo+=monto;
    }
}
