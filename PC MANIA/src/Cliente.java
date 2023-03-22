public class Cliente {

    //Atributos
    String nome;
    long cpf;

    //Criando array de compras
    Computador [] compra  = new Computador[100];

    public Cliente(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public float calculaTotalCompra(){

        float totalCompra = 0;

        for(int i = 0; i < compra.length; i++){
            if(compra[i] != null){
                totalCompra += compra[i].preco;
            }
        }

        return totalCompra;
    }

}
