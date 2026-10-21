package Composite;

public class TrechoDeCarro implements Trecho {
    private String direcao;
    private double distancia;

    public TrechoDeCarro(String direcao, double distancia){
        this.direcao = direcao;
        this.distancia = distancia;
    }

    // Comportamento: Exiibir as instruções informando que o trecho e de carro, mostrando a direcao e a distancia percorrida em metros.
    public void imprime(){
        // Implementar a impressao das instrucoes do trecho de carro
        System.out.println("De carro: " + direcao + " por " + distancia + " metros");
    }
}
