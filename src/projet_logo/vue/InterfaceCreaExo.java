    
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import projet_logo.controler.Controler_IntCreaExo;
import projet_logo.model.Canvas;
import projet_logo.model.TortueCouleur;
import projet_logo.model.TortueG;
import projet_logo.model.TortueRapide;

/**
     * Classe interfaceCreaExo crée une interface accessible par le professeur et qui lui permet de créer des exercices
     * il visualise le dessin, le code, et a des boutons pour pouvoir diriger la tortue, elle ressemble à l'interface principale de l'élève avec des boutons de création en plus
     * 
     * Avec méthode qui retourne un panel correspondant à l'affichage de la vue souhaité et que l'on va ajouter dans la frame principale.
     *@author grp8
     */
public class InterfaceCreaExo{
    
private JPanel  mainPanel, panelGauche,panelInteract,  panelMenu, baniere, milieu, buttons;
private BorderLayout layout;
private JButton choixCouleur,tortueCouleur,tortueRapide,tortueClassique, avancer, tourner, plus, moins, tracer,commencer;
private JLabel vitesse;
private Font police;
private JOptionPane popup;
private Controler_IntCreaExo c1,c2,c3,c4,c5,c6,c7,c8,c9;
private MainWindow frame;
private GridBagConstraints constRev, constRes, constDessin, constImage, constCode, constAv, constTurn, constVit, constPlus, constMoins, constClass, constRap, constCoul, constCode2;
private String tActuelle;
private TortueG tClassique;
private TortueCouleur tCouleur;
private TortueRapide tRapide;
//ajout de la tortue
private Canvas myCanvas;
private JPanel panelCanvas;

