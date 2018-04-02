/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
* méthode connexionProfesseur crée une interface ou le professeur va rentrer son identifiant et son mot de passe pour pouvoir démarrer l'appli
* @return un panel qui correspond à l'affichage et que l'on va ajouter dans la frame principale
*/
public class ConnexionProf{
                
JPanel ic;
JPanel mainIc;
JPanel l4;
JPanel menuCentre;
JLabel image;
JLabel l1;
JLabel l2;
JButton b;
JButton retour;
JComboBox classe;
JTextField t2, t1;
JLabel l5;

    public ConnexionProf(){
                
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
        
        //ajout GridLayout 3 lignes et 2 colonnes
        menuCentre = new JPanel(new GridLayout(3,2));
        
        //ajout du GridLayout au centre du BorderLayout
        mainIc.add(menuCentre,BorderLayout.CENTER);
        
        //ajout d'une image
        image = new JLabel(new ImageIcon(getClass().getResource("/projet_logo/images/bebeTortue.PNG")));
        
        //redimension de l'image
        image.setPreferredSize(new Dimension(500,500));
        
        //placement de l'image dans le borderLayout au nord
        mainIc.add(image,BorderLayout.NORTH);
        
        //définition d'une couleur de fond
        Color couleurBlanche = new Color(255,255,255);
        menuCentre.setBackground(couleurBlanche);
        l4.setBackground(couleurBlanche);
        ic.setBackground(couleurBlanche);
        mainIc.setBackground(couleurBlanche);
        
        //adding the labels and text area
        l1 = new JLabel("Identifiant :");
        //modifier taille de la police
        Font font = new Font(Font.SERIF,Font.BOLD,60);
        l1.setFont(font);
        

        //taille du JLabel
        l1.setPreferredSize(new Dimension(150,50));
        //alignement horizontal du JLabel
        l1.setHorizontalAlignment(SwingConstants.LEFT);
        //alignement vertical du JLabel
        l1.setVerticalAlignment(SwingConstants.CENTER);
        menuCentre.add(l1);    
        
        t1 = new JTextField(); // à ajouter dans tous les Jtext une valeur par défaut qui est la variable de l'élève
        //modifier taille de police dans le JTextField
        t1.setFont(font);
        menuCentre.add(t1);
        
        l2 = new JLabel("Mot de passe :");
        //modifier taille de la police
        l2.setFont(font);
        menuCentre.add(l2);    
        t2 = new JPasswordField();
        //modifier taille de police dans le JTextField
        t2.setFont(font);
        menuCentre.add(t2);
        
                
        //ajout bouton démarrer
        b = new JButton("Démarrer");
        //changement de taille du bouton
        b.setPreferredSize(new Dimension(250,100));
        b.setFont(new Font(Font.SERIF,Font.BOLD,100));
        //Changement de couleur de la police
        b.setForeground(couleurBlanche);
        //Changement du fond du bouton
        Color couleurFondBoutons = new Color(140,140,140);
        b.setBackground(couleurFondBoutons);
        //Ajout bordure noire de 5 pixels aux boutons
        b.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK));
        //placer le bouton au sud
        mainIc.add(b,BorderLayout.SOUTH);
        
        //ajout bouton retour
        retour = new JButton("Retour");
        //changement de taille du bouton
        Dimension dimensionRetour = new Dimension(140,75);
        retour.setPreferredSize(dimensionRetour);
        //changement de taille de la police du bouton
        Font fontRetour = new Font(Font.SERIF,Font.BOLD,35);
        retour.setFont(fontRetour);
        //Changement de couleur de la police
        retour.setForeground(couleurBlanche);
        //Changement du fond du bouton
        Color couleurFondRetour = new Color(255,120,120);
        retour.setBackground(couleurFondRetour);
        //Ajout bordure noire de 5 pixels aux boutons
        retour.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK));
        //Ajout du bouton retour au JPanel gauche
        l4.add(retour);
        //placer le bouton au nord
        l4.add(retour,BorderLayout.NORTH);
        
        b.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) { }
			@Override
			public void mouseEntered(MouseEvent e) {
                                Color SourisPasse = new Color(0,0,0);
				b.setBackground(SourisPasse);
			}
                        @Override
			public void mouseExited(MouseEvent e) {
				b.setBackground(couleurFondBoutons);

			}
			@Override
			public void mousePressed(MouseEvent e) { }
			@Override
			public void mouseReleased(MouseEvent e) { }
		});
        
        retour.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) { }
			@Override
			public void mouseEntered(MouseEvent e) {
                                Color SourisPasse = new Color(0,0,0);
                                retour.setBackground(SourisPasse);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				retour.setBackground(couleurFondRetour);
			}
			@Override
			public void mousePressed(MouseEvent e) { }
			@Override
			public void mouseReleased(MouseEvent e) { }
		});
        
        ic.add(l5,BorderLayout.EAST);
        ic.add(l4,BorderLayout.WEST);
        ic.add(mainIc);
              
        
    }
    
    public JPanel getConnexionProf(){
                return ic;
    }}