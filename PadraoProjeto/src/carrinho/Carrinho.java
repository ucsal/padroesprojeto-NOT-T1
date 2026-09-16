package carrinho;

import pagamento.FormaPagamento;

public class Carrinho {
    private FormaPagamento formaPagamento;

    public Carrinho(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void pagar(double valor) {
        formaPagamento.pagar(valor);
    }
}
