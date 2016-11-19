package tpe.oo.metropolis;

/**
 * Eine Superkraft aus Metropolis.
 * @author Christian Coenen
 *
 */
public class Superkraft {

    /*
     * Name der Superkraft.
     */
    private String name;

    /**
     * Liefert den Namen der Superkraft.
     * @return den Namen der Superkraft als "int"
     */
    public String getName() {
        return name;
    }

    /**
     * Erzeugt eine Superkraft.
     * @param name - Name der Superkraft
     */
    Superkraft(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Superkraft other = (Superkraft) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        }
        else if (!name.equals(other.name))
            return false;
        return true;
    }



}
