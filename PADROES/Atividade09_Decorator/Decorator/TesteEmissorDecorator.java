package Decorator;

public class TesteEmissorDecorator {
    public static void main(String[] args) {
        // Instanciar um EmissorBasico com decorator de Criptografia e testar o envio
        // Instanciar um EmissorBasico com decorador de Compressao e testar o envio
        // Criar um emissor encadeado (Criptografia + Compressao + EmissorBasico) e
        // testar o envio combinado
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│             ENVIANDO: COM CRIPTOGRAFIA           │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.println("│  Filtro   :    Criptografia                      │");
        System.out.println("└──────────────────────────────────────────────────┘");
        Emissor emissor1 = new EmissorBasico();
        Emissor emissorComCriptografia = new EmissorDecoratorComCriptografia(emissor1);
        emissorComCriptografia.envia("Olá mundo");
        System.out.println();

        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│              ENVIANDO: COM COMPRESSÃO            │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.println("│  Filtro   :    Compressão                        │");
        System.out.println("└──────────────────────────────────────────────────┘");
        Emissor emissor2 = new EmissorBasico();
        Emissor emissorComCompressao = new EmissorDecoratorComCompressao(emissor2);
        emissorComCompressao.envia("Olá mundo");
        System.out.println();

        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│      ENVIANDO: CRIPTOGRAFIA + COMPRESSÃO         │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.println("│  Filtros  :    Criptografia  ->   Compressão     │");
        System.out.println("└──────────────────────────────────────────────────┘");
        Emissor emissor3 = new EmissorBasico();
        Emissor emissorComCompressaoECriptografia = new EmissorDecoratorComCriptografia(
                new EmissorDecoratorComCompressao(emissor3));
        emissorComCompressaoECriptografia.envia("Olá mundo");
        System.out.println();
    }
}
