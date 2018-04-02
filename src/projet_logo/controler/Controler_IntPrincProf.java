package projet_logo.controler;

import java.awt.event.*;
import projet_logo.vue.*;

/**
 * Cette classe est le controleur de la fenetre de connexion, il controle
 * uniquement deux boutons qui renvoient vers d'autres fenêtres
 *
 * @author morgane
 */
public class Controler_IntPrincProf implements ActionListener {

    private MainWindow window;
    private String button;

    public Controler_IntPrincProf(MainWindow w, String b) {
        button = b;
        window = w;
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        switch (button) {
            case "creer":
                window.refreshW(window.getCreaEx().getInterfaceCreaExo());
                break;
            case "modifier":
                //window.refreshW(window.getCoEleve().getConnexionEleve());
                break;
        }

    }
}