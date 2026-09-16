import pagamento.implementations.*;
import carrinho.Carrinho;

public class App {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho(new Pix());
        carrinho.pagar(100);

        Carrinho outroCarrinho = new Carrinho(new Cartao());
        outroCarrinho.pagar(200);
    }
}