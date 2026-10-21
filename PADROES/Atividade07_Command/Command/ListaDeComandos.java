package Command;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComandos {
    // Definir a coleção para armazenar os objetos do tipo Comando
    private List<Comando> comandos;

    public ListaDeComandos(){
        // Inicializar a lista de comandos
        comandos = new ArrayList<Comando>();
    }

    // Comportamento: Adicionar um comando fila de execução.
    public void adiciona(Comando comando){
        // Implementar a inserção na lista
        comandos.add(comando);
    }

    // Comportamento: Iterar sobre a lista e executar cada comando sequencialmente
    public void executa(){
        // Executar o método executa() de cada comando cadastrado
        for (int i = 0; i < comandos.size(); i++) {
            comandos.get(i).executa();
        }
    }
}
