package risk.vue;

import javax.swing.*;

/**
 * Objet fenêtre
 */
public class Fenetre {
    /**
     * Constructeur
     */
    public Fenetre() {
        JFrame frame = new JFrame("Risk");
        ImageIcon map = new ImageIcon("./img/map.png");
        JLabel mapLabel = new JLabel(map);
        frame.add(mapLabel);
        frame.setSize(1600, 900);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
