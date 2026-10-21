package FactoryMethod;

public class EmissorCreator {
    public static final int SMS = 0;
    public static final int EMAIL = 1;
    public static final int WHATSAPP = 2;

    public Emissor create(int tipoDeEmissor) {
        if (tipoDeEmissor == SMS) {
            return new EmissorSMS();
        } else if (tipoDeEmissor == EMAIL) {
            return new EmissorEmail();
        } else if (tipoDeEmissor == WHATSAPP) {
            return new EmissorWhatsApp();
        }

        throw new IllegalArgumentException("Tipo de emissor inválido: " + tipoDeEmissor);
    }

    public Emissor criaEmissor(String tipoDeEmissor) {
        if (tipoDeEmissor == null) {
            throw new IllegalArgumentException("Tipo de emissor não pode ser nulo.");
        }

        switch (tipoDeEmissor.trim().toUpperCase()) {
            case "SMS":
                return create(SMS);
            case "EMAIL":
                return create(EMAIL);
            case "WHATSAPP":
                return create(WHATSAPP);
            default:
                throw new IllegalArgumentException("Tipo de emissor inválido: " + tipoDeEmissor);
        }
    }
}