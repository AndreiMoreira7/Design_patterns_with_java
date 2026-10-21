package Decorator;

public class EmissorDecoratorComCompressao extends EmissorDecorator {
    public EmissorDecoratorComCompressao(Emissor emissor){
        super(emissor);
    }

    // Comportamento: Processar a mensagem aplicando a compressão de dados e repassar o resultado para o emissor decorado.
    public void envia(String mensagem){
        // Implementar a lógica de compressao de dados de mensagem (ex: uso de DeflaterOutputStream ou manipula o de bytes)
        String mensagemComprimida = comprime(mensagem);

        getEmissor().envia(mensagemComprimida);
    }
    
    private String comprime(String mensagem){
        return "[COMPRIMIDA] " + mensagem;
    }
}
