package FactoryMethod;

public class EmissorSMS implements Emissor{
    @Override
    public void envia(String mensagem) {
        System.out.println("SMS: " + mensagem);
    }
}