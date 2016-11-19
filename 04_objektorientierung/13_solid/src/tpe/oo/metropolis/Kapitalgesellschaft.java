package tpe.oo.metropolis;

/**
 * Kapitalgesellschaften in der Stadt Metropolis.
 * @author Christian Coenen
 *
 */
public class Kapitalgesellschaft extends Unternehmen implements Koerperschaftsteuerpflichtig {

    /*
     * Alle Bürger, welche Gesellschafter der Kapitalgesellschaft sind.
     */
    private Buerger[]  gesellschafter;

    /**
     * Liefert alle Bürger, welche Gesellschafter der Kapitalgesellschaft sind.
     * @return s.o als "Bürger Array"
     */
    public Buerger[] getGesellschafter() {
        return gesellschafter;
    }

    /**
     * Erzeugt eine Kapitalgesellschaft
     * @param name - Name der Kapitalgesellschaft
     * @param gewinn - Gewinn der Kapitalgesellschaft
     * @param gesellschafter - Gesellschafter der Kapitalgesellschaft
     */
    Kapitalgesellschaft(String name, int gewinn, Buerger[] gesellschafter) {
        super(name, gewinn);
        this.gesellschafter = gesellschafter;
    }

    /**
     * Methode zur Berechnung der Körperschaftsteuer.
     * @return zu zahlende Steuern als "int"
     */
    public int koerperschaftsteuer() {
        return (int) (this.getGewinn() * STEUERSATZ_K);
    }

    /**
     * Methode zur Berechnung der Gewerbesteuer
     * @return zu zahlende Steuern als "int"
     */
    public int gewerbesteuer() {
        return (int) (this.getGewinn() * STEUERSATZ_G);
    }

    @Override
    public int steuer() {
        return koerperschaftsteuer() + gewerbesteuer();
    }
}
