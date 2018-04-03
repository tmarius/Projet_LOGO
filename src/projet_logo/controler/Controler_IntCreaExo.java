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
                window.getCreaEx().creaTortueG();
                break;
            case "ANNULER": //undo la dernière action
                break;
            case "AVANCER": //fait avancer la tortue
                window.getCreaEx().getTortue(window.getCreaEx().gettActuelle()).avancer();
                break;
            case "TRACER": //active ou désactive le tracage de la tortue
                if ((window.getCreaEx().getTortue(window.getCreaEx().gettActuelle())).enTrace() == true) {
                    window.getCreaEx().getTortue(window.getCreaEx().gettActuelle()).setTrace(false);
                } else {
                    window.getCreaEx().getTortue(window.getCreaEx().gettActuelle()).setTrace(true);
                }
                break;
            case "TOURNER": //fait tourner la tortue
                window.getCreaEx().getTortue(window.getCreaEx().gettActuelle()).tourner();
                break;
            case "+": //augmente la vitesse de la tortue de 1
                window.getCreaEx().gettRapide().accelerer();
                break;
            case "-": //diminue la vitesse de la tortue de 1
                window.getCreaEx().gettRapide().ralentir();
                break;
            case "classique": //démarre une tortue classique
                window.getCreaEx().creaTortueG();
                window.getCreaEx().getMoins().setEnabled(false);
                window.getCreaEx().getPlus().setEnabled(false);
                break;
            case "rapide": //démarre une tortue rapide (on peut changer sa vitesse)
                window.getCreaEx().getMoins().setEnabled(true);
                window.getCreaEx().getPlus().setEnabled(true);
                window.getCreaEx().creaTortueR();
                break;
            case "couleur": //démarre une tortue dont on peut changer la couleur
                window.getCreaEx().creaTortueC();
                window.getCreaEx().getMoins().setEnabled(false);
                window.getCreaEx().getPlus().setEnabled(false);
                break;
            case "RETOUR": //ramène à l'écran précédent (ici de connexion mais manque une fenêtre de choix d'exercice)
                window.refreshW(window.getCoProf().getConnexionProf());
                break;
            case "RECOMMENCER": //réinitialise la tortue, le dessin et le code
                window.getCreaEx().getTortue(window.getCreaEx().gettActuelle()).reset();
                break;

        }

    }

}
