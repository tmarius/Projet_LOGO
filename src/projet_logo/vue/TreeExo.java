/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import javax.swing.*;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import projet_logo.model.*;

/**
 *
 * @author Lucas
 */
public class TreeExo extends JPanel
{
        private JTree tree;
        public TreeExo(ListeExercices listeExos)
    {
          try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Exception e) {
                e.printStackTrace();
            }   
        //créer le noeud racine
        DefaultMutableTreeNode exo = new DefaultMutableTreeNode("Liste des exercices");
        //créer les noeuds fils
        DefaultMutableTreeNode exercices = new DefaultMutableTreeNode(listeExos.getListeExos());
        //ajouter des sous noeuds au noeud fils
        listeExos.getListeExos().forEach((exercice) -> {
        exercices.add(new DefaultMutableTreeNode(exercice.getId())); });
    
        
        DefaultMutableTreeNode niv2 = new DefaultMutableTreeNode("Exercices affirmés");
        //ajouter des sous noeuds au noeud fils
        niv2.add(new DefaultMutableTreeNode("Exercice 1"));
        niv2.add(new DefaultMutableTreeNode("Exercice 2"));
        niv2.add(new DefaultMutableTreeNode("Exercice 3"));
        //ajouter les noeuds fils au noeud racine
        DefaultMutableTreeNode niv3 = new DefaultMutableTreeNode("Exercices difficiles");
        niv3.add(new DefaultMutableTreeNode("Exercice 1"));
        niv3.add(new DefaultMutableTreeNode("Exercice 2"));
        niv3.add(new DefaultMutableTreeNode("Exercice 3"));
        exo.add(exercices);
        exo.add(niv2);
        exo.add(niv3);
        
         
        //créer l'arbre en passant par le noeud racine
        tree = new JTree(exo);
        //afficher la clef devant le noeud racine
        tree.setShowsRootHandles(true);
        //afficher le noeud racine
        tree.setRootVisible(true);
        //créer la barre déroulante
        add(new JScrollPane(tree));
        //tree.setPreferredSize(new Dimension(100, 200));
} 
}

