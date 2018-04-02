      
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import projet_logo.controler.Controler_InterfaceOuverture;

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
private MainWindow frame;
private Controler_InterfaceOuverture controler1, controler2; 


    public InterfaceOuverture(MainWindow w) {
        
        frame = w;
        panel1 = new JPanel();
        panel2 = new JPanel();
    
        panel1.setLayout(new BorderLayout());
        //panel2.setLayout(new GridLayout());
        
        //création des deux boutons
        prof = new JButton("Je suis Professeur");
        eleve = new JButton("Je suis élève");
        
        //Changement couleur de la police
        Color couleurBlanche = new Color(255,255,255);
        prof.setForeground(couleurBlanche);
        eleve.setForeground(couleurBlanche);
        
        //Changement couleur de fond des boutons
        Color couleurFondBoutons = new Color(140,140,140);
        prof.setBackground(couleurFondBoutons);
        eleve.setBackground(couleurFondBoutons);
        
        //Ajout bordure noire de 5 pixels aux boutons
        eleve.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK));
        prof.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK));

        //création d'un JLabel vide pour séparer les deux boutons
        JLabel vide1 = new JLabel(" ");
        
        //modifier taille de la police
        Font font = new Font(Font.SERIF,Font.BOLD,60);
        prof.setFont(font);
        eleve.setFont(font);
        
        //Redimension des deux boutons et du JLabel
        Dimension dimension = new Dimension(700,150);
        prof.setPreferredSize(dimension);
        eleve.setPreferredSize(dimension);
        vide1.setPreferredSize(new Dimension(100,150));

        //ajout des boutons au panel
        panel2.add(prof);
        panel2.add(vide1);
        panel2.add(eleve);
        
        //Définition d'une couleur de fond
        panel2.setBackground(couleurBlanche);
        
        
        panel1.add(panel2, BorderLayout.SOUTH);
        
        prof.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) { }
			@Override
			public void mouseEntered(MouseEvent e) {
                                Color SourisPasse = new Color(0,0,0);
				prof.setBackground(SourisPasse);
			}
                        @Override
			public void mouseExited(MouseEvent e) {
				prof.setBackground(couleurFondBoutons);

			}
			@Override
			public void mousePressed(MouseEvent e) { }
			@Override
			public void mouseReleased(MouseEvent e) { }
		});
        
        eleve.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) { }
			@Override
			public void mouseEntered(MouseEvent e) {
                                Color SourisPasse = new Color(0,0,0);
                                eleve.setBackground(SourisPasse);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				eleve.setBackground(couleurFondBoutons);
			}
			@Override
			public void mousePressed(MouseEvent e) { }
			@Override
			public void mouseReleased(MouseEvent e) { }
		});
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/projet_logo/images/bebeTortue.png")); //Chemin relatif
        //ajout des listeners sur les boutons
        controler1 = new Controler_InterfaceOuverture(frame,"prof");
        controler2 = new Controler_InterfaceOuverture(frame,"eleve");
        prof.addActionListener(controler1);
        eleve.addActionListener(controler2);
        
        JLabel titre = new JLabel("Apprendre la programmation en s'amusant!", JLabel.CENTER);
        Font fontTitre = new Font(Font.SERIF,Font.BOLD,90);
        titre.setFont(fontTitre);
        titre.setVerticalTextPosition(JLabel.BOTTOM);
        titre.setHorizontalTextPosition(JLabel.CENTER);
        titre.setIcon(logo);
        titre.setOpaque(true);
        titre.setBackground(couleurBlanche);

        
        panel1.add(titre, BorderLayout.CENTER);
        
        }
    
public JPanel getInterfaceOuverture(){
                return panel1;
}
    
}
