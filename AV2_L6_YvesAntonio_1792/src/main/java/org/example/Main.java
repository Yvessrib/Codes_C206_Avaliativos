package org.example;

public class Main {
    public static void main(String[] args) {

        //Instanciando os pokemons (Pikachu, Squirtle e Bulbassaur)
        Pikachu pi = new Pikachu("Pikachu","Elétrico",600,1000);
        Squirtle sq = new Squirtle("Squirtle", "Agua", 400);
        Bulbassaur bu = new Bulbassaur("Bulbassaur", "Planta", 600);

        //Instanciando o treinador
        Treinador ash = new Treinador("Ash Ketchum");

        //Instanciando um item
        HeldItem h1 = new HeldItem("Bandana de Raio");
        //Colocando o item no Pokemon pikachu
        pi.helditem = h1;

        //Adicionando os pokemons ao treinador
        ash.addPokemon(pi);
        ash.addPokemon(sq);
        ash.addPokemon(bu);

        //Verificando se os pokemons possuem Helditem e fazendo as alterações necessárias
        for(int i = 0; i < ash.pokemons.length; i++){
            if(ash.pokemons[i] != null){
                if(ash.pokemons[i] instanceof Bulbassaur){
                    Bulbassaur bul = (Bulbassaur) ash.pokemons[i];
                    if(bul.helditem != null){
                        bul.setLuminosidadeAmbiente(bul.getLuminosidadeAmbiente() + 300);
                    }
                }

                if(ash.pokemons[i] instanceof Pikachu){
                    Pikachu pik = (Pikachu) ash.pokemons[i];
                    if(pik.helditem != null){
                        pik.setSoltarRaios(pi.getSoltarRaios() + 200);
                    }
                }
            }
        }

        //Usando o método Mostra Info
        ash.mostraInfo();

        //Mostrando a quantidade de pokemons do treinador
        System.out.println("Quantidade de pokemons do treinador " + ash.nome + " = " + Pokemon.qtdPokemon);

    }
}