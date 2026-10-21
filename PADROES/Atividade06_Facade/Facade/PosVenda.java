package Facade;

public class PosVenda {
    // Definir os atributos n e c e s s r i o s para a classe PosVenda
    // Comportamento : Agendar contato futuro com o cliente (ex: 30 dias apos a compra) para verificar a satisfação com o produto .

    public void agendaContato(String cliente, String produto){
        // Implementar o comportamento de agendamento de pos - venda
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│              AGENDAMENTO DE PÓS-VENDA            │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("│  Clienta/Cliente : %-29s │%n", cliente);
        System.out.printf("│  Produto Adquirido: %-28s │%n", produto);
        System.out.printf("│  Data da Compra  : 31/02/2024                    │%n");
        System.out.printf("│  Previsão Contato: 31/04/2024                    │%n");
        System.out.println("└──────────────────────────────────────────────────┘");
        System.out.println();
    }
}