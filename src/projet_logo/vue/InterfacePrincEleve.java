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

import java.awt.*;
import javax.swing.*;
import projet_logo.controler.Controler_InterfacePrincEleve;
import projet_logo.model.*;
import projet_logo.model.Canvas;

/**
     * Classe interfacePrincEleve permet d'afficher la vue principale
     * dans cette interface, on a quatre différentes parties, une avec des boutons pour gérer la tortue
     * une avec le modèle du dessin qu'il doit réaliser
     * une avec le dessin en cours de réalisation, et la tortue qui bouge
     * une avec le code qui s'affiche au fur et à mesure, synchronisé avec le dessin
     * 
     *  Avec méthode qui retourne un panel correspondant à l'affichage de la vue souhaité et que l'on va ajouter dans la frame principale.
     */
public class InterfacePrincEleve {

    JPanel mainPanel, moyenPanel, panelGauche, panelInteract, panelMenu, setVitesse;
    BorderLayout layout;
    ImageIcon haut, gauche, droite, bas, modèleImage;
    JButton avancer, tourner, plus, moins, tracer, revoir, resultats, tortueRapide, tortueClassique, tortueCouleur;
    JButton sauvegarde, recommencer, retour, commencer, annuler;
    //JOptionPane tortueCouleur;
    GridBagConstraints constRev, constRes, constDessin, constImage, constCode, constAv, constTurn, constVit, constPlus, constMoins, constClass, constRap, constCoul, constCode2;
    JLabel dessin, modèle, vitesse;
    JTextField code, code2;
    Font police;
    TortueG tClassique;
    TortueCouleur tCouleur;
    TortueRapide tRapide;
    Controler_InterfacePrincEleve c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12, c13, c14, c15;
    MainWindow frame;
    String tActuelle;

//ajout de la tortue
    private Canvas myCanvas;
    private JPanel panelCanvas;

