package entities;

public class Cachorro extends Mamifero{

    private String porte;

    public Cachorro() {
        super();
    }

    public Cachorro(String especie, double peso, int idade, String membros, String corPelo, String porte) {
        super(especie, peso, idade, membros, corPelo);
        this.porte = porte;
    }

    public void reagir(char frase){

    }

    public void reagir(int hora, int min){

    }

    @Override
    public String emiteSom(String es) {
        if(es.equalsIgnoreCase("sim")){
            return "'Au Au'";
        }
        else{
            return "Todos os Cachorros emitem som, por exemplo: 'au au' ";
        }

    }

    @Override
    public String habitat() {
        return "Terrestre";
    }

    @Override
    public String locomover() {
        return "Anda/corre";
    }

    @Override
    public String alimentacao() {
        return "Ração";
    }

    @Override
    public String toString() {
        return  super.toString() +
                "Cachorro{ " +
                "Especie='" + getEspecie() + '\'' +
                ", Peso='" + getPeso() + "kg" + '\'' +
                ", Idade='" + getIdade() + " ano(s)" + '\'' +
                ", Membros='" + getMembros() + '\'' +
                ", Cor do pelo='" + getCorPelo() + '\'' +
                ", Porte='" + porte + '\'' +
                ", Habitat='" + habitat() + '\'' +
                ", Locomoção='" + locomover() + '\'' +
                ", Alimentação='" + alimentacao() + '\'';
    }

}
