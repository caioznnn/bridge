package testes;

import jogo.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteArqueiro {
    @Test
    void testArqueiroComArco() {
        Personagem arqueiro = new Arqueiro(new Arco());
        assertEquals("Arqueiro ataque com arco e flecha!", arqueiro.lutar());
    }

    @Test
    void testArqueiroComEspada() {
        Personagem arqueiro = new Arqueiro(new Espada());
        assertEquals("Arqueiro ataque com espada!", arqueiro.lutar());
    }

    @Test
    void testArqueiroComMagia() {
        Personagem arqueiro = new Arqueiro(new Magia());
        assertEquals("Arqueiro ataque com magia!", arqueiro.lutar());
    }

    @Test
    void testArqueiroComPunhos() {
        Personagem arqueiro = new Arqueiro(new Punhos());
        assertEquals("Arqueiro ataque com os punhos!", arqueiro.lutar());
    }
}
