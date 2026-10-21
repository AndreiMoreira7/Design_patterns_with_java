package FactoryMethod;

public class EmissorEmail implements Emissor{
    @Override
    public void envia(String mensagem) {
        System.out.println("Email: " + mensagem);
    }
}