package Decorator;

public class EmissorBasico implements Emissor {
    // Comportamente: Exibir no console a mensagem enviada de forma simples

    public void envia(String mensagem){
        // Implementar o envio basico de mensagem
        System.out.println("Mensagem enviada: " + mensagem);
    }
}
