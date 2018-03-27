        /**
     * Classe connexionEleve crée une interface ou l'élève va rentrer son nom, son prénom et sa classe pour pouvoir démarrer l'appli
     * 
     * Avec méthode qui retourne un panel correspondant à l'affichage de la vue souhaité et que l'on va ajouter dans la frame principale.
     */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Lucas
 */
public class ConnexionEleve {

JPanel ic;
JPanel mainIc;
JPanel l4;
JPanel menuCentre;
JLabel l3;
JLabel image;
JLabel l1;
JLabel l2;
JButton b;
JButton retour;
JComboBox classe;
JTextField t2, t1;
JLabel l5;

    public ConnexionEleve(){
                
        ic = new JPanel();
        
        mainIc = new JPanel();
        l4 = new JPanel();
        
        //ajout espace à droite 
        l5 = new JLabel();
        l5.setPreferredSize(new Dimension(150,60));
        
        //ajout borderLayout
        ic.setLayout(new BorderLayout());
        mainIc.setLayout(new BorderLayout());
        l4.setLayout(new BorderLayout());
        //ajout GridLayout 4 lignes et 2 colonnes
        menuCentre = new JPanel(new GridLayout(4,3));
        //ajout du GridLayout au centre du BorderLayout
        mainIc.add(menuCentre,BorderLayout.CENTER);
        
        //ajout d'une image
        image = new JLabel(new ImageIcon(getClass().getResource("/projet_logo/images/tortue_connexion.PNG")));
        //redimension de l'image
        image.setPreferredSize(new Dimension(350,350));
        //placement de l'image dans le borderLayout au nord
        mainIc.add(image,BorderLayout.NORTH);
        
        //définition d'une couleur de fond
        menuCentre.setBackground(Color.white);
        l4.setBackground(Color.white);
        ic.setBackground(Color.white);
        mainIc.setBackground(Color.white);
        
        //adding the labels and text area
        l1 = new JLabel("Nom :");
        //modifier taille de la police
        l1.setFont(new Font("Arial",Font.BOLD,30));
        

        //taille du JLabel
        l1.setPreferredSize(new Dimension(150,50));
        //alignement horizontal du JLabel
        l1.setHorizontalAlignment(SwingConstants.LEFT);
        //alignement vertical du JLabel
        l1.setVerticalAlignment(SwingConstants.CENTER);
        menuCentre.add(l1);    
        
        t1 = new JTextField(); // à ajouter dans tous les Jtext une valeur par défaut qui est la variable de l'élève
        //modifier taille de police dans le JTextField
        t1.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(t1);
        
        l2 = new JLabel("Prénom :");
        //modifier taille de la police
        l2.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(l2);    
        t2 = new JTextField();
        //modifier taille de police dans le JTextField
        t2.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(t2);
        //vérifier que les noms et prénoms existent dans la base de données
        
        l3 = new JLabel("Classe");
        l3.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(l3);
        classe = new JComboBox();
        //relier à la base de données pour avoir les classes possibles
        menuCentre.add(classe);
                
        //ajout bouton démarrer
        b = new JButton("Démarrer");
        //changement de taille du bouton
        b.setPreferredSize(new Dimension(250,100));
        b.setFont(new Font("Arial",Font.BOLD,30));
        //placer le bouton au sud
        mainIc.add(b,BorderLayout.SOUTH);
        
        //ajout bouton retour
        retour = new JButton("Retour");
        l4.add(retour);
        //changement de taille du bouton
        retour.setPreferredSize(new Dimension(150,60));
        //changement de taille de la police du bouton
        retour.setFont(new Font("Arial",Font.BOLD,30));
        //placer le bouton au nord
        l4.add(retour,BorderLayout.NORTH);
        
        ic.add(l5,BorderLayout.EAST);
        ic.add(l4,BorderLayout.WEST);
        ic.add(mainIc);
        
//        //ajout du listener sur le bouton démarrer
//        b.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e) {
//
//                refreshW(interfacePrincEleve());
//            }
//        });
//        
//        //ajout du listener sur le bouton retour
//        retour.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e) {
//
//                refreshW(interfaceOuverture());
//            }
//        });
//        
        //besoin d'ajouter les listeners pour les text field, et que l'interface d'après soit spécifique de l'élève
        
    }
    
    public JPanel getConnexionEleve(){
                return ic;
}
    
}
