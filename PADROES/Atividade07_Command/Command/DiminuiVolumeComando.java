package Command;

public class DiminuiVolumeComando implements Comando {
    // Definir os atributos para o player e quantidade de niveis
    private Player player;
    private int levels;

    public DiminuiVolumeComando(Player player, int levels){
        // Inicializar os atributos via construtor
        this.player = player;
        this.levels = levels;
    }

    // Comportamento: Invocar o método decreaseVolume() do Player.
    public void executa(){
        // Executar a diminuição do volume
        player.decreaseVolume(levels);        
    }
}
