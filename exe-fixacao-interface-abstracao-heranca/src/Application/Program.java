package Application;

import entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Animal> listaAnimais = new ArrayList<>();

        Cachorro cachorro = new Cachorro("PitBull", 20.0, 6, "4 patas", "Branco", "Grande");

        Cobra cobra = new Cobra("Serpente", 0.650, 2, "0", "Marrom", "sim");

        Coruja coruja = new Coruja("Coruja-orelhuda", 0.563, 3, "2 patas e 2 asas", "Branco com marrom", "Noturna");

        Tubarao tubarao = new Tubarao("Tubarão branco", 1.100, 20, "Duas nadadeiras, uma barbatana, e uma calda",
                "Cinza com branco", "Agua Salgada", "56 km/h");



        listaAnimais.add(cachorro);
        listaAnimais.add(cobra);
        listaAnimais.add(tubarao);
        listaAnimais.add(coruja);

        for(Animal animal: listaAnimais){

            if(animal instanceof Reptil){
                System.out.println(animal + ", Vivíparo='" + cobra.viviparo("sim") + '\'' +
                        ", Som emitido='" + cobra.emiteSom("sim") + '\'' + "}");
            }
            else if(animal instanceof Peixe){
                System.out.println(animal + ", Anda fora da água='" + tubarao.andarForaDaAgua("não") + '\'' +
                        ", Som emitido='" + tubarao.emiteSom("sim") + '\'' + "}");
            }
            else if(animal instanceof Ave){
                System.out.println(animal + ", Sabe nadar='" + coruja.nadar("sim") + '\'' +
                        ", Som emitido='" + coruja.emiteSom("sim") + '\'' + "}");
            }
            else if(animal instanceof Cachorro){
                System.out.println(animal + ", Som emitido='" + cachorro.emiteSom("sim") + '\'' + "}");
            }
            System.out.println();
            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println();

        }


    }
}
