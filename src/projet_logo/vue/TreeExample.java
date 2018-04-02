package projet_logo.vue;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import projet_logo.model.Classe;

/**
 * Classe permettant la création de Jtree. Un arbre possède des noeuds et sous-noeuds
 *
 *@author grp8
 */
public class TreeExample extends JPanel {

    private JTree tree;

    public void addSelectedItems() {
        DefaultTreeModel model = (DefaultTreeModel) tree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.add(new DefaultMutableTreeNode("another_child"));
        model.reload(root);
    }

    public TreeExample(Classe classe1bdd) {
        //créer le noeud racine
        DefaultMutableTreeNode école = new DefaultMutableTreeNode("Ecole");
        //créer les noeuds fils
        DefaultMutableTreeNode classe1 = new DefaultMutableTreeNode(classe1bdd.getClasse());
        //ajouter des sous noeuds au noeud fils
        classe1bdd.getEleves().forEach((unEleve) -> {
            classe1.add(new DefaultMutableTreeNode(unEleve.getPrenom() + " " + unEleve.getNom()));
        });

        DefaultMutableTreeNode classe2 = new DefaultMutableTreeNode("Classe Info"); //classe qui ne vient pas de la BDD

        //ajouter des sous noeuds au noeud fils
        classe2.add(new DefaultMutableTreeNode("élève4"));
        classe2.add(new DefaultMutableTreeNode("élève5"));
        classe2.add(new DefaultMutableTreeNode("élève6"));
        //ajouter les noeuds fils au noeud racine
        école.add(classe1);
        école.add(classe2);

        //créer l'arbre en passant par le noeud racine
        tree = new JTree(école);
        //afficher la clef devant le noeud racine
        tree.setShowsRootHandles(true);
        //afficher le noeud racine
        tree.setRootVisible(true);
        //créer la barre déroulante
        add(new JScrollPane(tree));

        //tree.setPreferredSize(new Dimension(150, 400));
    }
}
