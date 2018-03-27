    /**
     * Classe interfaceCreaExo crée une interface accessible par le professeur et qui lui permet de créer des exercices
     * il visualise le dessin, le code, et a des boutons pour pouvoir diriger la tortue, elle ressemble à l'interface principale de l'élève avec des boutons de création en plus
     * 
     * Avec méthode qui retourne un panel correspondant à l'affichage de la vue souhaité et que l'on va ajouter dans la frame principale.
     */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lucas
 */
public class InterfaceCreaExo{
    
private JPanel  mainPanel, panelGauche,panelInteract,  panelMenu, setVitesse, baniere, milieu, buttons;
private BorderLayout layout;
private ImageIcon haut, gauche, droite, bas;
private JButton bgauche, bdroite, bbas, bhaut, choixCouleur;
private JOptionPane popup;
            
    public InterfaceCreaExo(){
    
        //panel principal
        layout = new BorderLayout();
        mainPanel = new JPanel(layout);        
        panelGauche = new JPanel(new GridLayout(2,0));

        //menu pour interagir avec la tortue, qui se trouve dans le menu droite 
        panelInteract = new JPanel(new GridLayout(4,3));
        panelInteract.add(new JLabel(" "));
        
        haut = new ImageIcon(getClass().getResource("/projet_logo/images/flechehaut-ConvertImage.jpg"));
        bhaut = new JButton(haut);
        bhaut.setBackground(Color.WHITE);
        panelInteract.add(bhaut);
        
        panelInteract.add(new JLabel(" "));
        
        gauche = new ImageIcon(getClass().getResource("/projet_logo/images/flechegauche-ConvertImage.JPG"));
        bgauche = new JButton(gauche);
        bgauche.setBackground(Color.WHITE);
        panelInteract.add(bgauche);
        
        panelInteract.add(new JButton("AVANCER"));
        
        droite = new ImageIcon(getClass().getResource("/projet_logo/images/flechedroite-ConvertImage.JPG"));        
        bdroite = new JButton(droite);
        bdroite.setBackground(Color.WHITE);
        panelInteract.add(bdroite);
        
        panelInteract.add(new JLabel(" "));
        
        bas = new ImageIcon(getClass().getResource("/projet_logo/images/flechebas-ConvertImage.JPG"));        
        bbas = new JButton(bas);
        bbas.setBackground(Color.WHITE);
        panelInteract.add(bbas);
        
        panelInteract.add(new JLabel(" "));
        
        panelInteract.add(new JLabel("Vitesse de la tortue : "+2)); //changer le chiffre avec la vitesse effective de la tortue
        //deux boutons + et - dans une seule case du grid
        setVitesse = new JPanel(new GridLayout(2,0));
        setVitesse.add(new JButton("+"));
        //setVitesse.add(new JLabel(" "));
        setVitesse.add(new JButton("-"));
        panelInteract.add(setVitesse);

        //pop up pour choisir la couleur d'écriture de la tortue
        choixCouleur = new JButton("Couleur");
        popup = new JOptionPane("mettre pop up pour couleur");

        //menu de gauche
        panelMenu = new JPanel(new GridLayout(9,0));
        panelMenu.add(new JLabel(" "));
        panelMenu.add(new JButton("COMMENCER"));
        panelMenu.add(new 
            JButton("UNDO"));
        panelMenu.add(new 
            JButton("REDO"));
        panelMenu.add(new 
            JButton("EFFACER"));
        panelMenu.add(new JLabel(" "));
        panelMenu.add(new 
            JButton("SAUVEGARDER"));
        panelMenu.add(new JButton("CRITERES"));
        panelMenu.add(new JButton("RETOUR"));
        
        //on met les panels en place
        panelGauche.add(panelMenu);
        mainPanel.add(panelGauche, BorderLayout.WEST);
        
        //banière du dessus
        baniere = new JPanel(new GridLayout(0,2));
        baniere.add(new JLabel("Créer Exercice"));
        baniere.add(new JLabel("Nom Exercice"));
        mainPanel.add(baniere, BorderLayout.NORTH);
        
        //menu du milieu
        milieu = new JPanel(new GridLayout(2,2));
        milieu.add(new JLabel(new ImageIcon(getClass().getResource("/projet_logo/images/tortue_connexion.png")))); //ajouter des trucs de la bdd
        milieu.add(new JTextField("CODE"));
        milieu.add(panelInteract);
        
        buttons = new JPanel(new GridLayout(3,0));
        buttons.add(new JButton("Créer Tortue"));
        buttons.add(new JButton("Créer Tortue Rapide"));
        buttons.add(new JButton("Créer Tortue Couleur"));
        milieu.add(buttons);
        
        
        mainPanel.add(milieu, BorderLayout.CENTER);
       
        
               
    }
    public JPanel getInterfaceCreaExo(){
    return mainPanel;
    }

   
}
