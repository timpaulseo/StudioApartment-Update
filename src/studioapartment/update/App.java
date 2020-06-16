/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studioapartment.update;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Bunnyspa
 */
public class App {

   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
    }

    private App() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException ex) {
        }
        MainDialog dialog = new MainDialog();
        dialog.setVisible(true);
        dialog.start();
    }
}
