package Facade;

public class Financeiro {
    // Definir os atributos n e c e s s r i o s para a classe Financeiro
    // Comportamento : Processar o faturamento exibindo os dados da fatura (cliente
    // e produto).

    public void fatura(String cliente, String produto) {
        // Implementar o comportamento de faturamento
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│                     FATURA                       │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("│  Cliente          : %-28s │%n", cliente);
        System.out.printf("│  Produto Adquirido: %-28s │%n", produto);
        System.out.println("└──────────────────────────────────────────────────┘");
        System.out.println();
    }
}