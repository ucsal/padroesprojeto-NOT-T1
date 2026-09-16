package abstraction;

public abstract class Relatorio {

    public final void gerar() {
        String dados = buscarDados();
        String conteudo = formatar(dados);
        salvar(conteudo);
    }

    private String buscarDados() {
        return "Venda A: R$ 100";
    }

    private void salvar(String conteudo) {
        System.out.println("Salvando: " + conteudo);
    }

    protected abstract String formatar(String dados);
}