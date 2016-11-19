package tpe.oo.metropolis;

/**
 * Eine Personengesellschaft in der Stadt Metropolis.
 * @author Christian Coenen
 *
 */
public class Personengesellschaft extends Unternehmen implements Einkommensteuerpflichtig {

    /*
     * Alle Bürger, welche Inhaber der Personengesellschaft sind.
     */
    private Buerger[] inhaber;

    /**
     * Liefert die Bürger, welche Inhaber der Personengesellschaft sind
     * @return s.o als "Buerger Array"
     */
    public Buerger[] getInhaber() {
        return inhaber;
    }

    /**
     * Erzeugt eine Personengesellschaft.
     * @param name - Name der Personengesellschaft
     * @param gewinn - Gewinn der Personengesellschaft
     * @param inhaber - Inhaber der Personengesellschaft
     */
    Personengesellschaft(String name, int gewinn, Buerger[] inhaber) {
        super(name, gewinn);
        this.inhaber = inhaber;
    }

    /**
     * Methode zur Berechnung der Gewerbesteuer.
     * @return zu zahlende Steuern als "int"
     */
    public int gewerbesteuer() {
        int summe = (int) (this.getGewinn() * STEUERSATZ_G - 800.0);
        if(summe >= 0)
            return summe;
        return 0;
    }

    /**
     * Methode zur Berechnung der Einkommensteuer.
     * @return zu zahlende Steuern als "int"
     */
    public int einkommensteuer() {
        int gewinn = this.getGewinn();
        int steuern = 0;
        switch(gewinn % 20000) {
            case 3:
                steuern += (gewinn - 60000) * 0.4;
                gewinn = 60000;
            case 2:
                steuern += (gewinn - 40000) * STEUERSATZ3_E;
                gewinn = 40000;
            case 1:
                steuern += (gewinn - 20000) * STEUERSATZ2_E;
                gewinn = 20000;
            case 0:
                steuern += (gewinn) * STEUERSATZ1_E;
                gewinn = 0;
                break;
            default:
                throw new IllegalArgumentException(
                        "Bei der Einkommensteuerberechnung ist etwas schief gegangen!");
        }
        return steuern;
    }

    @Override
    public int steuer() {
        return gewerbesteuer() + einkommensteuer();
    }
}
