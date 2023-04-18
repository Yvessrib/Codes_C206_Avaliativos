package org.example;

//Referenciando a clase mãe e adicionando as interfaces
public class Pikachu extends Pokemon implements FazerBarulho, AtaqueEspecial{

    //Atributos da classe filha
    private float soltarRaios;
    private float paralisiaEletrica;

    //Construtor da classe
    public Pikachu(String nome, String tipo, float soltarRaios, float paralisiaEletrica) {
        super(nome, tipo);
        this.soltarRaios = soltarRaios;
        this.paralisiaEletrica = paralisiaEletrica;
    }

    //Mostra info herdado da classe mãe, com adições de atributos da classe filha
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("É um Pikachu");
        System.out.println("Soltar Raios: " + soltarRaios);
        System.out.println("Paralisia Eletrica " + paralisiaEletrica);
    }

    //Método implementado da interface AtaqueEspecial
    @Override
    public void ataqueEspecial() {
        if(soltarRaios > 750)
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
    public float getSoltarRaios() {
        return soltarRaios;
    }

    //Setter para lógica do Held Item
    public void setSoltarRaios(float soltarRaios) {
        this.soltarRaios = soltarRaios;
    }
}
