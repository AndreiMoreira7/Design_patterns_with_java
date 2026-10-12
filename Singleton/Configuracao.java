package Singleton;
import java.util.HashMap;
import java.util.Map;

public class Configuracao {
    private Map<String, String> propriedades;
    private static Configuracao instance;

    
    private Configuracao() {
        this.propriedades = new HashMap<String, String>();
        
        this.propriedades.put("time-zone", "America/Sao_Paulo");
        this.propriedades.put("currency-code", "BRL");
    }

    public static Configuracao getInstance() {
        if (instance == null) {
            instance = new Configuracao();
        }
        return instance;
    }

    public String getPropriedade(String nomeDaPropriedade) {
        return this.propriedades.get(nomeDaPropriedade);
    }
}