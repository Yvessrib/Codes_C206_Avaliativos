import RedesSociais.RedeSocial;

public class Usuario {

    private String nome;
    private String email;
    RedeSocial[] redeSocial = new RedeSocial[20];

    public Usuario(String nome, String email,RedeSocial[] redesSociais) {
        this.nome = nome;
        this.email = email;
        for (int i = 0; i < redesSociais.length; i++) {
            if(this.redeSocial[i] == null){
                this.redeSocial[i] = redesSociais[i];
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
