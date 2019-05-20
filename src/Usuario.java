public class Usuario {

    static int totalUsuariosLogados;
    private String nome;
    public Usuario(){

    }
    public Usuario(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void logar(){
        totalUsuariosLogados ++;
    }
    public void deslogar(){
        totalUsuariosLogados --;
    }
}
