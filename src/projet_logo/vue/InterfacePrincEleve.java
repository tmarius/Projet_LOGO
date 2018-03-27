    /**
     * Classe interfacePrincEleve permet d'afficher la vue principale
     * dans cette interface, on a quatre différentes parties, une avec des boutons pour gérer la tortue
     * une avec le modèle du dessin qu'il doit réaliser
     * une avec le dessin en cours de réalisation, et la tortue qui bouge
     * une avec le code qui s'affiche au fur et à mesure, synchronisé avec le dessin
     * 
     *  Avec méthode qui retourne un panel correspondant à l'affichage de la vue souhaité et que l'on va ajouter dans la frame principale.
     */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lucas
 */
public class InterfacePrincEleve {
    
JPanel  mainPanel, moyenPanel, panelGauche,panelInteract,  panelMenu, setVitesse;
BorderLayout layout;
ImageIcon haut, gauche, droite, bas, modèleImage;
JButton bgauche, bdroite, bbas, bhaut, choixCouleur;
JOptionPane popup;
GridBagConstraints constRev, constRes, constDessin, constImage, constCode;
JLabel dessin, modèle;
JTextField code;


    public InterfacePrincEleve(){ //mettre peut etre en parametre l'identité de l'utilisateur?
        
    
    //panel principal
        layout = new BorderLayout();
        mainPanel = new JPanel(layout);        
        moyenPanel = new JPanel(new GridBagLayout());
        panelGauche = new JPanel(new GridLayout(2,0));

        //menu pour interagir avec la tortue, qui se trouve dans le menu gauche
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
        panelMenu = new JPanel(new GridLayout(7,0));
        panelMenu.add(new JButton("SAUVEGARDE"));
        panelMenu.add(new 
            JButton("RECOMMENCER"));
        panelMenu.add(new 
            JButton("REJOUER TENTATIVE"));
        panelMenu.add(new 
            JLabel(" "));
        panelMenu.add(new 
            JButton("COMMENCER TENTATIVE"));        
        panelMenu.add(new JButton("ANNULER"));
        panelMenu.add(new 
            JLabel(" "));
        
        //on met les panels en place
        panelGauche.add(panelMenu);
        panelGauche.add(panelInteract);
        mainPanel.add(panelGauche, BorderLayout.WEST);

        //menu dessin
        constRev = new GridBagConstraints();
        constRev.fill = GridBagConstraints.HORIZONTAL;
        constRev.gridx = 0;
        constRev.gridy = 0;
        moyenPanel.add(new JButton("REVOIR"), constRev);
        
        constRes = new GridBagConstraints();
        constRes.fill = GridBagConstraints.HORIZONTAL;
        constRes.gridx = 1;
        constRes.gridy = 0;
        moyenPanel.add(new JButton("RESULTATS"), constRes);
        
        dessin = new JLabel("DESSIN"); // a modifier avec le dessin de l'eleve en cours de réalisation
        dessin.setBackground(Color.WHITE);
        dessin.setOpaque(true);
        dessin.setVerticalTextPosition(JLabel.CENTER);
        dessin.setHorizontalTextPosition(JLabel.CENTER);
        dessin.setSize(400,400);
        constDessin = new GridBagConstraints();
        constDessin.gridx = 0;
        constDessin.gridy = 1;
        constDessin.gridwidth = 2;
        constDessin.gridheight = 3;
        moyenPanel.add(dessin, constDessin);
        
        
        //menu image
        modèleImage = new ImageIcon(getClass().getResource("/projet_logo/images/tortue.PNG"));//taille a modifier pour que ce soit plus joli
        modèle = new JLabel("Modèle à reproduire");
        modèle.setVerticalTextPosition(JLabel.BOTTOM);
        modèle.setHorizontalTextPosition(JLabel.CENTER);        
        modèle.setIcon(modèleImage);
        modèle.setBackground(Color.WHITE);
        modèle.setOpaque(true);
        constImage = new GridBagConstraints();
        constImage.fill = GridBagConstraints.HORIZONTAL;
        constImage.fill = GridBagConstraints.VERTICAL;
        constImage.gridx = 2;
        constImage.gridy = 0;
        constImage.gridwidth = 2;
        constImage.gridheight = 4;
        moyenPanel.add(modèle, constImage);

        //menu code
        code = new JTextField("Code à reproduire");
        code.setEditable(false);
        code.setBackground(Color.white);
        constCode = new GridBagConstraints();
        constCode.fill = GridBagConstraints.HORIZONTAL;
        //constCode.fill = GridBagConstraints.VERTICAL;
        constCode.gridx = 0;
        constCode.gridy = 4;
        constCode.gridwidth = 4;
        constCode.gridheight = 2;
        moyenPanel.add(code, constCode);
        mainPanel.add(moyenPanel, BorderLayout.CENTER);
    }
    
        public JPanel getInterfacePrincEleve(){
                return mainPanel;
}
    
}
