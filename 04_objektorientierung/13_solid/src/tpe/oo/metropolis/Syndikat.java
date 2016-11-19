package tpe.oo.metropolis;

/**
 * Syndikate in der Stadt Metropolis.
 * @author Christian Coenen
 *
 */
public class Syndikat implements Koerperschaftsteuerpflichtig {
    /*
     * Name des Syndikates.
     */
    private String name;

    /*
     * Schurken in dem Syndikat.
     */
    private Schurke[] schurken;

    /**
     * Liefert den Namen des Syndikates.
     * @return der Name des Syndikates als "String"
     */
    public String getName() {
        return name;
    }

    /**
     * Liefert die Schurken in dem Syndikat
     * @return die Schurken als "Schurken Array"
     */
    public Schurke[] getSchurken() {
        return schurken;
    }

    /**
     * Erzeugt ein Syndikat.
     * @param name - Name des Syndikates
     * @param schurken - Schurken in dem Syndikat
     */
    Syndikat(String name, Schurke... schurken) {
        this.name = name;
        this.schurken = schurken;
    }

    /**
     * Methode zur Berechnung der Körperschaftsteuer.
     * @return zu zahlende Steuern als "int"
     */
    public int koerperschaftsteuer() {
        int summe = 0;
        for(Schurke s : schurken) {
            summe += s.getEinkommen();
        }
        return (int) (summe*STEUERSATZ_K);
    }

    @Override
    public int steuer() {
        return koerperschaftsteuer();
    }
}
