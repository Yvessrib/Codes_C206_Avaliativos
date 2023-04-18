package org.example;

//Referenciando a clase mãe/super e adicionando as interfaces
public class Squirtle extends Pokemon implements FazerBarulho{

    //Atributos da classe filha
    private float multiplicadorAgua;

    //Construtor da classe
    public Squirtle(String nome, String tipo, float multiplicadorAgua) {
        super(nome, tipo);
        this.multiplicadorAgua = multiplicadorAgua;
    }

    //Mostra info herdado da classe mãe/super, com adições de atributos da classe filha
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("É um Squirtle");
        System.out.println("Multiplicador de Agua " + multiplicadorAgua);
    }

    //Método atacar, herdado da classe mãe/super
    @Override
    void atacar() {
        System.out.println(getNome() + " esta atacando!");
    }

    //Método herdado da interface FazerBarulho
    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " esta fazendo barulho!");
    }


}
