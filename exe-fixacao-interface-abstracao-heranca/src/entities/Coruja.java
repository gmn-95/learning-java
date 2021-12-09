package entities;

public class Coruja extends Ave{

    private String noturnaOuDiurna;

    public Coruja() {
        super();
    }

    public Coruja(String especie, double peso, int idade, String membros, String corPena, String noturnaOuDiurna) {
        super(especie, peso, idade, membros, corPena);
        this.noturnaOuDiurna = noturnaOuDiurna;
    }

    public String getNoturnaOuDiurna() {
        return noturnaOuDiurna;
    }

    public void setNoturnaOuDiurna(String noturnaOuDiurna) {
        this.noturnaOuDiurna = noturnaOuDiurna;
    }

    @Override
    public String emiteSom(String es) {
        if(es.equalsIgnoreCase("sim")){
            return "'Cooooouu'";
        }
        else{
            return "Todas as corujas emitem som, por exemplo: 'au au' ";
        }
    }

    @Override
    public String nadar(String nd) {
        if(nd.equalsIgnoreCase("sim")){
            return "Está coruja nada!";
        }
        else{
            return "Está coruja não nada";
        }
    }

    @Override
    public String locomover() {
        return "Voa";
    }

    @Override
    public String alimentacao() {
        return "Coruja come mamíferos e roedores";
    }

    @Override
    public String toString() {
        return super.toString() + "Coruja{ " +
                "Especie='" + getEspecie() + '\'' +
                ", Peso='" + getPeso() + "kg" + '\'' +
                ", Idade='" + getIdade() + " ano(s)" + '\'' +
                ", Membros='" + getMembros() + '\'' +
                ", Cor das penas='" + getCorPena() + '\'' +
                ", Noturna ou diurna='" + noturnaOuDiurna + '\'' +
                ", Locomoção='" + locomover() + '\'' +
                ", Alimentação='" + alimentacao() + '\'';
    }
}
