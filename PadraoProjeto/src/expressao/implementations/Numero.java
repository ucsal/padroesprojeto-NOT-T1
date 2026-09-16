package expressao.implementations;

import expressao.*;

public class Numero implements Expressao {
    private final int valor;

    public Numero(int valor) {
        this.valor = valor;
    }

    public int interpretar() {
        return valor;
    }
}
