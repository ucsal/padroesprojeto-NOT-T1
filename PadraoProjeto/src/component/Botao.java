package component;

import command.*;

public class Botao {
    private final Command comando;

    public Botao(Command comando) {
        this.comando = comando;
    }

    public void clicar() {
        comando.execute();
    }
}