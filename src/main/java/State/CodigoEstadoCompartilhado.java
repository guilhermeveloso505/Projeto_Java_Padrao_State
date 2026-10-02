package State;

public class CodigoEstadoCompartilhado extends CodigoEstado {

    private CodigoEstadoCompartilhado() {};
    private static CodigoEstadoCompartilhado instance = new CodigoEstadoCompartilhado();
    public static CodigoEstadoCompartilhado getInstance() { return instance; }

    public String getEstado() { return "Compartilhado"; }

    public boolean atualizar(Codigo codigo) {
        codigo.setEstado(CodigoEstadoAtualizado.getInstance());
        return true;
    }

    public boolean deletar(Codigo codigo) {
        codigo.setEstado(CodigoEstadoDeletado.getInstance());
        return true;
    }

}
