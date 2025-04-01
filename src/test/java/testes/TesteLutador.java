package testes;

import jogo.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteLutador {
    @Test
    void testLutadorComPunhos() {
        Personagem lutador = new Lutador(new Punhos());
        assertEquals("Lutador ataque com os punhos!", lutador.lutar());
    }

    @Test
    void testLutadorComEspada() {
        Personagem lutador = new Lutador(new Espada());
        assertEquals("Lutador ataque com espada!", lutador.lutar());
    }

    @Test
    void testLutadorComMagia() {
        Personagem lutador = new Lutador(new Magia());
        assertEquals("Lutador ataque com magia!", lutador.lutar());
    }

    @Test
    void testLutadorComArco() {
        Personagem lutador = new Lutador(new Arco());
        assertEquals("Lutador ataque com arco e flecha!", lutador.lutar());
    }
}
