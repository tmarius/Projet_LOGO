/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.controler;

import java.awt.event.*;
import projet_logo.vue.*;

/**
 * Cette classe est le controleur de la fenetre de connexion, il controle
 * uniquement deux boutons qui renvoient vers d'autres fenêtres
 *
 * @author morgane
 */
public class Controler_ConnexionProf implements ActionListener {

    private MainWindow window;
    private String button;

    public Controler_ConnexionProf(MainWindow w, String b) {
        button = b;
        window = w;
    }

    @Override
    public void actionPerformed(ActionEvent a) {
        switch (button) {
            case "démarrer":
                window.refreshW(window.getPrProf().getInterfacePrincProf());
                break;
            case "retour":
                window.refreshW(window.getInOuv().getInterfaceOuverture());
                break;
        }

    }
}