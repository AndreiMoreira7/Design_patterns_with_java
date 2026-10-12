package FactoryMethod;

public class EmissorCreator {
    public static int SMS = 0;
    public static int EMAIL = 1;
    public static int WHATSAPP = 2;

    public Emissor create(int tipoDeEmissor) {
        // TODO : Implementar a logica de decisao e criacao das instancias
        if (tipoDeEmissor == SMS) {
            return new EmissorSMS();
        } else if (tipoDeEmissor == EMAIL) {
            return new EmissorEmail();
        } else if (tipoDeEmissor == WHATSAPP) {
            return new EmissorWhatsApp();
        } else {
            return null;
        }
    }
}