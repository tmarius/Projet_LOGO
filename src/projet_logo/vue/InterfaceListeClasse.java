    /**
     * Classe interfaceListe affiche une fenêtre qui contient sur la gauche une liste des classes
     * quand le prof sélectionne une classe, la liste des élèves de cette classe apparait sur la droite, il peut ensuite sélectionner un élève pour l'évaluer
     * 
     * Avec méthode qui retourne un panel correspondant à l'affichage de la vue souhaité et que l'on va ajouter dans la frame principale.
     * 
     */
package projet_logo.vue;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Lucas
 */
public class InterfaceListeClasse {
    
   JPanel mainPanel, panelClasses, panelEleves;
    
    public InterfaceListeClasse(){
        mainPanel = new JPanel(new BorderLayout());
        
        //ajout des panels
        panelClasses = new JPanel();
       // panelClasses.add(new TreeExample(classe1bdd)
       mainPanel.add(panelClasses);
    }
    
    public JPanel getInterfaceListeClasse(){
        return mainPanel;
    }
}
