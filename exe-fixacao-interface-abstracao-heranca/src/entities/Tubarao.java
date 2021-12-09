package entities;

public class Tubarao extends Peixe{

    private String velocidade;

    public Tubarao() {
        super();
    }

    public Tubarao(String especie, double peso, int idade, String membros, String corEscama, String aguaDoceOuSalgada, String velocidade) {
        super(especie, peso, idade, membros, corEscama, aguaDoceOuSalgada);
        this.velocidade = velocidade;
    }

    public String getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(String velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String emiteSom(String es) {
        if(es.equalsIgnoreCase("sim")){
            return "Todos os tubarões emitem um “delicioso zumbido";
        }
        else {
            return "Todos os tubarões emitem um “delicioso zumbido”";
        }
    }

    @Override
    public String andarForaDaAgua(String afd) {
        if(afd.equalsIgnoreCase("sim")){
            return "Não";
        }
        else {
            return "Não";
        }

    }

    @Override
    public String locomover() {
        return "Nadar";
    }

    @Override
    public String alimentacao() {
        return "Outros animais, exemplo: peixes";
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tubarão{ " +
                "Especie='" + getEspecie() + '\'' +
                ", Peso='" + getPeso() + "kg" + '\'' +
                ", Idade='" + getIdade() + " ano(s)" + '\'' +
                ", Membros='" + getMembros() + '\'' +
                ", Cor das Escamas='" + getCorEscama() + '\'' +
                ", Vive em água='" + getAguaDoceOuSalgada() + '\'' +
                ", Locomoção='" + locomover() + '\'' +
                ", Alimentação='" + alimentacao() + '\'';
    }
}
