package tpe.oo.metropolis;

/**
 * Ein Mensch in der Stadt Metropolis.
 * @author Christian Coenen
 *
 */
public abstract class Mensch extends Einwohner {

    /*
     * Das Alter des Menschen.
     */
    private int alter;

    /**
     * Liefert das Alter des Menschen.
     * @return das Alter des Menschen als "int" zwischen 0 und 120
     */
    public int getAlter() {
        if(alter >= 0 && alter <= 120)
            return alter;
        throw new IllegalArgumentException("Bitte gültiges Alter eingeben!");
    }

    /**
     * Erzeugt einen Menschen.
     * @param name - Name des Menschen
     * @param einkommen - Einkommen des Menschen
     * @param alter - Alter des Menschen
     */
    Mensch(String name, int einkommen, int alter) {
        super(name, einkommen);
        this.alter = alter;
    }

    /**
     * Erzeugt einen Menschen ohne Einkommen.
     * @param name - Name des Menschen
     * @param alter - Alter des Menschen.
     */
    Mensch(String name, int alter) {
        this(name, 0, alter);
    }

}
