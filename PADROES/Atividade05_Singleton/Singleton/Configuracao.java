package Singleton;

import java.util.HashMap;
import java.util.Map;

public class Configuracao {
    private Map<String, String> propriedades;
    private static Configuracao instance;
    
    // Tornar o construtor privado e inicializar o mapa de propriedades
    private Configuracao () {
        this.propriedades = new HashMap <String, String> ();
        // Exemplo de propriedades predefinidas :
        // "time - zone " -> " America / Sao_Paulo"
        // "currency - code " -> "BRL"

        this.propriedades.put("time-zone", "America/Sao_Paulo");
        this.propriedades.put("currency-code", "BRL");
    }

    // Implementar o metodo estatico getInstance ()
    static Configuracao getInstance(){
        // Garantir que apenas uma instancia seja criada e retornada
        if(instance == null){
            instance = new Configuracao();
        }
        return instance;
    }

    public String getPropriedade (String nomeDaPropriedade) {
        return this.propriedades.get(nomeDaPropriedade);
    }
}
