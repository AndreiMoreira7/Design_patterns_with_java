package Command;

public class Player {
    // Comportamento: Simular o tempo de reprodução de uma música exibindo mensagens de inicio, durante e fim.
    public void play(String filename) throws InterruptedException {
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│              REPRODUTOR DE ÁUDIO                 │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.println("│  Status           : Reproduzindo...              │");
        System.out.printf("│  Arquivo          : %-28s │%n", filename);
        System.out.println("└──────────────────────────────────────────────────┘");
        
        Thread.sleep(2000);
        
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│              REPRODUTOR DE ÁUDIO                 │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.println("│  Status           : Finalizado                   │");
        System.out.printf("│  Arquivo          : %-28s │%n", filename);
        System.out.println("└──────────────────────────────────────────────────┘");
        System.out.println();
    }

    // Comportamento: Exibir no console o nível de aumento do volume.
    public void increaseVolume(int levels) {
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│                CONTROLE DE VOLUME                │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("│  Ação             : Aumentando                   │%n");
        System.out.printf("│  Ajuste           : +%-27d │%n", levels);
        System.out.println("└──────────────────────────────────────────────────┘");
        System.out.println();
    }

    // Comportamento: Exibir no console o nível de redução do volume.
    public void decreaseVolume(int levels) {
        System.out.println("┌──────────────────────────────────────────────────┐");
        System.out.println("│                CONTROLE DE VOLUME                │");
        System.out.println("├──────────────────────────────────────────────────┤");
        System.out.printf("│  Ação             : Diminuindo                   │%n");
        System.out.printf("│  Ajuste           : -%-27d │%n", levels);
        System.out.println("└──────────────────────────────────────────────────┘");
        System.out.println();
    }
}