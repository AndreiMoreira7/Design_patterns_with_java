package Command;

public class TestaListaDeComandos {
    public static void main(String[] args) {
        // Instanciar o Player e a Lista de Comandos
        // Adicionar sequencialmente comandos de reprodução e alterações de volume na lista
        // Chamar o método executa () da ListaDeComandos para disparar a reprodução
        Player player = new Player();
        ListaDeComandos lista = new ListaDeComandos();
        lista.adiciona(new TocaMusicaComando(player, "The Emptiness Machine.mp3"));
        lista.adiciona(new AumentaVolumeComando(player, 2));
        lista.adiciona(new TocaMusicaComando(player, "Back To Black.mp3"));
        lista.adiciona(new DiminuiVolumeComando(player, 1));
        lista.executa();
    }
    
}
