package org.example;

public class Treinador {

    //Atributos da classe
    String nome;
    Pokemon[] pokemons = new Pokemon[10];

    //Construtor da classe
    public Treinador(String nome) {
        this.nome = nome;
    }

    //Método mostra info / Usando os outros métodos das instâncias filhas
    public void mostraInfo(){

        System.out.println("--- Infos do Treinador ---");
        System.out.println("Nome: " + nome);
        System.out.println("\n--- LISTA DE POKEMONS ---");

        for(int i = 0; i < pokemons.length; i++){

            if(pokemons[i] != null){

                //Verificando se é um Squirtle
                if(pokemons[i] instanceof Squirtle){
                    Squirtle sq = (Squirtle) pokemons[i];

                    //Utilizando métodos da classe
                    sq.mostraInfo();
                    sq.atacar();
                    sq.fazerBarulho();
                    System.out.println();
                }

                //Verificando se é um Bulbassaur
                if(pokemons[i] instanceof Bulbassaur){
                    Bulbassaur bu = (Bulbassaur) pokemons[i];

                    //Utilizando métodos da classe
                    bu.mostraInfo();
                    bu.atacar();
                    bu.ataqueEspecial();
                    bu.fazerBarulho();
                    System.out.println();
                }

                //Verificando se é um Pikachu
                if(pokemons[i] instanceof Pikachu){
                    Pikachu pi = (Pikachu) pokemons[i];

                    //Utilizando métodos da classe
                    pi.mostraInfo();
                    pi.atacar();
                    pi.ataqueEspecial();
                    pi.fazerBarulho();
                    System.out.println();
                }
            }
        }
    }

    //Método para adicionar pokemons
    public void addPokemon(Pokemon p){
        for(int i = 0; i < pokemons.length; i++){
            if(pokemons[i] == null){
                pokemons[i] = p;
                break;
            }
        }
    }


}
