package State;

public class CodigoEstadoDeletado extends CodigoEstado {

    private CodigoEstadoDeletado() {};
    private static CodigoEstadoDeletado instance = new CodigoEstadoDeletado();
    public static CodigoEstadoDeletado getInstance() { return instance; }

    public String getEstado() { return "Deletado"; }

}
