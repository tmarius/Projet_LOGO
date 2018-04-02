/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.controler;

import java.awt.event.*;
import projet_logo.vue.MainWindow;

/**
 * Classe qui est le controler de l'interface principale de l'élève permet de
 * controler la tortue controle aussi des boutons pour changer de fenêtre et des
 * boutons pour enregistrer des données dans le modèle permet de contoler les
 * boutons de changement de fenêtre ainsi que les déplacements de la tortue
 *
 * @author morgane
 *
 */
public class Controler_IntCreaExo implements ActionListener {

    private MainWindow window;
    private String button;

    public Controler_IntCreaExo(MainWindow w, String b) {
        button = b;
        window = w;
    }

    public void actionPerformed(ActionEvent a) {

        switch (button) {
            case "SAUVEGARDE": //on enregistre la création de l'exercice
                break;
            case "COMMENCER": //permet de commencer l'exercice, fait apparaitre la tortue classique
                window.getPrEleve().creaTortueG();
                break;
            case "ANNULER": //undo la dernière action
                break;
            case "AVANCER": //fait avancer la tortue
                window.getPrEleve().getTortue(window.getPrEleve().gettActuelle()).avancer();
                break;
            case "TRACER": //active ou désactive le tracage de la tortue
                if ((window.getPrEleve().getTortue(window.getPrEleve().gettActuelle())).enTrace() == true) {
                    window.getPrEleve().getTortue(window.getPrEleve().gettActuelle()).setTrace(false);
                } else {
                    window.getPrEleve().getTortue(window.getPrEleve().gettActuelle()).setTrace(true);
                }
                break;
            case "TOURNER": //fait tourner la tortue
                window.getPrEleve().getTortue(window.getPrEleve().gettActuelle()).tourner();
                break;
            case "+": //augmente la vitesse de la tortue de 1
                window.getPrEleve().gettRapide().accelerer();
                break;
            case "-": //diminue la vitesse de la tortue de 1
                window.getPrEleve().gettRapide().ralentir();
                break;
            case "classique": //démarre une tortue classique
                window.getPrEleve().creaTortueG();
                window.getPrEleve().getMoins().setEnabled(false);
                window.getPrEleve().getPlus().setEnabled(false);
                break;
            case "rapide": //démarre une tortue rapide (on peut changer sa vitesse)
                window.getPrEleve().getMoins().setEnabled(true);
                window.getPrEleve().getPlus().setEnabled(true);
                window.getPrEleve().creaTortueR();
                break;
            case "couleur": //démarre une tortue dont on peut changer la couleur
                window.getPrEleve().creaTortueC();
                window.getPrEleve().getMoins().setEnabled(false);
                window.getPrEleve().getPlus().setEnabled(false);
                break;
            case "RETOUR": //ramène à l'écran précédent (ici de connexion mais manque une fenêtre de choix d'exercice)
                window.refreshW(window.getCoEleve().getConnexionEleve());
                break;
            case "RECOMMENCER": //réinitialise la tortue, le dessin et le code
                window.getPrEleve().getTortue(window.getPrEleve().gettActuelle()).reset();
                break;

        }

    }

}
