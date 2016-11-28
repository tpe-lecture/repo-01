package tpe.generics.use;

import java.awt.AWTException;
import java.awt.EventQueue;
import java.awt.Robot;
import java.awt.event.InputEvent;

import de.smits_net.games.framework.board.MainWindow;

/**
 * Hauptklasse des Spiels.
 */
public class GameMain extends MainWindow {

    /**
     * Neues Spiel anlegen.
     */
    public GameMain() {
        super("Click the coins as fast as you can", new GameBoard());
    }

    /**
     * Startpunkt.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Spiel starten
        EventQueue.invokeLater(GameMain::new);
        try {
            Robot rob = new Robot();
            rob.mouseMove(900, 500);
            rob.delay(125);
            for(int i = 0; i <= 50; i++) {
                rob.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                rob.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            }

        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

