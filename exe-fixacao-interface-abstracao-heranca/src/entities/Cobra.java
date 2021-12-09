package entities;

public class Cobra extends Reptil{

    private String venenosa;

    public Cobra() {
        super();
    }

    public Cobra(String especie, double peso, int idade, String membros, String corEscama, String venenosa) {
        super(especie, peso, idade, membros, corEscama);
        this.venenosa = venenosa;
    }

    public String getVenenosa() {
        return venenosa;
    }

    public void setVenenosa(String venenosa) {
        this.venenosa = venenosa;
    }

    @Override
    public String emiteSom(String es) {
        if(es.equalsIgnoreCase("sim")){
            return "'sssssssssssssss'";
        }
        else {
            return "Esta cobra não emite som";
        }

    }

    @Override
    public String viviparo(String v) {

        if(v.equalsIgnoreCase("sim")){
            return "Sim";
        }
        else {
            return "Não";
        }
    }

    @Override
    public String locomover() {
        return "Rasteja";
    }

    @Override
    public String alimentacao() {
        return "Outros animais";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Cobra{ " +
                "Especie='" + getEspecie() + '\'' +
                ", Peso='" + getPeso() + "kg" + '\'' +
                ", Idade='" + getIdade() + " ano(s)" + '\'' +
                ", Membros='" + getMembros() + '\'' +
                ", Cor da escama='" + getCorEscama() + '\'' +
                ", Venenosa='" + venenosa + '\'' +
                ", Locomoção='" + locomover() + '\'' +
                ", Alimentação='" + alimentacao() + '\'';
    }
}
