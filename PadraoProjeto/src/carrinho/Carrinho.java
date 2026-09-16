package carrinho;

import carrinho.estado.implementations.*;

public class Carrinho {
    private Estado estado = new Vazio();

    public void adicionarItem() {
        estado = new ComItens();
        System.out.println("Item adicionado.");
    }

    public void pagar() {
        estado.pagar();
    }
}