package FactoryMethod;

public class EmissorWhatsApp implements Emissor{
    // Implementar o metodo envia para WhatsApp
    @Override
    public void envia(String mensagem) {
        System.out.println("WhatsApp: " + mensagem);
    }
}