package tpe.oo.metropolis;

/**
 * Richter in der Stadt Metropolis.
 * @author Christian Coenen
 *
 */
public class Richter extends Mensch {

    /*
     * Sagt aus, ob der Richter korrupt ist oder nicht
     */
    private boolean isKorrupt;

    /**
     * Liefert die Information ob der Richter korrupt ist oder nicht.
     * @return "true" wenn der Richter korrupt ist, "false" wenn nicht
     */
    public boolean isKorrupt() {
        return isKorrupt;
    }

    /**
     * Erzeugt einen Richter.
     * @param name - Names des Richters
     * @param einkommen - Einkommen des Richters
     * @param alter - Alter des Richters
     * @param isKorrupt - Information ob der Richtiger korrupt ist oder nicht
     */
    Richter(String name, int einkommen, int alter, boolean isKorrupt) {
        super(name, einkommen, alter);
        this.isKorrupt = isKorrupt;
    }

    /**
     * Liefert die Information, ob ein Schurke verurteilt wurde oder nicht.
     * @param s - ein Schurke
     * @return "true" wenn der Schurke verurteilt wurde, "false" wenn nicht
     */
    protected boolean verurteilen(Schurke s) {
        return this.isKorrupt ? false : true;
    }



}
