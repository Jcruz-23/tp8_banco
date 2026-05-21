public class Extraccion extends Transaccion{
    public Extraccion(Float monto, String descripcion, Integer hora, Integer minuto){
        Super(monto, descripcion, hora, minuto);
    }

    void extraerDinero(String tipo_cuenta, Integer monto){             
    }
}