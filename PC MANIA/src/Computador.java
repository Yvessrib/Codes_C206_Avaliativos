public class Computador {

    //Atributos
    String marca;
    float preco;

    HardwareBasico[] HB;
    SistemaOperacional SO;
    MemoriaUSB memoria;

    public Computador(String marca, float preco) {
        this.marca = marca;
        this.preco = preco;

        HB = new HardwareBasico[3];
    }

    public void mostraPCConfigs() {

        System.out.println("Marca: " + marca);
        System.out.println("Preço: R$ " + preco);

        for (int i = 0; i < HB.length; i++) {
            String unit = null;

            if (HB[i] != null) { //CONDIÇÃO PARA UNIDADE DAS PEÇAS

                switch (i) {
                    case 0:
                        unit = "Mhz";
                        break;

                    case 1:
                        unit = "Gb";
                        break;

                    case 2:
                        if (HB[i].capacidade >= 10)
                            unit = "Gb";
                        else
                            unit = "Tb";
                        break;
                }
                System.out.println(HB[i].nome + " (" + HB[i].capacidade + " " + unit + ") ");
            }
        }
        System.out.println("Sistema Operacional "+ SO.nome + " ("+ SO.tipo + " Bits)");

        if(memoria.capacidade > 10)
            System.out.println("Acompanha " + memoria.nome + " de " + memoria.capacidade + "Gb");
        else
            System.out.println("Acompanha " + memoria.nome + " de " + memoria.capacidade + "Tb");
        System.out.println();
    }

    public void addMemoriaUSB(MemoriaUSB musb) {
        this.memoria = musb;
    }
}
