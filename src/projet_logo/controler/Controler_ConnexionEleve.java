/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.controler;

import java.awt.event.*;
import projet_logo.vue.*;

/**
 *Controler de l'interface de connexion des élèves
 * vérifie quand un nom est entré qu'il est dans la base de données et qu'il appartient bien à la classe mentionée
 * controle aussi deux boutons qui renvoient à d'autre fenêtres
 * @author morgane
 */
public class Controler_ConnexionEleve implements ActionListener {
    
    private MainWindow window;
    private String button;
    
    public Controler_ConnexionEleve(MainWindow w,String b){
        window = w;
        button = b;
    }
    
    @Override
    public void actionPerformed(ActionEvent a) {
        switch (button) {
            case "retour":
                window.refreshW(window.getInOuv().getInterfaceOuverture());
                break;
            case "démarrer":
                window.refreshW(window.getPrEleve().getInterfacePrincEleve());
                break;
        }
        
//à ajouter les controlers sur les données    
}
}
