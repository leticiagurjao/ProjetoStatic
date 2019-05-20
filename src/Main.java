public class Main {
    public static void main (String args[]){
        Usuario u1 = new Usuario( "João");
        Usuario u2 = new Usuario( "Maria");
        Usuario u3 = new Usuario( "Pedro");
        u1.logar();
        u2.logar();
        u3.logar();
        System.out.println(Usuario.totalUsuariosLogados);
    }
}
