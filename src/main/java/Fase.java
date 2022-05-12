public class Fase implements Nivel{
    private String nome;

    public Fase(String nome){
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}