    public InterfaceCreaExo(MainWindow f){
    
        frame = f;
        //panel principal
        layout = new BorderLayout();
        mainPanel = new JPanel(layout);        
        panelGauche = new JPanel(new GridLayout(2,0));
        
        //parmètres de base pour le design
        Color couleurBlanche = new Color(255, 255, 255);
        Color couleurFondBoutons = new Color(140, 140, 140);
        Font font = new Font(Font.SERIF, Font.BOLD, 18);
        Dimension tailleGrosBoutons = new Dimension(130, 140);
        Dimension tailleMoyenBoutons = new Dimension(130, 70);
        //Color couleurFondRetour = new Color(255, 120, 120);
        Color SourisPasse = new Color(0, 0, 0);

        //menu pour interagir avec la tortue, qui se trouve dans le menu droite 
        panelInteract = new JPanel(new GridBagLayout());

        constAv = new GridBagConstraints();
        constAv.gridx = 0;
        constAv.gridy = 0;
        constAv.gridwidth = 1;
        constAv.gridheight = 2;
        avancer = new JButton("AVANCER");
        avancer.setPreferredSize(tailleGrosBoutons);
        avancer.setBackground(couleurFondBoutons);
        avancer.setForeground(couleurBlanche);
        avancer.setFont(font);
        panelInteract.add(avancer, constAv);
        c1 = new Controler_IntCreaExo(frame, "AVANCER");
        avancer.addActionListener(c1);

        constDessin = new GridBagConstraints();
        constDessin.gridx = 1;
        constDessin.gridy = 0;
        constDessin.gridwidth = 1;
        constDessin.gridheight = 2;
        tracer = new JButton("TRACER");
        tracer.setPreferredSize(tailleGrosBoutons);
        tracer.setBackground(couleurFondBoutons);
        tracer.setForeground(couleurBlanche);
        tracer.setFont(font);
        panelInteract.add(tracer, constDessin);
        c2 = new Controler_IntCreaExo(frame, "TRACER");
        tracer.addActionListener(c2);

        constTurn = new GridBagConstraints();
        constTurn.gridx = 2;
        constTurn.gridy = 0;
        constTurn.gridwidth = 1;
        constTurn.gridheight = 2;
        tourner = new JButton("TOURNER");
        tourner.setPreferredSize(tailleGrosBoutons);
        tourner.setBackground(couleurFondBoutons);
        tourner.setForeground(couleurBlanche);
        tourner.setFont(font);
        panelInteract.add(tourner, constTurn);
        c3 = new Controler_IntCreaExo(frame, "TOURNER");
        tourner.addActionListener(c3);

        constVit = new GridBagConstraints();
        constVit.gridx = 1;
        constVit.gridy = 2;
        constVit.gridwidth = 1;
        constVit.gridheight = 1;
        
        vitesse = new JLabel("Vitesse : 1"); //ajouter la vitesse de la tortue
        police = new Font(Font.SERIF, Font.BOLD, 16);
        vitesse.setBackground(couleurFondBoutons);
        vitesse.setFont(police);
        panelInteract.add(vitesse, constVit); //changer le chiffre avec la vitesse effective de la tortue

        constPlus = new GridBagConstraints();
        constPlus.gridx = 0;
        constPlus.gridy = 2;
        constPlus.gridwidth = 1;
        constPlus.gridheight = 1;
        plus = new JButton("+");
        plus.setPreferredSize(tailleGrosBoutons);
        plus.setEnabled(false);
        plus.setBackground(couleurFondBoutons);
        plus.setForeground(couleurBlanche);
        plus.setFont(font);
        panelInteract.add(plus, constPlus);
        c4 = new Controler_IntCreaExo(frame, "+");
        plus.addActionListener(c4);

        constMoins = new GridBagConstraints();
        constMoins.gridx = 2;
        constMoins.gridy = 2;
        constMoins.gridwidth = 1;
        constMoins.gridheight = 1;
        moins = new JButton("-");
        moins.setPreferredSize(tailleGrosBoutons);
        moins.setBackground(couleurFondBoutons);
        moins.setForeground(couleurBlanche);
        moins.setFont(font);
        panelInteract.add(moins, constMoins);
        moins.setEnabled(false);
        c5 = new Controler_IntCreaExo(frame, "-");
        moins.addActionListener(c5);


        //menu de gauche
        panelMenu = new JPanel(new GridLayout(9,0));
        panelMenu.add(new JLabel(" "));
        commencer = new JButton("COMMENCER");
        panelMenu.add(commencer);
        c9 = new Controler_IntCreaExo(frame, "COMMENCER");
        commencer.addActionListener(c9);
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
        panelCanvas = new JPanel(); //canvas de la tortue
        panelCanvas = myCanvas.getCanvasPanel();
        myCanvas = Canvas.getCanvas();   
        milieu.add(panelCanvas);
        milieu.add(new JTextField("CODE"));
        milieu.add(panelInteract);
        
        buttons = new JPanel(new GridLayout(3,0));
        tortueClassique = new JButton("Créer Tortue");
        tortueClassique.setPreferredSize(tailleMoyenBoutons);
        tortueClassique.setBackground(couleurFondBoutons);
        tortueClassique.setForeground(couleurBlanche);
        tortueClassique.setFont(new Font(Font.SERIF, Font.BOLD, 15));
        c6 = new Controler_IntCreaExo(frame, "classique");
        tortueClassique.addActionListener(c6);
        buttons.add(tortueClassique);
        
        tortueCouleur = new JButton("Créer Tortue Couleur");
        //rajouter un pop up pour choisir la couleur d'écriture de la tortue
//        JFrame popup = new JFrame("Choix de la couleur");
//        tortueCouleur.addActionListener(new ActionListener(){
//            public void actionPerformed(ActionEvent e){
//                Color newColor = JColorChooser.showDialog(popup, "Choisir la couleur d'écriture de la tortue!", tCouleur.getCouleur());
//            }
//        })

        tortueCouleur.setPreferredSize(tailleMoyenBoutons);
        tortueCouleur.setBackground(couleurFondBoutons);
        tortueCouleur.setForeground(couleurBlanche);
        tortueCouleur.setFont(new Font(Font.SERIF, Font.BOLD, 15));
        c8 = new Controler_IntCreaExo(frame, "couleur");
        tortueCouleur.addActionListener(c8);
        buttons.add(tortueCouleur);
        
        tortueRapide = new JButton("Créer Tortue Rapide");
        tortueRapide.setPreferredSize(tailleMoyenBoutons);
        tortueRapide.setBackground(couleurFondBoutons);
        tortueRapide.setForeground(couleurBlanche);
        tortueRapide.setFont(new Font(Font.SERIF, Font.BOLD, 15));
        c7 = new Controler_IntCreaExo(frame, "rapide");
        tortueRapide.addActionListener(c7);
        buttons.add(tortueRapide);
        milieu.add(buttons);
        
        
        mainPanel.add(milieu, BorderLayout.CENTER);
       
        //MouseListeners des boutons
        
        tracer.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Color SourisPasse = new Color(0, 0, 0);
                tracer.setBackground(SourisPasse);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tracer.setBackground(couleurFondBoutons);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });
        
        moins.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Color SourisPasse = new Color(0, 0, 0);
                moins.setBackground(SourisPasse);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                moins.setBackground(couleurFondBoutons);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });
        
        plus.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Color SourisPasse = new Color(0, 0, 0);
                plus.setBackground(SourisPasse);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                plus.setBackground(couleurFondBoutons);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });
        
        tourner.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Color SourisPasse = new Color(0, 0, 0);
                tourner.setBackground(SourisPasse);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tourner.setBackground(couleurFondBoutons);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });
        
        avancer.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Color SourisPasse = new Color(0, 0, 0);
                avancer.setBackground(SourisPasse);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                avancer.setBackground(couleurFondBoutons);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });
        
        tortueClassique.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Color SourisPasse = new Color(0, 0, 0);
                tortueClassique.setBackground(SourisPasse);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tortueClassique.setBackground(couleurFondBoutons);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });
        
        tortueRapide.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Color SourisPasse = new Color(0, 0, 0);
                tortueRapide.setBackground(SourisPasse);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tortueRapide.setBackground(couleurFondBoutons);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });
        
        tortueCouleur.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Color SourisPasse = new Color(0, 0, 0);
                tortueCouleur.setBackground(SourisPasse);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                tortueCouleur.setBackground(couleurFondBoutons);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });
               
    }
    public JPanel getInterfaceCreaExo(){
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

    public TortueCouleur gettCouleur() {
        return tCouleur;
    }

    public TortueRapide gettRapide() {
        return tRapide;
    }

    public JButton getPlus() {
        return plus;
    }

    public JLabel getVitesse() {
        return vitesse;
    }

    public JButton getMoins() {
        return moins;
    }
}
