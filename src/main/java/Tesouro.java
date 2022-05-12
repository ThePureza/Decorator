public class Tesouro extends NivelDecorator {

    public Tesouro(Nivel nivel) {
        super(nivel);
    }

    public abstract String getComposicaoFase(){
        return "Tesouro"
    }
}