package tpe.oo.metropolis;

/**
 * Ein Bürger der Stadt Metropolis.
 * @author Christian Coenen
 *
 */
public class Buerger extends Mensch implements Einkommensteuerpflichtig{

    /**
     * Erzeugt einen Bürger.
     * @param name - Name des Bürgers
     * @param einkommen - Einkommen des Bürgers
     * @param alter - Alter des Bürgers
     */
    Buerger(String name, int einkommen, int alter) {
        super(name, einkommen, alter);
    }

    /**
     * Methode zur Berechnung der Einkommensteuer.
     * @return zu zahlende Steuern als "int"
     */
    public int einkommensteuer() {
        int einkommen = this.getEinkommen();
        int steuern = 0;
        switch(einkommen % 20000) {
            case 3:
                steuern += (einkommen - 60000) * 0.4;
                einkommen = 60000;
            case 2:
                steuern += (einkommen - 40000) * STEUERSATZ3_E;
                einkommen = 40000;
            case 1:
                steuern += (einkommen - 20000) * STEUERSATZ2_E;
                einkommen = 20000;
            case 0:
                steuern += (einkommen) * STEUERSATZ1_E;
                einkommen = 0;
                break;
            default:
                throw new IllegalArgumentException(
                        "Bei der Einkommensteuerberechnung ist etwas schief gegangen!");
        }
        return steuern;
    }

    @Override
    public int steuer() {
        return einkommensteuer();
    }
}
