package Decorator;

public class EmissorDecoratorComCriptografia extends EmissorDecorator {
    public EmissorDecoratorComCriptografia (Emissor emissor){
        super(emissor);
    }

    // Comportamento: Processar a mensagem aplicando o metodo privado de criptografia e repassar o resultado para o emissor decorado.
    public void envia(String mensagem){
        // Criptografar a mensagem e invocar o método envia do emissor encapsulado
        String mensagemCriptografada = criptografia(mensagem);

        getEmissor().envia(mensagemCriptografada);
    }

    private String criptografia(String mensagem){
        // Implementar a lógica de inversao ou algoritmo de ciptografia de mensagem
        String resultado = "";
        for(int i = mensagem.length() - 1; i >= 0; i--){
            resultado = resultado + mensagem.charAt(i);
        }
        return resultado;
    }
}
