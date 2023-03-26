public class Computador {

    //Atributos
    String marca;
    float preco;

    //Arrays  /
    HardwareBasico[] HB;
    SistemaOperacional SO;
    MemoriaUSB memoria;

    //Construtor
    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;

        HB = new HardwareBasico[3]; //3 Hardwares básicos por pc
    }

    //Método para mostrar info do pc
    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca); //Marca
        System.out.println("Preço: R$ " + preco); //Preço

        for (int i = 0; i < HB.length; i++) {
            String unit = null;

            if (HB[i] != null) { //CONDIÇÃO PARA UNIDADE DAS PEÇAS

                switch (i) { //i = 1 Mhz
                    case 0:
                        unit = "Mhz";
                        break;

                    case 1: //i = 2 Gb
                        unit = "Gb";
                        break;

                    case 2: //i = 3 Gb ou Tb
                        if (HB[i].capacidade >= 10) //Verificando unidade
                            unit = "Gb";
                        else
                            unit = "Tb";
                        break;
                }
                System.out.println(HB[i].nome + " (" + HB[i].capacidade + " " + unit + ") "); //Saindo com os hardwares básicos
            }
        }
        System.out.println("Sistema Operacional "+ SO.nome + " ("+ SO.tipo + " Bits)"); //saindo com o sistema operacional

        if(memoria.capacidade > 10) //Verificando unidade novamente
            System.out.println("Acompanha " + memoria.nome + " de " + memoria.capacidade + "Gb"); //Memoria adicional
        else
            System.out.println("Acompanha " + memoria.nome + " de " + memoria.capacidade + "Tb"); //Memoria adicional
        System.out.println();
    }

    //Método para adiconar memoria
    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;
    }
}
