package org.example;

//Tornando a classe Abstrata (Mãe / Super)
public abstract class Pokemon {

    //Atributos da classe mãe
    static int qtdPokemon = 0;
    private String nome;
    private String tipo;
    HeldItem helditem = null;

    //Construtor da classe mãe/super
    public Pokemon(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        qtdPokemon++;
    }

    //Método mostraInfo da classe mãe/super
    public void mostraInfo(){
        System.out.println("--- Infos do Pokemon ---");
        System.out.println("Nome: " + nome);
        System.out.println("Tipo: " + tipo);
        if(helditem != null)
            System.out.println("Item: " + helditem.tipo);

        else
            System.out.println("Não possui item");
    }

    //Método que será herdado pelas classes filhas
    abstract void atacar();

    //Getter para usar o nome nos métodos das classes filhas
    public String getNome() {
        return nome;
    }
}
