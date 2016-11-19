package tpe.oo.metropolis;

/**
 * Unternehmen in der Stadt Metropolis.
 * @author Christian Coenen
 *
 */
public abstract class Unternehmen extends Metropolis implements Gewerbesteuerpflichtig {

    /*
     * Name des Unternehmens.
     */
    private String name;

    /*
     * Gewinn des Unternehmens.
     */
    private int gewinn;

    /**
     * Liefert den Namen des Unternehmens.
     * @return der Name des Unternehmens als "String"
     */
    public String getName() {
        return name;
    }

    /**
     * Liefert den Gewinn des Unternehmens.
     * @return der Gewinn des Unternehmens als "int" >= 0
     */
    public int getGewinn() {
        if(gewinn >= 0)
            return gewinn;
        throw new IllegalArgumentException("Gewinn darf nicht negativ sein!");
    }

    /**
     * Erzeugt ein Unternehmen.
     * @param name - Name des Unternehmens
     * @param gewinn - Gewinn des Unternehmens
     */
    Unternehmen(String name, int gewinn) {
        this.name = name;
        this.gewinn = gewinn;
    }
}
