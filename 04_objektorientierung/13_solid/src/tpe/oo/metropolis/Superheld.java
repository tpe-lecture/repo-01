package tpe.oo.metropolis;

/**
 * Superhelden in der Stadt Metropolis.
 * @author Christian Coenen
 *
 */
public class Superheld extends Mutant {

    /*
     * Die Superkräfte des Superhelden.
     */
    private Superkraft[] superkräfte;

    /**
     * Liefert die Superkräfte des Superhelden.
     * @return die Superkräfte des Superhelden als "Superkraft Array"
     */
    public Superkraft[] getSuperkräfte() {
        return superkräfte;
    }

    /**
     * Erzeugt einen Superhelden.
     * @param name - Name des Superhelden
     * @param einkommen - Einkommen des Superhelden
     * @param mutation - Mutation des Superhelden
     * @param superkräfte - Superkräfte des Superhelden
     */
    Superheld(String name, int einkommen, String mutation, Superkraft[] superkräfte) {
        super(name, einkommen, mutation);
        this.superkräfte = superkräfte;
    }

    /**
     * Erzeugt einen Superhelden ohne Einkommen.
     * @param name - Name des Superhelden
     * @param mutation - Mutation des Superhelden
     * @param superkräfte - Superkräfte des Superhelden
     */
    Superheld(String name, String mutation, Superkraft[] superkräfte) {
        super(name, 0, mutation);
        this.superkräfte = superkräfte;
    }

    /**
     * Der Superheld kämpft gegen einen Schurken.
     * @param s - Schurke
     * @return "true wenn der Superheld gewinnt, "false" wenn nicht
     */
    public boolean kaempfe(Schurke s) {
        for(Superkraft sup : this.getSuperkräfte()) {
            if(sup.equals(s.getSchwäche()))
                return true;
        }
        return false;
    }
}
