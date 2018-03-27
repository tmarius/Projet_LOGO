        /**
     * Classe interfacevisuExo crée une fenêtre à partir de laquelle leprof pourra visualiser les exercices qu'il a déja créé
     * sur la gauche on a la liste des exercices et sur la droite on peut voir le dessin et le code voulu, ainsi que les critères d'évaluation pour chaque statut
     * 
     * Avec méthode qui retourne un panel correspondant à l'affichage de la vue souhaité et que l'on va ajouter dans la frame principale.
     */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Lucas
 */
public class InterfaceVisuExo {
    
    JPanel mainPanel, centre, centreHaut;
    TreeExo arbre;

    public InterfaceVisuExo(){
       mainPanel = new JPanel(new BorderLayout());
       
       arbre = new TreeExo();
       mainPanel.add(arbre, BorderLayout.WEST);
       
       mainPanel.add(new JLabel("Nom Exercice"), BorderLayout.NORTH);
       
       centre = new JPanel(new GridLayout(2,0));
       centreHaut = new JPanel();
       centreHaut.add(new JLabel(new ImageIcon(getClass().getResource("/projet_logo/images/tortue_connexion.png"))));
       centreHaut.add(new JTextField("CODE QUI REJOUE"));
       
       centre.add(centreHaut);
       centre.add(new JTextArea("Critères d'évaluation :"));
       mainPanel.add(centre, BorderLayout.CENTER);
    }
    
    public JPanel getInterfaceVisuExo(){
        return mainPanel;
    }
            
}
