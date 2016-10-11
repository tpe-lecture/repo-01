/**
 * Diese Klasse verwaltet Währungen. Man kann Währungen anlegen
 * und den Kurs mit anderen angelegten Währungen vergleichen.
 * @author Christian Coenen
 *
 */
public class Waehrung {

    /**
     * Instanzvariable, welche den Kurs speichert.
     * Kann nach der Objekterzeugung nichtmehr verändert werden
     */
    private final int kurs;

   /**
    * Instanzvariable, welche den Namen der Währung speichert.
    * Kann nach der Objekterzeugung nichtmehr verändert werden
    */
    private final String name;

    /**
     * Instanzvariable, welche das Kürzel der Währung speichert.
     * Kann nach der Objekterzeugung nichtmehr verändert werden
     */
    private final String kuerzel;

    /**
     * Klassenvariable, mit der gerechnet werden kann.
     * Ist mit dem festen Wert 10000 Initialisiert.
     */
    private static final long TEILER = 10000;

    /**
     * Erzeugt ein neues Objekt.
     *
     * @param name Name der Währung (z.B. EURO).
     * @param kuerzel Kürzel der Währung (z.B. €).
     * @param kurs Wechselkurs zum Dollar.
     */
    public Waehrung(String name, String kuerzel, double kurs) {
        this.kurs = (int) (kurs * TEILER);
        this.name = name;
        this.kuerzel = kuerzel;
    }

    /**
     * Rechnet einen angegebenen Betrag einer Währung in eine andere Währung um.
     * @param betrag - Menge an Geld, die gewechselt werden soll
     * @param toWaehrung - Währung, in die gewechselt wird
     * @return betrag in der neuen Währung
     */
    public long umrechnen(long betrag, Waehrung toWaehrung) {
        return betrag * kurs / toWaehrung.kurs;
    }

    /**
     * Liefert den Wert des Kurses
     * @return s.o
     */
    public int getKurs() {
        return kurs;
    }
    
    /**
     * Liefert den Namen der Währung.
     * @return s.o
     */
    public String getName() {
        return name;
    }

    /**
     * Liefert das Kürzel der Währung.
     * @return s.o
     */
    public String getKuerzel() {
        return kuerzel;
    }

    /**
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return String.format("%s [%s] 1 %s = %.4f %s",
                name, kuerzel, "$",
                kurs / (double) TEILER, kuerzel);
    }

    /**
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((name == null) ? 0 : name.hashCode());
        result = prime * result + kurs;
        result = prime * result
                + ((kuerzel == null) ? 0 : kuerzel.hashCode());
        return result;
    }

    /**
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Waehrung other = (Waehrung) obj;
        if (name == null) {
            if (other.name != null) {
                return false;
            }
        }
        else if (!name.equals(other.name)) {
            return false;
        }
        if (kurs != other.kurs) {
            return false;
        }
        if (kuerzel == null) {
            if (other.kuerzel != null) {
                return false;
            }
        }
        else if (!kuerzel.equals(other.kuerzel)) {
            return false;
        }
        return true;
    }
}
