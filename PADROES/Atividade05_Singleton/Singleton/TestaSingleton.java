package Singleton;

public class TestaSingleton {
    public static void main(String[] args) {
        // Obter a instancia unica de Configuracao via getInstance ()
        // Imprimir no console o valor da propriedade "time - zone"
        // Imprimir no console o valor da propriedade " currency - code"
        Configuracao configuracao = Configuracao.getInstance();

        System.out.println(configuracao.getPropriedade("time-zone"));
        System.out.println(configuracao.getPropriedade("currency-code"));   
    }
}
