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
 * @author Lucas
 */
public class InterfacePrincProf {
    
    JPanel panelGauche, mainPanel;
    TreeExo arbre, arbre2;
    JButton creer, modif;
            
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
