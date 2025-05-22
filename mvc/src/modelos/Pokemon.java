package modelos;

public class Pokemon {
    private short vida;
    private short ataque;
    private Tipo tipo;

    public Pokemon(short vida, short ataque, Tipo tipo) {
        this.vida = vida;
        this.ataque = ataque;
        this.tipo = tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public short getVida() {
        return vida;
    }

    public void setVida(short vida) {
        this.vida = vida;
    }

    public short getAtaque() {
        return ataque;
    }

    public void setAtaque(short ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "vida=" + vida +
                ", ataque=" + ataque +
                ", tipo=" + tipo +
                '}';
    }
}
