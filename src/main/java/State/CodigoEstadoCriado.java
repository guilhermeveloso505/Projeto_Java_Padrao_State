package State;

public class CodigoEstadoCriado extends CodigoEstado {

    private CodigoEstadoCriado() {};
    private static CodigoEstadoCriado instance = new CodigoEstadoCriado();
    public static CodigoEstadoCriado getInstance() { return instance; }

    public String getEstado() { return "Criado"; }

    public boolean implementar(Codigo codigo) {
        codigo.setEstado(CodigoEstadoImplementado.getInstance());
        return true;
    }

    public boolean deletar(Codigo codigo) {
        codigo.setEstado(CodigoEstadoDeletado.getInstance());
        return true;
    }

}
