import java.util.Scanner;

import carrinho.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carrinho carrinho = new Carrinho();
        int opcao;

        do {
            System.out.println("\n1 - Adicionar item");
            System.out.println("2 - Pagar");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    carrinho.adicionarItem();
                    break;
                case 2:
                    carrinho.pagar();
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}