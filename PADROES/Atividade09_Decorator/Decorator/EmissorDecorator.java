package Decorator;

public abstract class EmissorDecorator implements Emissor {
    private Emissor emissor;

    public EmissorDecorator(Emissor emissor){
        this.emissor = emissor;
    }

    public Emissor getEmissor(){
        return this.emissor;
    }

    // Assinatura do método abstrato a ser redefinido pelos decoradores concretos
    public abstract void envia(String mensagem);
    
}
