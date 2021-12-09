package entities;

public abstract class Reptil extends Animal{

    private String corEscama;

    public Reptil() {
        super();
    }

    public Reptil(String especie, double peso, int idade, String membros, String corEscama) {
        super(especie, peso, idade, membros);
        this.corEscama = corEscama;
    }

    public abstract String viviparo(String v);

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public String toString() {
        return super.toString() + "Reptil -> ";
    }
}
