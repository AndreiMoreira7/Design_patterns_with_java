package FactoryMethod;

public class TestaEmissores {  
    public static void main(String[] args) {
        // Instanciar o EmissorCreator
        // Solicitar a criacao dos emissores (SMS , EMAIL , WHATSAPP ) via fabrica
        // Executar o metodo envia () para cada emissor criado
        EmissorCreator creator = new EmissorCreator();
        
        Emissor emissorEmail = creator.criaEmissor("EMAIL");
        emissorEmail.envia("Email!");
        Emissor emissorSMS = creator.criaEmissor("SMS");
        emissorSMS.envia("SMS!");
        Emissor emissorWhatsApp = creator.criaEmissor("WHATSAPP");
        emissorWhatsApp.envia("WhatsApp!");
    }
}