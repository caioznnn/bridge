package jogo;

public abstract class Personagem {
    protected Ataque ataque;

    public Personagem(Ataque ataque) {
        this.ataque = ataque;
    }

    public abstract String lutar();
}

