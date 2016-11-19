package tpe.oo.metropolis;

/**
 * Das Finanzamt der Stadt Metropolis.
 * @author Christian
 *
 */
public class Finanzamt {

    Steuerpflichtig[] stpfl;

    Finanzamt(Steuerpflichtig... stpfl) {
        this.stpfl = stpfl;
    }


    public int alleSteuern() {
        int steuern = 0;
        for(Steuerpflichtig s : stpfl) {
            steuern += s.steuer();
        }
        return steuern;
    }
}
