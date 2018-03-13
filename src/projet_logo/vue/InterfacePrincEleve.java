import javax.swing.*;
import java.awt.*;
/**
 * Classe InterfacePrincEleve est une classe qui permet d'afficher la vue principale
 * dans cette interface, on a quatre différentes parties, une avec des boutons pour gérer la tortue
 * une avec le modèle du dessin qu'il doit réaliser
 * une avec le dessin en cours de réalisation, et la tortue qui bouge
 * une avec le code qui s'affiche au fur et à mesure, synchronisé avec le dessin
 */

public class InterfacePrincEleve {

    JFrame frame;
    JPanel mainPanel;
    JPanel moyenPanel;
    JPanel panelGauche;

    public void creeInt() {
        frame = new JFrame("Interface principale");

        //panel principal
        BorderLayout layout = new BorderLayout();
        mainPanel = new JPanel(layout);        
        moyenPanel = new JPanel(new GridBagLayout());
        panelGauche = new JPanel(new GridLayout(2,0));

        //menu pour interagir avec la tortue, qui se trouve dans le menu gauche
        JPanel panelInteract = new JPanel(new GridLayout(4,3));
        panelInteract.add(new JLabel(" "));
        
        ImageIcon haut = new ImageIcon("C:/Users/morgane/Documents/Cours/Master/S1/OOP-OOD/projets cours/interactive counter/images interface/flechehaut-ConvertImage.JPG");
        JButton bhaut = new JButton(haut);
        bhaut.setBackground(Color.WHITE);
        panelInteract.add(bhaut);
        
        panelInteract.add(new JLabel(" "));
        
        ImageIcon gauche = new ImageIcon("C:/Users/morgane/Documents/Cours/Master/S1/OOP-OOD/projets cours/interactive counter/images interface/flechegauche-ConvertImage.JPG");
        JButton bgauche = new JButton(gauche);
        bgauche.setBackground(Color.WHITE);
        panelInteract.add(bgauche);
        
        panelInteract.add(new JButton("AVANCER"));
        
        ImageIcon droite = new ImageIcon("C:/Users/morgane/Documents/Cours/Master/S1/OOP-OOD/projets cours/interactive counter/images interface/flechedroite-ConvertImage.JPG");        
        JButton bdroite = new JButton(droite);
        bdroite.setBackground(Color.WHITE);
        panelInteract.add(bdroite);
        
        panelInteract.add(new JLabel(" "));
        
        ImageIcon bas = new ImageIcon("C:/Users/morgane/Documents/Cours/Master/S1/OOP-OOD/projets cours/interactive counter/images interface/flechebas-ConvertImage.JPG");        
        JButton bbas = new JButton(bas);
        bbas.setBackground(Color.WHITE);
        panelInteract.add(bbas);
        
        panelInteract.add(new JLabel(" "));
        
        panelInteract.add(new JLabel("Vitesse de la tortue : "+2)); //changer le chiffre avec la vitesse effective de la tortue
        //deux boutons + et - dans une seule case du grid
        JPanel setVitesse = new JPanel(new GridLayout(2,0));
        setVitesse.add(new JButton("+"));
        //setVitesse.add(new JLabel(" "));
        setVitesse.add(new JButton("-"));
        panelInteract.add(setVitesse);

        //pop up pour choisir la couleur d'écriture de la tortue
        JButton choixCouleur = new JButton("Couleur");
        JOptionPane popup = new JOptionPane("mettre pop up pour couleur");

        //menu de gauche
        JPanel panelMenu = new JPanel(new GridLayout(7,0));
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
        //mainPanel.add(new JButton("Essai est"), BorderLayout.EAST);

        //menu dessin
        //essai grid bag
        GridBagConstraints constRev = new GridBagConstraints();
        constRev.fill = GridBagConstraints.HORIZONTAL;
        constRev.gridx = 0;
        constRev.gridy = 0;
        moyenPanel.add(new JButton("REVOIR"), constRev);
        
        GridBagConstraints constRes = new GridBagConstraints();
        constRes.fill = GridBagConstraints.HORIZONTAL;
        constRes.gridx = 1;
        constRes.gridy = 0;
        moyenPanel.add(new JButton("RESULTATS"), constRes);
        
        JLabel dessin = new JLabel("DESSIN"); // a modifier avec le dessin de l'eleve en cours de réalisation
        dessin.setBackground(Color.WHITE);
        dessin.setOpaque(true);
        dessin.setVerticalTextPosition(JLabel.CENTER);
        dessin.setHorizontalTextPosition(JLabel.CENTER);
        dessin.setSize(400,400);
        GridBagConstraints constDessin = new GridBagConstraints();
        //constDessin.fill = GridBagConstraints.HORIZONTAL;
        constDessin.gridx = 0;
        constDessin.gridy = 1;
        constDessin.gridwidth = 2;
        constDessin.gridheight = 3;
        moyenPanel.add(dessin, constDessin);
        
        //menu image
        ImageIcon modèleImage = new ImageIcon("C:/Users/morgane/Documents/Cours/Master/S1/OOP-OOD/projets cours/interactive counter/images interface/tortue.PNG");
        //ImageIcon modèleImage = new ImageIcon(new ImageIcon("C:/Users/morgane/Documents/Cours/Master/S1/OOP-OOD/projets cours/interactive counter/images interface/tortue.PNG").getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT));
        JLabel modèle = new JLabel("Modèle à reproduire");
        modèle.setVerticalTextPosition(JLabel.BOTTOM);
        modèle.setHorizontalTextPosition(JLabel.CENTER);        
        modèle.setIcon(modèleImage);
        modèle.setBackground(Color.WHITE);
        modèle.setOpaque(true);
        GridBagConstraints constImage = new GridBagConstraints();
        constImage.fill = GridBagConstraints.HORIZONTAL;
        constImage.fill = GridBagConstraints.VERTICAL;
        constImage.gridx = 2;
        constImage.gridy = 0;
        constImage.gridwidth = 2;
        constImage.gridheight = 4;
        moyenPanel.add(modèle, constImage);

        //menu code
        JTextField code = new JTextField("Code à reproduire");
        code.setEditable(false);
        code.setBackground(Color.white);
        GridBagConstraints constCode = new GridBagConstraints();
        constCode.fill = GridBagConstraints.HORIZONTAL;
        //constCode.fill = GridBagConstraints.VERTICAL;
        constCode.gridx = 0;
        constCode.gridy = 4;
        constCode.gridwidth = 4;
        constCode.gridheight = 2;
        moyenPanel.add(code, constCode);
        
        mainPanel.add(moyenPanel, BorderLayout.CENTER);
        
        frame.add(mainPanel);
        frame.setExtendedState(frame.MAXIMIZED_BOTH); //permet de mettre l'appli en plein écran
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
