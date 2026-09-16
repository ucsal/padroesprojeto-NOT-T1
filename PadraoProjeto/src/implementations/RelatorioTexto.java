package implementations;

import abstraction.Relatorio;

public class RelatorioTexto extends Relatorio {

    @Override
    protected String formatar(String dados) {
        return dados;
    }
}