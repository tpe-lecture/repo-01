package tpe.oo.metropolis;

/**
 * Ein Interface, welches koerperschaftsteuerpflichtige Individuen implementieren müssen.
 * @author Christian Coenen
 *
 */
public interface Koerperschaftsteuerpflichtig extends Steuerpflichtig {

    /*
     * Steuersatz.
     */
    public double STEUERSATZ_K = 0.15;

    /*
     * Eine Körperschaftsteuer, welche berechnet werden muss.
     */
    public int koerperschaftsteuer();
}
