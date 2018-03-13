import javax.swing.*;
import java.awt.*;
/**
 * Classe pageOuverture est une interface avec deux boutons, permet de choisir si on se connecte en tant que prof ou en tant qu'élève
 * 
 */
public class InterfaceOuverture extends JFrame {
    
    JFrame frame = new JFrame("Logiciel d'apprentissage de l'informatique");
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    
    public void interfaceOuv(){
        
        panel1.setLayout(new BorderLayout());
        panel2.setLayout(new GridLayout());
        
        //création des deux boutons
        JButton prof = new JButton("Je suis Professeur");
        JButton eleve = new JButton("Je suis un élève");
        prof.setPreferredSize(new Dimension(80,150));
        
        //ajout des boutons au panel
        panel2.add(prof);
        panel2.add(eleve);
        panel1.add(panel2, BorderLayout.SOUTH);
        
        ImageIcon logo = new ImageIcon("C:/Users/morgane/Documents/Cours/Master/S1/OOP-OOD/projets cours/interactive counter/tortue2.PNG");
        JLabel titre = new JLabel("Nom app", JLabel.CENTER);
        titre.setVerticalTextPosition(JLabel.BOTTOM);
        titre.setHorizontalTextPosition(JLabel.CENTER);
        titre.setIcon(logo);
        titre.setOpaque(true);
        titre.setBackground(Color.white);
        
        panel1.add(titre, BorderLayout.CENTER);
        
        frame.setExtendedState(frame.MAXIMIZED_BOTH); //permet de mettre la fenêtre en plein écran
        frame.add(panel1);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        
    }    
}