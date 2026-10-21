package Command;

public class TocaMusicaComando implements Comando {
    // Definir os atributos para o Player e para o arquivo de audio
    private Player player;
    private String file;

    public TocaMusicaComando(Player player, String file){
        // Inicializar os atributos via construtor
        this.player = player;
        this.file = file;
    }
    // Comportamento: Invocar o método play() do Player tratando possveis exceções.
    public void executa(){
        // Executar a chamada de reproducao do player
        try{ player.play(file); }
        
        catch(InterruptedException e){ System.out.println("Erro ao reproduzir a música"); }
    }
}
