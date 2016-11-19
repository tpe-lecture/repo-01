package tpe.oo.metropolis;

/**
 * Einwohner der Stadt Metropolis.
 * @author Christian Coenen
 *
 */
public abstract class Einwohner {

    /*
     * Der Name des Einwohners.
     */
    private String name;

    /*
     * Das Einkommen des Einwohners
     */
    private int einkommen;


    /**
     * Methode um den Namen des Einwohners zu erfahren.
     * @return den Namen des Einwohners als "String"
     */
    public String getName() {
        return name;
    }

    /**
     * Methode um das Einkommen des Einwohners zu erfahren.
     * @return das Einkommen des Einwohners als "int" >= 0
     */
    public int getEinkommen() {
        if(einkommen >= 0)
            return einkommen;
        throw new IllegalArgumentException("Das Einkommen darf nicht negativ sein!");
    }

    /**
     * Erzeugt einen Einwohner ohne Einkommen.
     * @param name - Name des Einwohners.
     */
    Einwohner(String name) {
        this.name = name;
    }

    /**
     * Erzeugt einen Einwohner.
     * @param name - Name des Einwohners
     * @param einkommen - Einkommen des Einwohners
     */
    Einwohner(String name, int einkommen) {
        this(name);
        this.einkommen = einkommen;
    }

}
