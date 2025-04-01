package jogo;

public class Mago extends Personagem {
    public Mago(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String lutar() {
        return "Mago " + ataque.atacar();
    }
}
