package FactoryMethod;
public class TestaEmissores {  
    public static void main(String[] args) {
        EmissorCreator creator = new EmissorCreator();
        
        Emissor EmissorEMAIL = creator.criaEmissor("EMAIL");
        EmissorEMAIL.envia("Email!");
        Emissor EmissorSMS = creator.criaEmissor("SMS");
        EmissorSMS.envia("SMS!");
        Emissor EmissorWHATSAPP = creator.criaEmissor("WHATSAPP");
        EmissorWHATSAPP.envia("WhatsApp!");
    }
}