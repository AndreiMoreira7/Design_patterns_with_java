package FactoryMethod;

public class EmissorEmail implements Emissor{
    // Implementar o metodo envia para Email
    @Override
    public void envia(String mensagem) {
        System.out.println("Email: " + mensagem);
    }
}