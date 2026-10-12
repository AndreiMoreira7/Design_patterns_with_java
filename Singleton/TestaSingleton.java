package Singleton;
public class TestaSingleton {
    public static void main(String[] args) {
        Configuracao config = Configuracao.getInstance();

        System.out.println("Time Zone: " + config.getPropriedade("time-zone"));
        System.out.println("Currency Code: " + config.getPropriedade("currency-code"));
    }
}