package entities;

public abstract class Ave extends Animal{

    private String corPena;

    public Ave() {
        super();
    }

    public Ave(String especie, double peso, int idade, String membros, String corPena) {
        super(especie, peso, idade, membros);
        this.corPena = corPena;
    }

    public abstract String nadar(String nd);

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public String toString() {
        return super.toString() + "Ave -> ";
    }
}
