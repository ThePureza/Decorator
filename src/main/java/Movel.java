public class Movel extends NivelDecorator {

    public Movel(Nivel nivel) {
        super(nivel);
    }

    public abstract String getComposicaoFase(){
        return "Movel"
    }
}