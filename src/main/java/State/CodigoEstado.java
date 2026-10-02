package State;

public abstract class CodigoEstado {

    public abstract String getEstado();

    public boolean criar(Codigo codigo) { return false; }

    public boolean implementar(Codigo codigo) { return false; }

    public boolean atualizar(Codigo codigo) { return false; }

    public boolean deletar(Codigo codigo) { return false; }

    public boolean compartilhar( Codigo codigo ) { return false; }

}
