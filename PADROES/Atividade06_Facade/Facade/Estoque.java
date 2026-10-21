package Facade;

public class Estoque {
    // Definir os atributos n e c e s s r i o s para a classe Estoque
    // Comportamento : Calcular a data de entrega (ex: 2 dias uteis ) e exibir a
    // mensagem de confirmacao do envio do produto para o endereco fornecido .
    public void enviaProduto(String produto, String enderecoDeEntrega) {
        // Implementar o comportamento de envio e estimativa de entrega
        System.out.println("Produto: " + produto);
        System.out.println("Enviado para: " + enderecoDeEntrega);
        System.out.println("Previsão de entrega: 25 dias úteis");
    }
}