package command.implementation;

import command.*;
import model.*;

public class LogarUsuario implements Command {
    private Usuario usuario;

    public LogarUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public void execute() {
        // Lógica para logar o usuário
        System.out.println("Usuário " + usuario.getNome() + " logado com sucesso!");
    }
    
}
