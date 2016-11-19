package tpe.oo.metropolis;

/**
 * Ein Interface, welches gewerbesteuerpflichtigen Individuen implementieren müssen.
 * @author Christian Coenen
 *
 */
public interface Gewerbesteuerpflichtig extends Steuerpflichtig {

    /*
     * Steuersatz.
     */
    public double STEUERSATZ_G = 0.15;

    /*
     * Eine Gewerbsteuer, welche berechnet werden muss.
     */
    public int gewerbesteuer();
}
