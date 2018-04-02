/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.UIManager;
import javax.swing.tree.DefaultMutableTreeNode;
import projet_logo.model.Exercice;

/**
 *
 * @author grp8
 * ajout d'arbres. Chaque arbre possède un titre, et des sous dossiers. Dans ces derniers se trouvent différents exercices.
 *L'utilisateur peut cliquer sur un exercice.
 */
public class TreeExo extends JPanel
{
        private JTree tree;
        public TreeExo()
    {
          try {
                UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            } catch (Exception e) {
                e.printStackTrace();
            }   
        //créer le noeud racine
        DefaultMutableTreeNode exo = new DefaultMutableTreeNode("Liste des exercices"); //titre ed l'arbre
        //créer les noeuds fils
        DefaultMutableTreeNode niv1 = new DefaultMutableTreeNode("Exercices débutants"); //sous-dossier 1
        //ajouter des sous noeuds au noeud fils
        //niv1.add(new DefaultMutableTreeNode(exercice.getId()));
        niv1.add(new DefaultMutableTreeNode("Exercice 2"));
        niv1.add(new DefaultMutableTreeNode("Exercice 3"));
        DefaultMutableTreeNode niv2 = new DefaultMutableTreeNode("Exercices affirmés"); //sous-dossier 2
        //ajouter des sous noeuds au noeud fils
        niv2.add(new DefaultMutableTreeNode("Exercice 1"));
        niv2.add(new DefaultMutableTreeNode("Exercice 2"));
        niv2.add(new DefaultMutableTreeNode("Exercice 3"));
        //ajouter les noeuds fils au noeud racine
        DefaultMutableTreeNode niv3 = new DefaultMutableTreeNode("Exercices difficiles"); //sous-dossier 3
        niv3.add(new DefaultMutableTreeNode("Exercice 1"));
        niv3.add(new DefaultMutableTreeNode("Exercice 2"));
        niv3.add(new DefaultMutableTreeNode("Exercice 3"));
        exo.add(niv1);
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
