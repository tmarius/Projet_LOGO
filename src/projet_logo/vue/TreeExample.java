package projet_logo.vue;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;



   
    
    public class TreeExample extends JPanel
{
        private JTree tree;
        
    public void addSelectedItems() {
        DefaultTreeModel model = (DefaultTreeModel)tree.getModel();
        DefaultMutableTreeNode root = (DefaultMutableTreeNode)model.getRoot();
        root.add(new DefaultMutableTreeNode("another_child"));
        model.reload(root);        
        }    
        
    public TreeExample(ResultSet ResultatRequete)
    {
        
            
            try {
                
                
                 //créer le noeud racine
        DefaultMutableTreeNode école = new DefaultMutableTreeNode(ResultatRequete.getString("prenom"));
        //créer les noeuds fils
        DefaultMutableTreeNode classe1 = new DefaultMutableTreeNode("Classe Bio");
        //ajouter des sous noeuds au noeud fils
        classe1.add(new DefaultMutableTreeNode("élève1"));
        classe1.add(new DefaultMutableTreeNode("élève2"));
        classe1.add(new DefaultMutableTreeNode("élève3"));
        DefaultMutableTreeNode classe2 = new DefaultMutableTreeNode("Classe Info");
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
                
                
                
                
                
                
                
                while (ResultatRequete.next())
                {
                    int idR = ResultatRequete.getInt("id");
                    String nameR = ResultatRequete.getString("name");
                    String prenomR = ResultatRequete.getString("prenom");
                    System.out.println(idR + "\t" +nameR + "\t" +prenomR);
                
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                //    return(null);
            }

            
        
        
        
        
       
        
        

        
    }
      
       
}
    
    
