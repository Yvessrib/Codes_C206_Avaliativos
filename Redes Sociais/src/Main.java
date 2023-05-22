import RedesSociais.*;

public class Main {
    public static void main(String[] args) {

        Facebook f1 = new Facebook("fc1524",15);
        GooglePlus g1 = new GooglePlus("ac65252",20);
        Twitter t1 = new Twitter("bc5177",10);
        Instagram i1 = new Instagram("bh8202",50);
        
        RedeSocial[] redeSociais = new RedeSocial[10];
        redeSociais[0] = f1;
        redeSociais[1] = t1;

        Usuario us1 = new Usuario("Yves","yvesribeiro@gec.inatel.br",redeSociais);
        
        System.out.println("---- Infos do Usuario ----");
        System.out.println("Nome: " + us1.getNome());
        System.out.println("Email: " + us1.getEmail());

        for (int i = 0; i < us1.redeSocial.length; i++) {

            if (us1.redeSocial[i] instanceof Facebook) {
                ((Facebook) us1.redeSocial[i]).fazStreaming();
                us1.redeSocial[i].postarFoto();
                us1.redeSocial[i].curtirPublicacao();
                System.out.println("\n------------------");
            }

            if (us1.redeSocial[i] instanceof GooglePlus) {
                ((GooglePlus) us1.redeSocial[i]).compartilhar();
                ((GooglePlus) us1.redeSocial[i]).fazStreaming();
                us1.redeSocial[i].postarFoto();
                us1.redeSocial[i].postarComentario();
                us1.redeSocial[i].postarVideo();
                us1.redeSocial[i].curtirPublicacao();
                System.out.println("\n------------------");
            }

            if (us1.redeSocial[i] instanceof Twitter) {
                ((Twitter) us1.redeSocial[i]).compartilhar();
                us1.redeSocial[i].postarComentario();
                us1.redeSocial[i].postarVideo();
                System.out.println("------------------");
            }

            if (us1.redeSocial[i] instanceof Instagram) {
                us1.redeSocial[i].postarFoto();
                us1.redeSocial[i].postarComentario();
                us1.redeSocial[i].postarVideo();
                us1.redeSocial[i].curtirPublicacao();
                System.out.println("\n------------------");
            }
        }
    }
}