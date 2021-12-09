package entities;

public abstract class Peixe extends Animal{

    private String corEscama;
    private String aguaDoceOuSalgada;

    public Peixe() {
        super();
    }

    public Peixe(String especie, double peso, int idade, String membros, String corEscama, String aguaDoceOuSalgada) {
        super(especie, peso, idade, membros);
        this.corEscama = corEscama;
        this.aguaDoceOuSalgada = aguaDoceOuSalgada;
    }

    public abstract String andarForaDaAgua(String afd);

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getAguaDoceOuSalgada() {
        return aguaDoceOuSalgada;
    }

    public void setAguaDoceOuSalgada(String aguaDoceOuSalgada) {
        this.aguaDoceOuSalgada = aguaDoceOuSalgada;
    }

    @Override
    public String toString() {
        return super.toString() + "Peixe -> ";
    }
}
