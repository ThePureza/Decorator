public abstract class NivelDecorator implements Nivel{
    private Nivel nivel;
    private String nome;

    public NivelDecorator (Nivel nivel) {
        this.nivel = nivel;
    }

    public Nivel getNivel() {
        return this.nivel;
    }

    public void setNivel(Nivel nivel){
        this.nivel = nivel;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public abstract String getComposicaoFase();

    public String getNome() {
        return this.nivel.getNome() + "/" + this.getComposicaoFase();
    }
}