package jogo;

public class Guerreiro extends Personagem {
    public Guerreiro(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String lutar() {
        return "Guerreiro " + ataque.atacar();
    }
}
