package FactoryMethod;

public class EmissorSMS implements Emissor{
    // Implementar o metodo envia para SMS
    @Override
    public void envia(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}