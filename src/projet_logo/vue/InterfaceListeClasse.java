    /**
     * Classe interfaceListe affiche une fenêtre qui contient sur la gauche une liste des classes
     * quand le prof sélectionne une classe, la liste des élèves de cette classe apparait sur la droite, il peut ensuite sélectionner un élève pour l'évaluer
     * 
     * Avec méthode qui retourne un panel correspondant à l'affichage de la vue souhaité et que l'on va ajouter dans la frame principale.
     * 
     */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JPanel;
import projet_logo.model.Classe;

/**
 *
 * @author Lucas
 */
public class InterfaceListeClasse {
    private final JPanel menuDroite;
   
    private TableDisplay table;
    private TreeExample trees ;
    private JPanel Thewindows;
    private JButton retour;
      
    public InterfaceListeClasse(Classe classe1) 
    {    
        table = new TableDisplay();
        
        Thewindows= new JPanel();
        Thewindows.setLayout(new BorderLayout());
        menuDroite = new JPanel();
        menuDroite.setLayout(new BorderLayout());
        
        menuDroite.add(table.createTable(classe1) , BorderLayout.EAST);
        Thewindows.add(trees = new TreeExample(classe1), BorderLayout.WEST);
        Thewindows.add(menuDroite, BorderLayout.EAST);
        
        //ajout bouton retour
        retour = new JButton("Retour");
        Thewindows.add(retour);
        //changement de taille du bouton
        retour.setPreferredSize(new Dimension(150,60));
        //changement de taille de la police du bouton
        retour.setFont(new Font("Arial",Font.BOLD,30));
        //placer le bouton au nord
        Thewindows.add(retour,BorderLayout.SOUTH);
    }        
    
    public JPanel getInterfaceListeClasse(){
        return Thewindows;
    }
}
