package testes;

import jogo.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteMago {
    @Test
    void testMagoComMagia() {
        Personagem mago = new Mago(new Magia());
        assertEquals("Mago ataque com magia!", mago.lutar());
    }

    @Test
    void testMagoComEspada() {
        Personagem mago = new Mago(new Espada());
        assertEquals("Mago ataque com espada!", mago.lutar());
    }

    @Test
    void testMagoComArco() {
        Personagem mago = new Mago(new Arco());
        assertEquals("Mago ataque com arco e flecha!", mago.lutar());
    }

    @Test
    void testMagoComPunhos() {
        Personagem mago = new Mago(new Punhos());
        assertEquals("Mago ataque com os punhos!", mago.lutar());
    }
}
