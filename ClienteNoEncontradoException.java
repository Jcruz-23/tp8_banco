public class ClienteNoEncontradoException extends Exception{
    /**
     * Constructor de objetos de la clase ClienteNoEncontradoException
     * @param mensaje de la causa de la excepcion
     */
    public ClienteNoEncontradoException(String mensaje) {
        super(mensaje);
    }
}