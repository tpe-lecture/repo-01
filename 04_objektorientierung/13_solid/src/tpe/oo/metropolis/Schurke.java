package tpe.oo.metropolis;

/**
 * Schurken in der Stadt Metropolis
 * @author Christian Coenen
 *
 */
public class Schurke extends Mutant implements Einkommensteuerpflichtig {

    /*
     * Eine Superkraft, gegen die der Schurke besonders anfällig ist.
     */
    private Superkraft schwäche;

    /**
     * Liefert die Schwäche des Schurken.
     * @return die Schwäche des Schurken als "Superkraft"
     */
    public Superkraft getSchwäche() {
        return schwäche;
    }

    /**
     * Erzeugt einen Schurken ohne Schwäche.
     * @param name - Name des Schurken
     * @param mutation - Mutation des Schurken
     * @param schwäche - Schwäche des Schurken
     */
    Schurke(String name, int einkommen, String mutation) {
        super(name, einkommen, mutation);
    }

    /**
     * Erzeugt einen Schurken.
     * @param name - Name des Schurken
     * @param mutation - Mutation des Schurken
     * @param schwäche - Schwäche des Schurken
     */
    Schurke(String name, int einkommen, String mutation, Superkraft schwäche) {
        super(name, einkommen, mutation);
        this.schwäche = schwäche;
    }

    /**
     * Erzeugt einen Schurken ohne Einkommen.
     * @param name - Name des Schurken
     * @param mutation - Mutation des Schurken
     * @param schwäche - Schwäche des Schurken
     */
    Schurke(String name, String mutation, Superkraft schwäche) {
        super(name, 0, mutation);
        this.schwäche = schwäche;
    }

    /**
     * Der Schurke kämpft gegen einen Superhelden.
     * @param held - Superheld
     * @return "true wenn der Schurke gewinnt, "false" wenn nicht
     */
    public boolean kaempfe(Superheld held) {
        for(Superkraft s : held.getSuperkräfte()) {
            if(s.equals(schwäche))
                return false;
        }
        return true;
    }

    /**
     * Methode zur Berechnung der Einkommensteuer.
     * @return zu zahlende Steuern als "int"
     */
    public int einkommensteuer() {
        int einkommen = this.getEinkommen();
        int value = 0;
        int steuern = 0;
        if(einkommen / 20000 >= 3)
            value = 3;
        else
            value = einkommen / 20000;
        switch(value) {
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
