package tpe.oo.metropolis;

/**
 * Mutant in der Stadt Metropolis.
 * @author Christian Coenen
 *
 */
public abstract class Mutant extends Einwohner {

    /*
     * Die Mutation des Mutanten.
     */
    private String mutation;

    /**
     * Liefert die Mutation des Mutanten.
     * @return die Mutation des Mutanten als "String"
     */
    public String getMutation() {
        return mutation;
    }

    /**
     * Erzeugt einen Mutationen.
     * @param name - Name des Mutanten
     * @param einkommen - Einkommen des Mutanten
     * @param mutation - Mutation des Mutanten
     */
    Mutant(String name, int einkommen, String mutation) {
        super(name, einkommen);
        this.mutation = mutation;
    }

    /**
     * Erzeugt einen Mutationen ohne Einkommen.
     * @param name - Name des Mutanten
     * @param mutation - Mutation des Mutanten
     */
    Mutant(String name, String mutation) {
        this(name, 0, mutation);
    }
}
