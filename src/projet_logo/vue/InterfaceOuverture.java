      
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

  /**
    * Classe interfaceOuverture 
    * Permet de créer une interface avec deux boutons
    * L'utilisateur peut choisir s'il se connecte en tant que professeur ou en tant qu'élève
    * Avec méthode qui retourne un panel correspondant à l'affichage de la vue souhaité et que l'on va ajouter dans la frame principale
    */
public class InterfaceOuverture {
    
private JPanel panel1;
private JPanel panel2;
private JButton prof; //Bouton qui sera : "je suis un professeur"
private JButton eleve; //Bouton qui sera : "je suis un élève"

    public InterfaceOuverture() {
        panel1 = new JPanel();
        panel2 = new JPanel();
    
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout());
        
        //création des deux boutons
        prof = new JButton("Je suis Professeur");
        eleve = new JButton("Je suis un élève");
        prof.setPreferredSize(new Dimension(80,150));
        
        //ajout des boutons au panel
        panel2.add(prof);
        panel2.add(eleve);
        
        panel1.add(panel2, BorderLayout.SOUTH);
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/projet_logo/images/tortue_connexion.png")); //Chemin relatif
        JLabel titre = new JLabel("Apprendre la programmation en s'amusant!", JLabel.CENTER);
        titre.setVerticalTextPosition(JLabel.BOTTOM);
        titre.setHorizontalTextPosition(JLabel.CENTER);
        titre.setIcon(logo); //Ajout de l'icone
        titre.setOpaque(true);
        titre.setBackground(Color.white);
        
        panel1.add(titre, BorderLayout.CENTER);
        
        }
    
public JPanel getInterfaceOuverture(){
                return panel1;
}
    
}
