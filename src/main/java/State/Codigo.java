package State;

public class Codigo {

    private String tipoArquivo;
    private CodigoEstado estado;

    public Codigo() { this.estado = CodigoEstadoCriado.getInstance(); }

    public void setEstado(CodigoEstado estado) { this.estado = estado; }

    public boolean criar() { return estado.criar(this); }

    public boolean implementar() { return estado.implementar(this); }

    public boolean atualizar() { return estado.atualizar(this); }

    public boolean deletar() { return estado.deletar(this); }

    public boolean compartilhar() { return estado.compartilhar(this); }

    public String getNomeEstado() { return estado.getEstado(); }

    public String getTipoArquivo() { return tipoArquivo; }

    public void setTipoArquivo(String tipoArquivo) { this.tipoArquivo = tipoArquivo; }

    public CodigoEstado getEstado() { return estado; }

}
