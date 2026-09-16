import abstraction.Relatorio;
import implementations.*;

public class Main {
    public static void main(String[] args) {
        Relatorio texto = new RelatorioTexto();
        texto.gerar();

        Relatorio html = new RelatorioHTML();
        html.gerar();
    }
}