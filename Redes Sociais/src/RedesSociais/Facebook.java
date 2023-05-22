package RedesSociais;
import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;

public class Facebook extends RedeSocial implements VideoConferencia,Compartilhamento {

    public Facebook(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no Facebook");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Está fazendo um Streaming no Facebook");
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou uma foto no Facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no Facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um vídeu no facebook");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.print(" no Facebook");
    }
}
