public class Cliente {

    //Atributos
    String nome;
    long cpf;

    //Criando array de compras
    Computador [] compra  = new Computador[100];

    //Constructor
    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Calcular compra total
    public float calculaTotalCompra(){


        float totalCompra = 0;
        //For para calcular total de compra
        for(int i = 0; i < compra.length; i++){
            if(compra[i] != null){
                totalCompra += compra[i].preco;
            }
        }
        //Retornando valor da compra total
        return totalCompra;
    }

}