    public InterfacePrincEleve(MainWindow f) { //mettre peut etre en parametre l'identité de l'utilisateur?

        frame = f;
        //panel principal
        layout = new BorderLayout();
        mainPanel = new JPanel(layout);
        moyenPanel = new JPanel(new GridBagLayout());
        panelGauche = new JPanel(new GridLayout(2, 0));

        //menu pour interagir avec la tortue, qui se trouve dans le menu gauche
        panelInteract = new JPanel(new GridBagLayout());

        constAv = new GridBagConstraints();
        constAv.gridx = 0;
        constAv.gridy = 0;
        constAv.gridwidth = 1;
        constAv.gridheight = 2;
        avancer = new JButton("AVANCER");
        avancer.setPreferredSize(new Dimension(130, 140));
        panelInteract.add(avancer, constAv);
        c1 = new Controler_InterfacePrincEleve(frame, "AVANCER");
        avancer.addActionListener(c1);

        constDessin = new GridBagConstraints();
        constDessin.gridx = 1;
        constDessin.gridy = 0;
        constDessin.gridwidth = 1;
        constDessin.gridheight = 2;
        tracer = new JButton("TRACER");
        tracer.setPreferredSize(new Dimension(130, 140));
        panelInteract.add(tracer, constDessin);
        c2 = new Controler_InterfacePrincEleve(frame, "TRACER");
        tracer.addActionListener(c2);

        constTurn = new GridBagConstraints();
        constTurn.gridx = 2;
        constTurn.gridy = 0;
        constTurn.gridwidth = 1;
        constTurn.gridheight = 2;
        tourner = new JButton("TOURNER");
        tourner.setPreferredSize(new Dimension(130, 140));
        panelInteract.add(tourner, constTurn);
        c3 = new Controler_InterfacePrincEleve(frame, "TOURNER");
        tourner.addActionListener(c3);

        constVit = new GridBagConstraints();
        constVit.gridx = 1;
        constVit.gridy = 2;
        constVit.gridwidth = 1;
        constVit.gridheight = 1;
        vitesse = new JLabel("Vitesse : ");
        police = new Font("Arial", Font.BOLD, 16);
        vitesse.setFont(police);
        panelInteract.add(vitesse, constVit); //changer le chiffre avec la vitesse effective de la tortue

        constPlus = new GridBagConstraints();
        constPlus.gridx = 0;
        constPlus.gridy = 2;
        constPlus.gridwidth = 1;
        constPlus.gridheight = 1;
        plus = new JButton("+");
        plus.setPreferredSize(new Dimension(130, 140));
        plus.setEnabled(false);
        panelInteract.add(plus, constPlus);
        c4 = new Controler_InterfacePrincEleve(frame, "+");
        plus.addActionListener(c4);

        constMoins = new GridBagConstraints();
        constMoins.gridx = 2;
        constMoins.gridy = 2;
        constMoins.gridwidth = 1;
        constMoins.gridheight = 1;
        moins = new JButton("-");
        moins.setPreferredSize(new Dimension(130, 140));
        panelInteract.add(moins, constMoins);
        moins.setEnabled(false);
        c5 = new Controler_InterfacePrincEleve(frame, "-");
        moins.addActionListener(c5);

        constClass = new GridBagConstraints();
        constClass.gridx = 0;
        constClass.gridy = 3;
        constClass.gridwidth = 1;
        constClass.gridheight = 2;
        tortueClassique = new JButton("Tortue classique");
        tortueClassique.setPreferredSize(new Dimension(130, 70));
        panelInteract.add(tortueClassique, constClass);
        c6 = new Controler_InterfacePrincEleve(frame, "classique");
        tortueClassique.addActionListener(c6);

        constRap = new GridBagConstraints();
        constRap.gridx = 1;
        constRap.gridy = 3;
        constRap.gridwidth = 1;
        constRap.gridheight = 2;
        tortueRapide = new JButton("Tortue Rapide");
        tortueRapide.setPreferredSize(new Dimension(130, 70));
        panelInteract.add(tortueRapide, constRap);
        c7 = new Controler_InterfacePrincEleve(frame, "rapide");
        tortueRapide.addActionListener(c7);

        constCoul = new GridBagConstraints();
        constCoul.gridx = 2;
        constCoul.gridy = 3;
        constCoul.gridwidth = 1;
        constCoul.gridheight = 2;
        tortueCouleur = new JButton("Tortue Couleur");
        //rajouter un pop up pour choisir la couleur d'écriture de la tortue
//        JFrame popup = new JFrame("Choix de la couleur");
//        tortueCouleur.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                Color newColor = JColorChooser.showDialog(popup, "Choisir la couleur d'écriture de la tortue!", tCouleur.getCouleur());
//            }
//        })

        tortueCouleur.setPreferredSize(new Dimension(130, 70));
        panelInteract.add(tortueCouleur, constCoul);
        c8 = new Controler_InterfacePrincEleve(frame, "couleur");
        tortueCouleur.addActionListener(c8);

        //menu de gauche
        panelMenu = new JPanel(new GridLayout(7, 0));
        retour = new JButton("RETOUR");
        panelMenu.add(retour);
        c9 = new Controler_InterfacePrincEleve(frame, "RETOUR");
        retour.addActionListener(c9);
        sauvegarde = new JButton("SAUVEGARDE");
        panelMenu.add(sauvegarde);
        c10 = new Controler_InterfacePrincEleve(frame, "SAUVEGARDE");
        sauvegarde.addActionListener(c10);
        recommencer = new JButton("RECOMMENCER");
        panelMenu.add(recommencer);
        c11 = new Controler_InterfacePrincEleve(frame, "RECOMMENCER");
        recommencer.addActionListener(c11);
        panelMenu.add(new JLabel(" "));
        commencer = new JButton("COMMENCER TENTATIVE");
        panelMenu.add(commencer);
        c12 = new Controler_InterfacePrincEleve(frame, "COMMENCER");
        commencer.addActionListener(c12);
        annuler = new JButton("ANNULER");
        panelMenu.add(annuler);
        c13 = new Controler_InterfacePrincEleve(frame, "ANNULER");
        annuler.addActionListener(c13);
        panelMenu.add(new JLabel(" "));

        //on met les panels en place
        panelGauche.add(panelMenu);
        panelGauche.add(panelInteract);
        mainPanel.add(panelGauche, BorderLayout.WEST);

        //menu dessin, endroit ou la tortue va s'afficher
        panelCanvas = new JPanel(); //canvas de la tortue
        panelCanvas = myCanvas.getCanvasPanel();
        myCanvas = Canvas.getCanvas();

        constRev = new GridBagConstraints();
        constRev.gridx = 1;
        constRev.gridy = 1;
        constRev.gridheight = 1;
        constRev.gridwidth = 1;
        revoir = new JButton("REVOIR");
        revoir.setPreferredSize(new Dimension(100, 30));
        moyenPanel.add(revoir, constRev);
        c14 = new Controler_InterfacePrincEleve(frame, "REVOIR");
        revoir.addActionListener(c14);

        constRes = new GridBagConstraints();
        constRes.gridx = 1;
        constRes.gridy = 2;
        constRes.gridheight = 1;
        constRes.gridwidth = 1;
        resultats = new JButton("RESULTATS");
        resultats.setPreferredSize(new Dimension(100, 30));
        moyenPanel.add(resultats, constRes);
        c15 = new Controler_InterfacePrincEleve(frame, "RESULTATS");
        resultats.addActionListener(c15);

        //dessin en haut à gauche
        constDessin = new GridBagConstraints();
        constDessin.gridx = 0;
        constDessin.gridy = 0;
        constDessin.gridheight = 1;
        constDessin.gridwidth = 1;
        //panelCanvas.setPreferredSize(new Dimension(400,400));
        moyenPanel.add(panelCanvas, constDessin);

        //menu image, modèle que l'élève devra reproduire en haut à droite       
        //modèleImage = new ImageIcon(getClass().getResource("/projet_logo/images/tortue.PNG"));//taille a modifier pour que ce soit plus joli
        modèle = new JLabel("modèle à reproduire");
        modèle.setVerticalTextPosition(JLabel.BOTTOM);
        modèle.setHorizontalTextPosition(JLabel.CENTER);
        //modèle.setIcon(modèleImage);
        modèle.setBackground(Color.WHITE);
        modèle.setOpaque(true);
        constImage = new GridBagConstraints();
        constImage.fill = GridBagConstraints.HORIZONTAL;
        constImage.fill = GridBagConstraints.VERTICAL;
        constImage.gridx = 1;
        constImage.gridy = 0;
        constImage.gridheight = 1;
        constImage.gridwidth = 1;
        moyenPanel.add(modèle, constImage);

        //menu code qu'il faut reproduire, modèle pour l'élève
        code = new JTextField("Code à reproduire");
        code.setEditable(false);
        code.setBackground(Color.white);
        constCode = new GridBagConstraints();
        constCode.gridx = 0;
        constCode.gridy = 1;
        constCode.gridwidth = 1;
        constCode.gridheight = 2;
        moyenPanel.add(code, constCode);

        //menu code ou s'affiche au fur et à mesure le code généré par l'élève
        code2 = new JTextField("Code qui s'affiche au fur et à mesure");
        code2.setEditable(false);
        code2.setBackground(Color.white);
        constCode2 = new GridBagConstraints();
        constCode2.gridx = 0;
        constCode2.gridy = 3;
        constCode2.gridwidth = 2;
        constCode2.gridheight = 1;
        moyenPanel.add(code2, constCode2);

        mainPanel.add(moyenPanel, BorderLayout.CENTER);

    }

    public JPanel getInterfacePrincEleve() {
        return mainPanel;
    }

    public TortueG getTortue(String t) {
        if (t.equals("classique")) {
            return tClassique;
        } else if (t.equals("couleur")) {
            return tCouleur;
        } else if (t.equals("rapide")) {
            return tRapide;
        }
        return null;
    }
    
    public void creaTortueG(){
        tClassique = new TortueG();
        tActuelle = "classique";
    }
    
    public void creaTortueR(){
        tRapide = new TortueRapide();
        tActuelle = "rapide";
    }
    
    public void creaTortueC(){
        tCouleur = new TortueCouleur();
        tActuelle = "couleur";
    }

    public String gettActuelle() {
        return tActuelle;
    }

    public JButton getPlus() {
        return plus;
    }

    public JButton getMoins() {
        return moins;
    }

    public TortueCouleur gettCouleur() {
        return tCouleur;
    }

    public TortueRapide gettRapide() {
        return tRapide;
    }
    
    

}
