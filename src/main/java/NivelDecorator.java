public abstract class NivelDecorator implements Nivel{
    private Nivel nivel;

    public NivelDecorator (Nivel nivel) {
        this.nivel = nivel;
    }
}
