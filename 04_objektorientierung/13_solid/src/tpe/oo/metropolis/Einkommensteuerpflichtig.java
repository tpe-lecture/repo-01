package tpe.oo.metropolis;

/**
 * Ein Interface, welches einkommensteuerpflichtige Individuen implementieren müssen.
 * @author Christian Coenen
 *
 */
public interface Einkommensteuerpflichtig extends Steuerpflichtig {

    /*
     * Steuersatz.
     */
    public double STEUERSATZ1_E = 0.08;
    public double STEUERSATZ2_E = 0.15;
    public double STEUERSATZ3_E = 0.25;

    /*
     * Eine Einkommensteuer, welche berechnet werden muss.
     */
    public int einkommensteuer();
}
