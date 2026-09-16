import expressao.*;

import expressao.implementations.Numero;
import expressao.implementations.Soma;

public class App {
    public static void main(String[] args) {
        Expressao expressao = new Soma(
            new Numero(10),
            new Numero(5)
        );

        System.out.println(expressao.interpretar()); // 15
    }
}