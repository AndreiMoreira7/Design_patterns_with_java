package Composite;

import java.util.ArrayList;
import java.util.List;

public class Caminho implements Trecho {
    // Definir a coleção para armazenar objetos do tipo Trecho
    private List<Trecho> trechos;

    public Caminho(){
        // Inicializar a lista de trechos;
        trechos = new ArrayList<Trecho>();
    }

    // Comportamento: Adicionar um novo Trecho (simples ou composto) ao caminho.
    public void adiciona(Trecho trecho){
        // Implementar a inclusão do trecho
        trechos.add(trecho);
    }

    //Comportamento: Remover um Trecho do caminho
    public void remove(Trecho trecho){
        // Implementar a remocao do trecho
        trechos.remove(trecho);
    }

    // Comportamento: Percorrer a coleção de trechos executando o metodo imprime() de cada elemento.
    public void imprime(){
        // Iterar sobre os trechos e invocar o imprime() de forma polimorfica
        for(int i = 0; i < trechos.size(); i++){
            trechos.get(i).imprime();
        }
    }
}
