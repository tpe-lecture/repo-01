package tpe.nested.callback;

import java.util.Arrays;

/**
 * Hauptklasse.
 */
public class Main {

    private static final int[] ZAHLEN = {
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20
    };

    /**
     * Hauptmethode.
     *
     * @param args Kommandozeileargumente.
     */
    public static void main(String[] args) {

        NumberSelector s = new NumberSelector();

        int[] gerade = s.filter(new Predicate<Integer>() {
            @Override
            public boolean accept(Integer object) {
                return object % 2 == 0 ? true : false;
            }
        },ZAHLEN);

        System.out.println(Arrays.toString(gerade));

        int[] ungerade = s.filter(new Predicate<Integer>() {
            @Override
            public boolean accept(Integer object) {
                return object % 2 == 0 ? false : true;
            }
        }, ZAHLEN);

        System.out.println(Arrays.toString(ungerade));

    }
}
