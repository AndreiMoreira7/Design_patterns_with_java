public class example06{
    public static void main(String[] args) {
        double medicao1 = 124.75;
        double medicao2 = 89.30;
        double medicao3 = 210.15;
        double media = (medicao1 + medicao2 + medicao3) / 3;
        int mediaPrecisa = (int)media;

        System.out.println("Média flutuante: " + media + " | Média precisa: " + mediaPrecisa);
    }
}