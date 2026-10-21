package Composite;

public class TrechoAndando implements Trecho {
    private String direcao;
    private double distancia;

    public TrechoAndando (String direcao, double distancia){
        this.direcao = direcao;
        this.distancia = distancia;
    }

    // Comportamento: Exibir as instruções informando que o trecho e a pe, mostrando a direcao e a distancia percorrida em metros;
    public void imprime(){
        // Implementar a impressao das intrucoes do trecho a pe
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│                   TRECHO A PÉ                    │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("│  Ação     : Andando                              │%n");
        System.out.printf("│  Direção  : %-36s │%n", direcao);
        System.out.printf("│  Distância: %-36s │%n", distancia + " metros");
        System.out.println("└──────────────────────────────────────────────────┘");
        System.out.println();
    }
    
}
