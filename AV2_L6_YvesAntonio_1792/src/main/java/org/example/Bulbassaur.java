package org.example;

//Referenciando a clase mãe e adicionando as interfaces
public class Bulbassaur extends Pokemon implements FazerBarulho, AtaqueEspecial{

    //Atributos da classe filha
    private float luminosidadeAmbiente;

    //Construtor da classe
    public Bulbassaur(String nome, String tipo, float luminosidadeAmbiente) {
        super(nome, tipo);
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }

    //Mostra info herdado da classe mãe, com adições de atributos da classe filha
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("É um Bulbassaur");
        System.out.println("Luminosidade Ambiente: " + luminosidadeAmbiente);
    }

    //Método implementado da interface AtaqueEspecial
    @Override
    public void ataqueEspecial() {
        if(luminosidadeAmbiente > 650)
            System.out.println(getNome() + " consegiu ganhar de seu oponente!");
        else
            System.out.println(getNome() + " perdeu a batalha");
    }

    //Método implementado da interface FazerBarulho
    @Override
    public void fazerBarulho() {
        System.out.println(getNome() + " esta fazendo barulho!");
    }

    //Método atacar, herdado da classe mãe/super
    @Override
    void atacar() {
        System.out.println(getNome() + " esta atacando!");
    }

    //Getter para lógica do Held Item
    public float getLuminosidadeAmbiente() {
        return luminosidadeAmbiente;
    }

    //Setter para lógica do Held Item
    public void setLuminosidadeAmbiente(float luminosidadeAmbiente) {
        this.luminosidadeAmbiente = luminosidadeAmbiente;
    }
}
