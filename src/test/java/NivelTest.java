import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NivelTest {


    @Test
    void deveRetornarEstruturaFase() {
        Nivel nivel = new Fase("Fase");

        assertEquals("Fase", nivel.getNome());
    }

    @Test
    void deveRetornarEstruturaFaseComTesouro() {
        Nivel nivel = new Tesouro(new Fase("Fase"));

        assertEquals("Fase/Tesouro", nivel.getNome());
    }

    @Test
    void deveRetornarEstruturaFaseComInimigo() {
        Nivel nivel = new Inimigo(new Fase("Fase"));

        assertEquals("Fase/Inimigo", nivel.getNome());
    }

    @Test
    void deveRetornarEstruturaFaseComMovel() {
        Nivel nivel = new Movel(new Fase("Fase"));

        assertEquals("Fase/Movel", nivel.getNome());
    }

    @Test
    void deveRetornarEstruturaFaseComTesouroMaisInimigo() {
        Nivel nivel = new Tesouro(new Inimigo (new Fase("Fase")));

        assertEquals("Fase/Inimigo/Tesouro", nivel.getNome());
    }

    @Test
    void deveRetornarEstruturaFaseComTesouroMaisMovel() {
        Nivel nivel = new Tesouro(new Movel (new Fase("Fase")));

        assertEquals("Fase/Movel/Tesouro", nivel.getNome());
    }

    @Test
    void deveRetornarEstruturaFaseComInimigoMaisMovel() {
        Nivel nivel = new Inimigo(new Movel (new Fase("Fase")));

        assertEquals("Fase/Movel/Inimigo", nivel.getNome());
    }

    @Test
    void deveRetornarEstruturaFaseComTesouroMaisInimigoMaisMovel() {
        Nivel nivel = new Tesouro (new Inimigo(new Movel (new Fase("Fase"))));

        assertEquals("Fase/Movel/Inimigo/Tesouro", nivel.getNome());
    }

}