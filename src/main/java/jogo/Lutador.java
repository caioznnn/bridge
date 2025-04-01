package jogo;

public class Lutador extends Personagem {
    public Lutador(Ataque ataque) {
        super(ataque);
    }

    @Override
    public String lutar() {
        return "Lutador " + ataque.atacar();
    }
}
