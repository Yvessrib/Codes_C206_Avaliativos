import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Criando entrada
        Scanner sc = new Scanner(System.in);
        //Criando flag para o menu
        boolean flag = true;

        //CRIANDO COMPUTADORES

        //1º Promoção - Inserindo todos os valores
        Computador pc1 = new Computador("Positivo", 2300f); //Criando computador
        pc1.HB[0] = new HardwareBasico("Pentium core i3", 2200); //Hardware Básico 1
        pc1.HB[1] = new HardwareBasico("Memoria ram", 8); //Hardware Básico 2
        pc1.HB[2] = new HardwareBasico("HD", 500); //Hardware Básico 3
        pc1.SO = new SistemaOperacional("Linux Ubuntu", 32); //Sistema operacional
        MemoriaUSB m1 = new MemoriaUSB("Pen-drive", 16); //Brinde
        pc1.addMemoriaUSB(m1); //Adicionando brinde

        //2º Promoção - Inserindo todos os valores
        Computador pc2 = new Computador("Acer", 5800f); //Criando computador
        pc2.HB[0] = new HardwareBasico("Pentium core i5", 3370); //Hardware Básico 1
        pc2.HB[1] = new HardwareBasico("Memoria ram", 16); //Hardware Básico 2
        pc2.HB[2] = new HardwareBasico("HD", 1); //Hardware Básico 3
        pc2.SO = new SistemaOperacional("Windows 8", 64); //Sistema operacional
        MemoriaUSB m2 = new MemoriaUSB("Pen-drive", 32); //Brinde
        pc2.addMemoriaUSB(m2); //Adicionando brinde

        //3º Promoção - Inserindo todos os valores
        Computador pc3 = new Computador("Vaio", 1800f); //Criando computador
        pc3.HB[0] = new HardwareBasico("Pentium core i7", 4500); //Hardware Básico 1
        pc3.HB[1] = new HardwareBasico("Memoria ram", 32); //Hardware Básico 2
        pc3.HB[2] = new HardwareBasico("HD", 2); //Hardware Básico 3
        pc3.SO = new SistemaOperacional("Windows 10", 64); //Sistema operacional
        MemoriaUSB m3 = new MemoriaUSB("HD Externo", 1); //Memoria adicional
        pc3.addMemoriaUSB(m3);//Adicionando memoria adicional
        //Criando Cliente
        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine(); //Entrando com o nome

        System.out.print("Insira seu CPF: ");
        long cpf = sc.nextLong(); // Entrando com o CPF

        //Criando o cliente em si
        Cliente cliente = new Cliente(nome,cpf);

        System.out.println("\nBem vindo(a) a PC Mania caro " + nome);

        //Mostrar promoções
        System.out.println("\n----- PROMOÇÃO 1 -----");
        pc1.mostraPCConfigs();

        System.out.println("----- PROMOÇÃO 2 -----");
        pc2.mostraPCConfigs();

        System.out.println("----- PROMOÇÃO 3 -----");
        pc3.mostraPCConfigs();

        //Entrando no menu
        while (flag) {

            //MENU DA LOJA
            System.out.println("---- BEM-VINDO AO CATÁLOGO DA LOJA PC-MANIA ----");
            System.out.println("---- PARA ADICIONAR UM ITEM NO CARRINHO BASTA USAR AS OPÇÕES ----");
            System.out.println("---- 1. Promoção 1 ----");
            System.out.println("---- 2. Promoção 2 ----");
            System.out.println("---- 3. Promoção 3 ----");
            System.out.println("\nCaso queira sair do catálogo, digite 0");

            //Entrando com a opção selecionada
            int op;
            System.out.print("Opção: ");
            op = sc.nextInt();

            //Casos de teste
            switch (op) {

                case 0:
                    //Sair do sistema
                    System.out.println("Você escolheu sair do menu!");
                    System.out.println("Até a proxima!");
                    flag = false;
                    break;

                case 1:
                    //Cliente comprando promoção 1
                    System.out.println("Você escolheu comprar a promoção 1!\n");
                    //Adicionando o pc1 no array de compra do cliente
                    for(int i = 0; i < cliente.compra.length; i++) {
                        if(cliente.compra[i] == null){
                            cliente.compra[i] = pc1;
                            break;
                        }
                    }
                    break;

                case 2:
                    //Cliente comprando promoção 2
                    System.out.println("Você escolheu comprar a promoção 2!\n");
                    //Adicionando o pc2 no array de compra do cliente
                    for(int i = 0; i < cliente.compra.length; i++) {
                        if(cliente.compra[i] == null){
                            cliente.compra[i] = pc2;
                            break;
                        }
                    }
                    break;

                case 3:
                    //Cliente comprando promoção 2
                    System.out.println("Você escolheu comprar a promoção 3!\n");
                    //Adicionando o pc3 no array de compra do cliente
                    for(int i = 0; i < cliente.compra.length; i++) {
                        if(cliente.compra[i] == null){
                            cliente.compra[i] = pc3;
                            break;
                        }
                    }
                    break;

                default:
                    //Default
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }

        //Fazendo chekout
        System.out.println("\n----CHECK OUT----");
        System.out.println("\nCliente: " + cliente.nome); //Mostrando nome do cliente
        System.out.println("Cpf: " + cliente.cpf); //Mostrando CPF do cliente
        System.out.println("\nComputador(es) comprado: ");

        //For para mostrar as configs dos PC's comprados
        for (int i = 0; i < cliente.compra.length; i++) {
            if (cliente.compra[i] != null) {
                cliente.compra[i].mostraPCConfigs();
            }
        }

        //Calculando e saindo com o valor da compra total
        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());

    }
}