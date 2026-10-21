package FactoryMethod;

public class EmissorWhatsApp implements Emissor{
    @Override
    public void envia(String mensagem) {
        System.out.println("WhatsApp: " + mensagem);
    }
}