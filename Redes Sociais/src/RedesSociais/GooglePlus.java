package RedesSociais;

import Interfaces.Compartilhamento;
import Interfaces.VideoConferencia;

public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento {

    public GooglePlus(String senha, int numAmigos) {
        super(senha, numAmigos);
    }

    @Override
    public void postarFoto() {
        System.out.println("Postou um foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("Postou um video no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("Postou um comentario no GooglePlus");
    }

    @Override
    public void compartilhar() {
        System.out.println("Compartilhou algo no GooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Está fazendo um Streaming no GooglePlus");
    }

    @Override
    public void curtirPublicacao() {
        super.curtirPublicacao();
        System.out.print(" no GooglePlus");
    }
}
