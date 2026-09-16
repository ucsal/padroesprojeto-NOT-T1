package carrinho.estado.implementations;

public class Vazio implements carrinho.Estado {
    @Override
    public void pagar() {
        System.out.println("Não é possível pagar. O carrinho está vazio.");
    }
}
