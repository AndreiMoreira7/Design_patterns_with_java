package Composite;

public class TestaCaminho {
    public static void main(String[] args) {
        // Criar instancias de TrechoAndando e TrechoDeCarro com mensagens e distancias de teste
        // Instanciar um objeto Caminho (caminho1) e adicionar trechos a ele
        // Imprimir o conteudo do caminho1
        // Instanciar um segundo Caminho (caminho2) e adicionar a ele o caminho1 e outros trechos
        // Imprimir o conteudo do caminho2 demosnstrando o tratamento uniforme
        TrechoAndando trecho1 = new TrechoAndando("Siga em frente", 100);
        TrechoAndando trecho2 = new TrechoAndando("Siga em frente", 500);

        Caminho caminho1 = new Caminho();
        caminho1.adiciona(trecho1);
        caminho1.adiciona(trecho2);

        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│                  ROTA: CAMINHO 1                 │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.println("│  Status   :    Trechos iniciais carregados       │");
        System.out.println("└──────────────────────────────────────────────────┘");
        caminho1.imprime();
        System.out.println();

        TrechoAndando trecho3 = new TrechoAndando("Vire a esquerda", 200);

        Caminho caminho2 = new Caminho();
        caminho2.adiciona(caminho1);
        caminho2.adiciona(trecho3);

        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│              ROTA COMPLETA: CAMINHO 2            │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.println("│  Status   :    Composição de rotas (Composite)   │");
        System.out.println("└──────────────────────────────────────────────────┘");
        caminho2.imprime();
        System.out.println();
    }
}
