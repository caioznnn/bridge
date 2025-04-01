package jogo;

public class Arqueiro extends Personagem {
    public Arqueiro(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String lutar() {
        return "Arqueiro " + ataque.atacar();
    }
}