package testes;

import jogo.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TesteGuerreiro {
    @Test
    void testGuerreiroComEspada() {
        Personagem guerreiro = new Guerreiro(new Espada());
        assertEquals("Guerreiro ataque com espada!", guerreiro.lutar());
    }

    @Test
    void testGuerreiroComMagia() {
        Personagem guerreiro = new Guerreiro(new Magia());
        assertEquals("Guerreiro ataque com magia!", guerreiro.lutar());
    }

    @Test
    void testGuerreiroComArco() {
        Personagem guerreiro = new Guerreiro(new Arco());
        assertEquals("Guerreiro ataque com arco e flecha!", guerreiro.lutar());
    }

    @Test
    void testGuerreiroComPunhos() {
        Personagem guerreiro = new Guerreiro(new Punhos());
        assertEquals("Guerreiro ataque com os punhos!", guerreiro.lutar());
    }
}
