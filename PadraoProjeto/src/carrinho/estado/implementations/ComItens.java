package carrinho.estado.implementations;

public class ComItens implements carrinho.Estado {
    @Override
    public void pagar() {
        System.out.println("Pagamento realizado com sucesso.");
    }

}
