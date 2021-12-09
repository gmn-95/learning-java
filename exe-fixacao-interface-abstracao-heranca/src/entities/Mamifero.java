package entities;

public abstract class Mamifero extends Animal {

    private String corPelo;

    public Mamifero() {
        super();
    }

    public Mamifero(String especie, double peso, int idade, String membros, String corPelo) {
        super(especie, peso, idade, membros);
        this.corPelo = corPelo;
    }

    public abstract String habitat();

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Mamífero -> ";
    }
}
