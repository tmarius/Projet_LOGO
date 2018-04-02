/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Grp8
 * Classe permettant la création d'une interface destinée au professeur, afin qu'il puisse créer ou modifier un exercice.
 * Deux arbres sont placés dans l'interface : un permettant de rechercher un exercice en fonction de la difficulté, l'autre en fonction de la classe.
 */
public class InterfacePrincProf {
    
    private JPanel panelGauche, mainPanel;
    private TreeExo arbre, arbre2; //Les 2 arbres (un recherchant en fonction de la difficulté, l'autre en fonction de la classe.
    private JButton creer, modif; //Boutons créer exercice et modifier exercice.
            
        public InterfacePrincProf(){
        
        panelGauche = new JPanel(new GridLayout(4,0));
        mainPanel = new JPanel(new BorderLayout());
        
        //création des arbres
        arbre = new TreeExo();
        arbre2 = new TreeExo();
        
        //création des boutons
        creer = new JButton("Créer Exercice");
        modif = new JButton("Modifier Exercice");
        
        panelGauche.add(creer);
        panelGauche.add(modif);
        panelGauche.add(arbre);
        panelGauche.add(arbre2);
        mainPanel.add(panelGauche, BorderLayout.WEST);
        
    }
        
        public JPanel getInterfacePrincProf(){
        return mainPanel;
    }
}
