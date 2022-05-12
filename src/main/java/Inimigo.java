public class Inimigo extends NivelDecorator {

    public Inimigo(Nivel nivel) {
        super(nivel);
    }

    public abstract String getComposicaoFase(){
        return "Inimigo"
    }
}