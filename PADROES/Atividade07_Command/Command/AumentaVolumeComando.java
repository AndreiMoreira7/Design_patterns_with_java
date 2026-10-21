package Command;

public class AumentaVolumeComando implements Comando {
    // Definir os atributos para o Player e quantidade de n v e i s
    private Player player;
    private int levels;

    public AumentaVolumeComando(Player player, int levels){
        // Inicializar os atributos via construtor
        this.player = player;
        this.levels = levels;
    }

    // Comportamento: Invocar o m todo increaseVolume() do Player.
    public void executa(){
        // Executar o aumento de volume
        player.increaseVolume(levels);
    }
}
