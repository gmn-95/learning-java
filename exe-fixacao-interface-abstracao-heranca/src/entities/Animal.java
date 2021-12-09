package entities;

import services.Natureza;

public abstract class Animal implements Natureza {

    private String especie;
    private double peso;
    private int idade;
    private String Membros;


    public Animal() {
    }

    public Animal(String especie, double peso, int idade, String membros) {
        this.especie = especie;
        this.peso = peso;
        this.idade = idade;
        Membros = membros;
    }

    public abstract String emiteSom(String es);

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMembros() {
        return Membros;
    }

    public void setMembros(String membros) {
        Membros = membros;
    }

    @Override
    public String toString() {
        return "Animal -> ";
    }
}
