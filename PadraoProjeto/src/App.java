import command.*;
import command.implementation.*;
import model.*;
import component.*;

public class App {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        
        usuario.setNome("João");
        usuario.setSenha("123456");

        Command comando = new LogarUsuario(usuario);

        Botao botao = new Botao(comando);
        botao.clicar(); // Luz acesa.
    }
}