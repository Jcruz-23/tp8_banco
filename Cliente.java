public class Cliente extends Persona{
    private 
    Integer nro_cliente;
    String estado;

    public Cliente(Integer dni, String nombre, Integer anio_ingreso, Integer nro_cliente, String estado){
        super(dni, nombre, anio_ingreso);
        this.nro_cliente = nro_cliente;
        this.estado = estado;
    }

    public void setNro_cliente(Integer nro_cliente) {
        this.nro_cliente = nro_cliente;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public Integer getNro_cliente() {
        return nro_cliente;
    }

    void realizarTransaccion(String tipo_cuenta, Integer monto, String tipo_transaccion){
        Transaccion deposito = new Transaccion(monto);
        transaccion.realizarTransaccion(tipo_cuenta, tipo_transaccion);
    }

    String Descripcion(){
        return toString() + nro_cliente + ", " + estado ;
    }
}
