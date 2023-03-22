import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        //CRIANDO COMPUTADORES

        //1º Promoção
        Computador pc1 = new Computador("Positivo", 2300f);
        pc1.HB[0] = new HardwareBasico("Pentium core i3", 2200);
        pc1.HB[1] = new HardwareBasico("Memoria ram", 8);
        pc1.HB[2] = new HardwareBasico("HD", 500);
        pc1.SO = new SistemaOperacional("Linux Ubuntu", 32);
        MemoriaUSB m1 = new MemoriaUSB("Pen-drive", 16);
        pc1.addMemoriaUSB(m1);

        //2º Promoção
        Computador pc2 = new Computador("Acer", 5800f);
        pc2.HB[0] = new HardwareBasico("Pentium core i5", 3370);
        pc2.HB[1] = new HardwareBasico("Memoria ram", 16);
        pc2.HB[2] = new HardwareBasico("HD", 1);
        pc2.SO = new SistemaOperacional("Windows 8", 64);
        MemoriaUSB m2 = new MemoriaUSB("Pen-drive", 32);
        pc2.addMemoriaUSB(m2);

        //3º Promoção
        Computador pc3 = new Computador("Vaio", 1800f);
        pc3.HB[0] = new HardwareBasico("Pentium core i7", 4500);
        pc3.HB[1] = new HardwareBasico("Memoria ram", 32);
        pc3.HB[2] = new HardwareBasico("HD", 2);
        pc3.SO = new SistemaOperacional("Windows 10", 64);
        MemoriaUSB m3 = new MemoriaUSB("HD Externo", 1);
        pc3.addMemoriaUSB(m3);

        // Criando Cliente
        System.out.print("Insira seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Insira seu CPF: ");
        long cpf = sc.nextLong();

        Cliente cliente = new Cliente(nome,cpf);

        System.out.println("\nBem vindo(a) a PC Mania caro " + nome);

        //Mostrar promos?
        System.out.println("\n----- PROMOÇÃO 1 -----");
        pc1.mostraPCConfigs();

        System.out.println("----- PROMOÇÃO 2 -----");
        pc2.mostraPCConfigs();

        System.out.println("----- PROMOÇÃO 3 -----");
        pc3.mostraPCConfigs();

        while (flag) {

            //MENU DA LOJA
            System.out.println("---- BEM-VINDO AO CATÁLOGO DA LOJA PC-MANIA ----");
            System.out.println("---- PARA ADICIONAR UM ITEM NO CARRINHO BASTA USAR AS OPÇÕES ----");
            System.out.println("---- 1. Promoção 1 ----");
            System.out.println("---- 2. Promoção 2 ----");
            System.out.println("---- 3. Promoção 3 ----");
            System.out.println("\nCaso queira sair do catálogo, digite 0");

            int op;
            System.out.print("Opção: ");
            op = sc.nextInt();

            switch (op) {

                case 0:

                    System.out.println("Você escolheu sair do menu!");
                    System.out.println("Até a proxima!");
                    flag = false;
                    break;

                case 1:

                    System.out.println("Você escolheu comprar a promoção 1!\n");

                    for(int i = 0; i < cliente.compra.length; i++) {
                        if(cliente.compra[i] == null){
                            cliente.compra[i] = pc1;
                            break;
                        }
                    }
                    break;

                case 2:

                    System.out.println("Você escolheu comprar a promoção 2!\n");
                    for(int i = 0; i < cliente.compra.length; i++) {
                        if(cliente.compra[i] == null){
                            cliente.compra[i] = pc2;
                            break;
                        }
                    }
                    break;

                case 3:

                    System.out.println("Você escolheu comprar a promoção 3!\n");
                    for(int i = 0; i < cliente.compra.length; i++) {
                        if(cliente.compra[i] == null){
                            cliente.compra[i] = pc3;
                            break;
                        }
                    }
                    break;

                default:
                    System.out.println("Digite uma opção válida!");
                    break;
            }
        }

        System.out.println("\n----CHECK OUT----");
        System.out.println("\nCliente: " + cliente.nome);
        System.out.println("Cpf: " + cliente.cpf);
        System.out.println("\nComputador(es) comprado: ");

        for (int i = 0; i < cliente.compra.length; i++) {
            if (cliente.compra[i] != null) {
                cliente.compra[i].mostraPCConfigs();
            }
        }

        System.out.println("Total da compra: R$ " + cliente.calculaTotalCompra());

    }
}