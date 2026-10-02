package State;

public class CodigoEstadoImplementado extends CodigoEstado {

    private CodigoEstadoImplementado() {};
    private static CodigoEstadoImplementado instance = new CodigoEstadoImplementado();
    public static CodigoEstadoImplementado getInstance() { return instance; }

    public String getEstado() { return "Implementado"; }

    public boolean atualizar(Codigo codigo) {
        codigo.setEstado(CodigoEstadoAtualizado.getInstance());
        return true;
    }

    public boolean deletar(Codigo codigo) {
        codigo.setEstado(CodigoEstadoDeletado.getInstance());
        return true;
    }

    public boolean compartilhar(Codigo codigo) {
        codigo.setEstado(CodigoEstadoCompartilhado.getInstance());
        return true;
    }

}
