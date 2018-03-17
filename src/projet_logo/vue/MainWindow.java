/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import projet_logo.model.Classe;

/**
 * Page principale. Est une frame ayant des pannels changeant en fonction de l'interface. 
 */
public class MainWindow extends JFrame {
    Formulaire formulaires = new Formulaire() ;
    TreeExample trees ;
    TableDisplay table = new TableDisplay();
            
    private JPanel menuDroite;
    private JFrame windows;
    private ResultSet Result;
    
    public void RefreshW(Classe classe1) {
        
    windows = new JFrame("Projet_LOGO");
    
    windows.setLayout(new BorderLayout());
    
    
    menuDroite = new JPanel();
    menuDroite.setLayout(new BorderLayout());
    menuDroite.add(formulaires.InterfaceEleve() , BorderLayout.NORTH);
    menuDroite.add(table.createTable() , BorderLayout.SOUTH);
    windows.add(trees = new TreeExample(classe1), BorderLayout.WEST);
    windows.add(menuDroite, BorderLayout.EAST);
    windows.setVisible(true);
    windows.pack();
   // windows.setSize(1000,1000);
    }
    /**
     * méthode interfaceOuverture crée une interface avec deux boutons, permet de choisir si on se connecte en tant que prof ou en tant qu'élève
     */
    public void interfaceOuverture() {
        
        }
    
    /**
     * méthode connexionEleve crée une interface ou l'élève va rentrer son nom, son prénom et sa classe pour pouvoir démarrer l'appli
     */
    public void connexionEleve(){
        
    }
    
    /**
     * méthode listeExos affiche la liste de tous les exercices disponibles pour les élèves.
     * Chaque nom d'exercice est accompagné d'une image qui permet de mieux visualiser l'exercice
     */
    public void listeExos(){
        
    }
    
    /**
     * méthode interfacerésultats crée une interface accessible pour les élèves et qi va afficher la liste des résultats
 * des exercices qu'ils ont déja réalisé.
 * Pour chaque exercice on affiche le dessin et le code qui ont été réalisés, ainsi qu'une appréciation et un commentaire du prof
     */
    
    public void interfaceResultats(){
        
    }
    
    /**
     * méthode interfacePrincEleve permet d'afficher la vue principale
 * dans cette interface, on a quatre différentes parties, une avec des boutons pour gérer la tortue
 * une avec le modèle du dessin qu'il doit réaliser
 * une avec le dessin en cours de réalisation, et la tortue qui bouge
 * une avec le code qui s'affiche au fur et à mesure, synchronisé avec le dessin
     */
    
    public void interfacePrincEleve(){
        
    }
    
    /**
     * méthode interfaceCreaExo crée une interface accessible par le professeur et qui lui permet de créer des exercices
     * il visualise le dessin, le code, et a des boutons pour pouvoir diriger la tortue, elle ressemble à l'interface principale de l'élève avec des boutons de création en plus
     */
    
    public void interfaceCreaExo(){
        
    }
    
    /**
     * méthode interfaceConnexionProf permet au prof de se connecter avec un mdp
     */
    
    public void interfaceConnexionProf(){
        
    }
    
    /**
     * méthode interfaceListe affiche une fenêtre qui contient sur la gauche une liste des classes
     * quand le prof sélectionne une classe, la liste des élèves de cette classe apparait sur la droite, il peut ensuite sélectionner un élève pour l'évaluer
     * 
     */
    
    public void interfaceListe(){
        
    }
    
    /**
     * méthode eleveExo permet d'obtenir une fenêtre correspondant à un élève précis et qui affiche la liste des exercices qu'il a faits ainsi que le nombre d'essais pour chacun et le statut
     */
    
    public void eleveExo(){
        
    }
    
    /**
     * méthode eleveTenta permet d'afficher une fenêtre spécifique à un élève et à un exercice et qui recense toutes les tentatives qu'il a effectué
     * le professeur pourra y changer le statut de l'exercice et mettre des commentaires
     */
    
    public void eleveTenta(){
        
    }
    
    /**
     * méthode interfacePrincProf affiche une fenetre ou le prof peut visualiser la liste des classes et accéder aux élèves, à la liste des exercices, et à l'interface de création d'exercice
     */
    
    public void interfacePrincProf(){
        
    }
    
    /**
     * méthode interfacevisuExo crée une fenêtre à partir de laquelle leprof pourra visualiser les exercices qu'il a déja créé
     * sur la gauche on a la liste des exercices et sur la droite on peut voir le dessin et le code voulu, ainsi que les critères d'évaluation pour chaque statut
     */
}
