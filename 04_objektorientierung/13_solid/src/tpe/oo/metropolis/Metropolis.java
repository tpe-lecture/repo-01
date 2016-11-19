package tpe.oo.metropolis;

/**
 * Hauptklasse, welche die Stadt verwaltet.
 * @author Christian Coenen
 *
 */
public class Metropolis {

    /**
     * Main Klasse, zur Erzeugung der Stadt.
     * @param args
     */
    public static void main(String args[]) {

        Schurke azog = new Schurke("Azog der Schänder", 27990, "Orkismus");
        Schurke hannibal = new Schurke("Hannibal Lecter", 19910, "Kannibalismus");
        Schurke onox = new Schurke("Onox", 270201, "Legendismus");

        Syndikat sds = new Syndikat("Syndikat der Superschurken", azog, hannibal);

        Finanzamt finanzamt = new Finanzamt(azog, hannibal, onox, sds);

        System.out.println("Steuern für das Finanzamt: " + finanzamt.alleSteuern() + " Metro-Dollar");
    }

}
