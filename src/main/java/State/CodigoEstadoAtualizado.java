package State;

public class CodigoEstadoAtualizado extends CodigoEstado {

    private CodigoEstadoAtualizado() {};
    private static CodigoEstadoAtualizado instance = new CodigoEstadoAtualizado();
    public static CodigoEstadoAtualizado getInstance() { return instance; }

    public String getEstado() { return "Atualizado"; }

    public boolean deletar(Codigo codigo) {
        codigo.setEstado(CodigoEstadoDeletado.getInstance());
        return true;
    }

    public boolean compartilhar(Codigo codigo) {
        codigo.setEstado(CodigoEstadoCompartilhado.getInstance());
        return true;
    }

    public boolean atualizar(Codigo codigo) {
        codigo.setEstado(CodigoEstadoAtualizado.getInstance());
        return true;
    }

}
