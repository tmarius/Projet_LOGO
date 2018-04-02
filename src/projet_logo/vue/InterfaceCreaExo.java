    
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import projet_logo.controler.Controler_IntCreaExo;
import projet_logo.model.Canvas;

/**
     * Classe interfaceCreaExo crée une interface accessible par le professeur et qui lui permet de créer des exercices
     * il visualise le dessin, le code, et a des boutons pour pouvoir diriger la tortue, elle ressemble à l'interface principale de l'élève avec des boutons de création en plus
     * 
     * Avec méthode qui retourne un panel correspondant à l'affichage de la vue souhaité et que l'on va ajouter dans la frame principale.
     *@author grp8
     */
public class InterfaceCreaExo{
    
private JPanel  mainPanel, panelGauche,panelInteract,  panelMenu, setVitesse, baniere, milieu, buttons;
private BorderLayout layout;
private JButton choixCouleur,tortueCouleur,tortueRapide,tortueClassique, avancer, tourner, plus, moins, tracer;
private JLabel vitesse;
private Font police;
private JOptionPane popup;
private Controler_IntCreaExo c1,c2,c3,c4,c5,c6,c7,c8;
private MainWindow frame;
private GridBagConstraints constRev, constRes, constDessin, constImage, constCode, constAv, constTurn, constVit, constPlus, constMoins, constClass, constRap, constCoul, constCode2;
//ajout de la tortue
private Canvas myCanvas;
private JPanel panelCanvas;

    public InterfaceCreaExo(MainWindow f){
    
        frame = f;
        //panel principal
        layout = new BorderLayout();
        mainPanel = new JPanel(layout);        
        panelGauche = new JPanel(new GridLayout(2,0));

        //menu pour interagir avec la tortue, qui se trouve dans le menu droite 
        panelInteract = new JPanel(new GridBagLayout());

        constAv = new GridBagConstraints();
        constAv.gridx = 0;
        constAv.gridy = 0;
        constAv.gridwidth = 1;
        constAv.gridheight = 2;
        avancer = new JButton("AVANCER");
        avancer.setPreferredSize(new Dimension(130, 140));
        avancer.setBackground(new Color(140, 140, 140));
        avancer.setForeground(new Color(255, 255, 255));
        avancer.setFont(new Font(Font.SERIF, Font.BOLD, 18));
        panelInteract.add(avancer, constAv);
        c1 = new Controler_IntCreaExo(frame, "AVANCER");
        avancer.addActionListener(c1);

        constDessin = new GridBagConstraints();
        constDessin.gridx = 1;
        constDessin.gridy = 0;
        constDessin.gridwidth = 1;
        constDessin.gridheight = 2;
        tracer = new JButton("TRACER");
        tracer.setPreferredSize(new Dimension(130, 140));
        tracer.setBackground(new Color(140, 140, 140));
        tracer.setForeground(new Color(255, 255, 255));
        tracer.setFont(new Font(Font.SERIF, Font.BOLD, 18));
        panelInteract.add(tracer, constDessin);
        c2 = new Controler_IntCreaExo(frame, "TRACER");
        tracer.addActionListener(c2);

        constTurn = new GridBagConstraints();
        constTurn.gridx = 2;
        constTurn.gridy = 0;
        constTurn.gridwidth = 1;
        constTurn.gridheight = 2;
        tourner = new JButton("TOURNER");
        tourner.setPreferredSize(new Dimension(130, 140));
        tourner.setBackground(new Color(140, 140, 140));
        tourner.setForeground(new Color(255, 255, 255));
        tourner.setFont(new Font(Font.SERIF, Font.BOLD, 18));
        panelInteract.add(tourner, constTurn);
        c3 = new Controler_IntCreaExo(frame, "TOURNER");
        tourner.addActionListener(c3);

        constVit = new GridBagConstraints();
        constVit.gridx = 1;
        constVit.gridy = 2;
        constVit.gridwidth = 1;
        constVit.gridheight = 1;
        vitesse = new JLabel("Vitesse : ");
        police = new Font("Arial", Font.BOLD, 16);
        vitesse.setBackground(new Color(140, 140, 140));
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
        plus.setBackground(new Color(140, 140, 140));
        plus.setForeground(new Color(255, 255, 255));
        plus.setFont(new Font(Font.SERIF, Font.BOLD, 18));
        panelInteract.add(plus, constPlus);
        c4 = new Controler_IntCreaExo(frame, "+");
        plus.addActionListener(c4);

        constMoins = new GridBagConstraints();
        constMoins.gridx = 2;
        constMoins.gridy = 2;
        constMoins.gridwidth = 1;
        constMoins.gridheight = 1;
        moins = new JButton("-");
        moins.setPreferredSize(new Dimension(130, 140));
        moins.setBackground(new Color(140, 140, 140));
        moins.setForeground(new Color(255, 255, 255));
        moins.setFont(new Font(Font.SERIF, Font.BOLD, 18));
        panelInteract.add(moins, constMoins);
        moins.setEnabled(false);
        c5 = new Controler_IntCreaExo(frame, "-");
        moins.addActionListener(c5);


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
        panelCanvas = new JPanel(); //canvas de la tortue
        panelCanvas = myCanvas.getCanvasPanel();
        myCanvas = Canvas.getCanvas();   
        milieu.add(panelCanvas);
        milieu.add(new JTextField("CODE"));
        milieu.add(panelInteract);
        
        buttons = new JPanel(new GridLayout(3,0));
        tortueClassique = new JButton("Créer Tortue");
        tortueClassique.setPreferredSize(new Dimension(130, 70));
        tortueClassique.setBackground(new Color(140, 140, 140));
        tortueClassique.setForeground(new Color(255, 255, 255));
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

        tortueCouleur.setPreferredSize(new Dimension(130, 70));
        tortueCouleur.setBackground(new Color(140, 140, 140));
        tortueCouleur.setForeground(new Color(255, 255, 255));
        tortueCouleur.setFont(new Font(Font.SERIF, Font.BOLD, 15));
        c8 = new Controler_IntCreaExo(frame, "couleur");
        tortueCouleur.addActionListener(c8);
        buttons.add(tortueCouleur);
        
                tortueRapide = new JButton("Créer Tortue Rapide");
        tortueRapide.setPreferredSize(new Dimension(130, 70));
        tortueRapide.setBackground(new Color(140, 140, 140));
        tortueRapide.setForeground(new Color(255, 255, 255));
        tortueRapide.setFont(new Font(Font.SERIF, Font.BOLD, 15));
        c7 = new Controler_IntCreaExo(frame, "rapide");
        tortueRapide.addActionListener(c7);
        buttons.add(tortueRapide);
        milieu.add(buttons);
        
        
        mainPanel.add(milieu, BorderLayout.CENTER);
       
        
               
    }
    public JPanel getInterfaceCreaExo(){
    return mainPanel;
    }

   
}
