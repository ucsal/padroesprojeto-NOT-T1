package pagamento.implementations;

import pagamento.*;

public class Pix implements FormaPagamento {
    public void pagar(double valor) {
        System.out.println("Pagando R$ " + valor + " com Pix.");
    }
}