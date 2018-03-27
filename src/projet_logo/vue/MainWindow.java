/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import projet_logo.model.*;
import java.util.ArrayList;

/**
 * Page principale. Est une frame ayant des pannels changeant en fonction de l'interface. 
 */
public class MainWindow extends JFrame {
    Formulaire formulaires = new Formulaire() ;
    TreeExample trees ;
    TableDisplay table = new TableDisplay();
            
    private JPanel menuDroite;
    private JFrame windows;
    private ResultSet Result;
    
    private final InterfaceConnexion InCo;
    private final InterfaceOuverture InOuv;
    private final ConnexionEleve CoEleve;
    private final InterfacePrincEleve PrEleve;
    private final InterfaceCreaExo CreaEx;
    private final InterfaceListeClasse ListeClasse;
    private final InterfacePrincProf PrProf;
    private final InterfaceVisuExo VisuEx;

    /**
     * Constructeur de l'interface
     * @param datas correspond aux données de la base de données
     */
    public MainWindow(MainModel datas){
    
    windows = new JFrame("Projet_LOGO"); //on construit la frame
    InCo = new InterfaceConnexion(datas.getClasse1());
    InOuv = new InterfaceOuverture();
    CoEleve = new ConnexionEleve();
    PrEleve = new InterfacePrincEleve();
    CreaEx = new InterfaceCreaExo();
    ListeClasse = new InterfaceListeClasse();
    PrProf =  new InterfacePrincProf();
    VisuEx = new InterfaceVisuExo();

    
    //Interface de test avec Jtree, Jtable ...
    //windows.add(InCo.getInterfaceConnexion()); //on commence par la première interface
    
    //Interface ouverture
    //windows.add(InOuv.getInterfaceOuverture());
    
    //Interface Connexion Eleve
    //windows.add(CoEleve.getConnexionEleve());
    
    //Interface Principale Eleve
    //windows.add(PrEleve.getInterfacePrincEleve());

    //Interface Creation Exercice
    //windows.add(CreaEx.getInterfaceCreaExo());
    
    //Interface liste classes
    //windows.add(ListeClasse.getInterfaceListeClasse());

    //Interface principale prof
   // windows.add(PrProf.getInterfacePrincProf());
   
    //Interface visualisation exercice
   windows.add(VisuEx.getInterfaceVisuExo());

    windows.setVisible(true);
    windows.pack();
    windows.setExtendedState(windows.MAXIMIZED_BOTH);
    windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    public void refreshW(JPanel fenetre) {
    
    windows.setContentPane(fenetre); //on ajoute la bonne fenetre à la frame
    windows.repaint();
    windows.revalidate();
    
  
    }
    
    
    public JPanel interfaceConnexion(Classe classe1) 
    {    
        JPanel Thewindows = new JPanel();
        Thewindows.setLayout(new BorderLayout());
        menuDroite = new JPanel();
        menuDroite.setLayout(new BorderLayout());
        menuDroite.add(formulaires.InterfaceEleve() , BorderLayout.NORTH);
        menuDroite.add(table.createTable() , BorderLayout.SOUTH);
        Thewindows.add(trees = new TreeExample(classe1), BorderLayout.WEST);
        Thewindows.add(menuDroite, BorderLayout.EAST);
        return (Thewindows);
    }        
    
    /**
     * méthode interfaceOuverture crée une interface avec deux boutons, permet de choisir si on se connecte en tant que prof ou en tant qu'élève
     * @return un panel qui correspond à l'affichage et que l'on va ajouter dans la frame principale
     */
    public JPanel interfaceOuverture() {
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
    
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
        
        ImageIcon logo = new ImageIcon(getClass().getResource("/projet_logo/images/tortue_connexion.png"));
        JLabel titre = new JLabel("Apprendre la programmation en s'amusant!", JLabel.CENTER);
        titre.setVerticalTextPosition(JLabel.BOTTOM);
        titre.setHorizontalTextPosition(JLabel.CENTER);
        titre.setIcon(logo);
        titre.setOpaque(true);
        titre.setBackground(Color.white);
        
        panel1.add(titre, BorderLayout.CENTER);
        
        //ajout des actions listeners
        //listener pour le bouton prof, quand on clique dessus on arrive sur l'interface de connexion du prof
        prof.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                refreshW(connexionProf());
            }
        });
        
        eleve.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                refreshW(connexionEleve());
            }
        }); 
        return panel1;
        }
    
    /**
     * méthode connexionEleve crée une interface ou l'élève va rentrer son nom, son prénom et sa classe pour pouvoir démarrer l'appli
     * @return un panel qui correspond à l'affichage et que l'on va ajouter dans la frame principale
     */
    public JPanel connexionEleve(){
                
        //Instanciation d'un objet JPanel
        JPanel ic = new JPanel();
        
        JPanel mainIc = new JPanel();
        JPanel l4 = new JPanel();
        
        //ajout espace à droite 
        JLabel l5 = new JLabel();
        l5.setPreferredSize(new Dimension(150,60));
        
        //ajout borderLayout
        ic.setLayout(new BorderLayout());
        mainIc.setLayout(new BorderLayout());
        l4.setLayout(new BorderLayout());
        //ajout GridLayout 4 lignes et 2 colonnes
        JPanel menuCentre = new JPanel(new GridLayout(4,3));
        //ajout du GridLayout au centre du BorderLayout
        mainIc.add(menuCentre,BorderLayout.CENTER);
        
        //ajout d'une image
        JLabel image = new JLabel(new ImageIcon(getClass().getResource("/projet_logo/images/tortue_connexion.PNG")));
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
        JLabel l1 = new JLabel("Nom :");
        //modifier taille de la police
        l1.setFont(new Font("Arial",Font.BOLD,30));
        

        //taille du JLabel
        l1.setPreferredSize(new Dimension(150,50));
        //alignement horizontal du JLabel
        l1.setHorizontalAlignment(SwingConstants.LEFT);
        //alignement vertical du JLabel
        l1.setVerticalAlignment(SwingConstants.CENTER);
        menuCentre.add(l1);    
        
        JTextField t1 = new JTextField(); // à ajouter dans tous les Jtext une valeur par défaut qui est la variable de l'élève
        //modifier taille de police dans le JTextField
        t1.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(t1);
        
        JLabel l2 = new JLabel("Prénom :");
        //modifier taille de la police
        l2.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(l2);    
        JTextField t2 = new JTextField();
        //modifier taille de police dans le JTextField
        t2.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(t2);
        //vérifier que les noms et prénoms existent dans la base de données
        
        JLabel l3 = new JLabel("Classe");
        l3.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(l3);
        JComboBox classe = new JComboBox();
        //relier à la base de données pour avoir les classes possibles
        menuCentre.add(classe);
                
        //ajout bouton démarrer
        JButton b = new JButton("Démarrer");
        //changement de taille du bouton
        b.setPreferredSize(new Dimension(250,100));
        b.setFont(new Font("Arial",Font.BOLD,30));
        //placer le bouton au sud
        mainIc.add(b,BorderLayout.SOUTH);
        
        //ajout bouton retour
        JButton retour = new JButton("Retour");
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
        
        //ajout du listener sur le bouton démarrer
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                refreshW(interfacePrincEleve());
            }
        });
        
        //ajout du listener sur le bouton retour
        retour.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                refreshW(interfaceOuverture());
            }
        });
        
        //besoin d'ajouter les listeners pour les text field, et que l'interface d'après soit spécifique de l'élève
        return ic;
    }
    
    
    /**
     * méthode listeExos affiche la liste de tous les exercices disponibles pour les élèves.
     * Chaque nom d'exercice est accompagné d'une image qui permet de mieux visualiser l'exercice
     */
    public void listeExos(){
        
    }
    
    /**
    * méthode interfaceResultats crée une interface accessible pour les élèves et qi va afficher la liste des résultats
    * des exercices qu'ils ont déja réalisé.
    * Pour chaque exercice on affiche le dessin et le code qui ont été réalisés, ainsi qu'une appréciation et un commentaire du prof
    */
    
    public void interfaceResultats(){
        
        
        
    }
    
    /**
     * méthode interfacePrincEleve permet d'afficher la vue principale
     * dans cette interface, on a quatre différentes parties, une avec des boutons pour gérer la tortue
     * une avec le modèle du dessin qu'il doit réaliser
     * une avec le dessin en cours de réalisation, et la tortue qui bouge
     * une avec le code qui s'affiche au fur et à mesure, synchronisé avec le dessin
     * @return un panel qui correspond à l'affichage et que l'on va ajouter dans la frame principale
     */
    
    public JPanel interfacePrincEleve(){ //mettre peut etre en parametre l'identité de l'utilisateur?
        
    JPanel mainPanel; //déclaration des panels utilisés pour cette fenêtre
    JPanel moyenPanel;
    JPanel panelGauche;
    
    //panel principal
        BorderLayout layout = new BorderLayout();
        mainPanel = new JPanel(layout);        
        moyenPanel = new JPanel(new GridBagLayout());
        panelGauche = new JPanel(new GridLayout(2,0));

        //menu pour interagir avec la tortue, qui se trouve dans le menu gauche
        JPanel panelInteract = new JPanel(new GridLayout(4,3));
        panelInteract.add(new JLabel(" "));
        
        ImageIcon haut = new ImageIcon(getClass().getResource("/projet_logo/images/flechehaut-ConvertImage.jpg"));
        JButton bhaut = new JButton(haut);
        bhaut.setBackground(Color.WHITE);
        panelInteract.add(bhaut);
        
        panelInteract.add(new JLabel(" "));
        
        ImageIcon gauche = new ImageIcon(getClass().getResource("/projet_logo/images/flechegauche-ConvertImage.JPG"));
        JButton bgauche = new JButton(gauche);
        bgauche.setBackground(Color.WHITE);
        panelInteract.add(bgauche);
        
        panelInteract.add(new JButton("AVANCER"));
        
        ImageIcon droite = new ImageIcon(getClass().getResource("/projet_logo/images/flechedroite-ConvertImage.JPG"));        
        JButton bdroite = new JButton(droite);
        bdroite.setBackground(Color.WHITE);
        panelInteract.add(bdroite);
        
        panelInteract.add(new JLabel(" "));
        
        ImageIcon bas = new ImageIcon(getClass().getResource("/projet_logo/images/flechebas-ConvertImage.JPG"));        
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
        JPanel panelMenu = new JPanel(new GridLayout(8,0));
        JButton retour = new JButton("RETOUR");
        panelMenu.add(retour);
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
        constDessin.gridx = 0;
        constDessin.gridy = 1;
        constDessin.gridwidth = 2;
        constDessin.gridheight = 3;
        moyenPanel.add(dessin, constDessin);
        
        
        //menu image
        ImageIcon modèleImage = new ImageIcon(getClass().getResource("/projet_logo/images/tortue.PNG"));//taille a modifier pour que ce soit plus joli
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
       
        //ajout du listener sur le bouton démarrer
        retour.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                refreshW(connexionEleve());
            }
        });
        return mainPanel;
    }
    
    /**
     * méthode interfaceCreaExo crée une interface accessible par le professeur et qui lui permet de créer des exercices
     * il visualise le dessin, le code, et a des boutons pour pouvoir diriger la tortue, elle ressemble à l'interface principale de l'élève avec des boutons de création en plus
     * @return un panel qui correspond à l'affichage et que l'on va ajouter dans la frame principale
     */
    
    public JPanel interfaceCreaExo(){
        
    JPanel mainPanel; //déclaration des panels utilisés pour cette fenêtre
    JPanel panelGauche;
    
        //panel principal
        BorderLayout layout = new BorderLayout();
        mainPanel = new JPanel(layout);        
        panelGauche = new JPanel(new GridLayout(2,0));

        //menu pour interagir avec la tortue, qui se trouve dans le menu droite 
        JPanel panelInteract = new JPanel(new GridLayout(4,3));
        panelInteract.add(new JLabel(" "));
        
        ImageIcon haut = new ImageIcon(getClass().getResource("/projet_logo/images/flechehaut-ConvertImage.jpg"));
        JButton bhaut = new JButton(haut);
        bhaut.setBackground(Color.WHITE);
        panelInteract.add(bhaut);
        
        panelInteract.add(new JLabel(" "));
        
        ImageIcon gauche = new ImageIcon(getClass().getResource("/projet_logo/images/flechegauche-ConvertImage.JPG"));
        JButton bgauche = new JButton(gauche);
        bgauche.setBackground(Color.WHITE);
        panelInteract.add(bgauche);
        
        panelInteract.add(new JButton("AVANCER"));
        
        ImageIcon droite = new ImageIcon(getClass().getResource("/projet_logo/images/flechedroite-ConvertImage.JPG"));        
        JButton bdroite = new JButton(droite);
        bdroite.setBackground(Color.WHITE);
        panelInteract.add(bdroite);
        
        panelInteract.add(new JLabel(" "));
        
        ImageIcon bas = new ImageIcon(getClass().getResource("/projet_logo/images/flechebas-ConvertImage.JPG"));        
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
        JPanel panelMenu = new JPanel(new GridLayout(9,0));
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
        JPanel baniere = new JPanel(new GridLayout(0,2));
        baniere.add(new JLabel("Créer Exercice"));
        baniere.add(new JLabel("Nom Exercice"));
        mainPanel.add(baniere, BorderLayout.NORTH);
        
        //menu du milieu
        JPanel milieu = new JPanel(new GridLayout(2,2));
        milieu.add(new JLabel(new ImageIcon(getClass().getResource("/projet_logo/images/tortue_connexion.png")))); //ajouter des trucs de la bdd
        milieu.add(new JTextField("CODE"));
        milieu.add(panelInteract);
        
        JPanel buttons = new JPanel(new GridLayout(3,0));
        buttons.add(new JButton("Créer Tortue"));
        buttons.add(new JButton("Créer Tortue Rapide"));
        buttons.add(new JButton("Créer Tortue Couleur"));
        milieu.add(buttons);
        
        
        mainPanel.add(milieu, BorderLayout.CENTER);
       return mainPanel;
        
               
    }
    
    /**
     * méthode connexionProfesseur crée une interface ou le professeur va rentrer son identifiant et son mot de passe pour pouvoir démarrer l'appli
     * @return un panel qui correspond à l'affichage et que l'on va ajouter dans la frame principale
     */
    
    public JPanel connexionProf(){
        JPanel icp = new JPanel();
        
        JPanel mainIcp = new JPanel();
        JPanel l4 = new JPanel();
        
        //ajout espace à droite 
        JLabel l5 = new JLabel();
        l5.setPreferredSize(new Dimension(150,60));
        
        //ajout borderLayout
        icp.setLayout(new BorderLayout());
        mainIcp.setLayout(new BorderLayout());
        l4.setLayout(new BorderLayout());
        //ajout GridLayout 2 lignes et 2 colonnes
        JPanel menuCentre = new JPanel(new GridLayout(6,2));
        //ajout du GridLayout au centre du BorderLayout
        mainIcp.add(menuCentre,BorderLayout.CENTER);
        
        //ajout d'une image
        JLabel image = new JLabel(new ImageIcon(getClass().getResource("/projet_logo/images/tortue_connexion.PNG")));
        //redimension de l'image
        image.setPreferredSize(new Dimension(350,350));
        //placement de l'image dans le borderLayout au nord
        mainIcp.add(image,BorderLayout.NORTH);
        
        //définition d'une couleur de fond
        menuCentre.setBackground(Color.white);
        l4.setBackground(Color.white);
        icp.setBackground(Color.white);
        mainIcp.setBackground(Color.white);
        
        //ajout d'un label et d'une aire de texte
        JLabel l1 = new JLabel("Identifiant :");
        //modifier taille de la police
        l1.setFont(new Font("Arial",Font.BOLD,30));
        

        //taille du JLabel
        l1.setPreferredSize(new Dimension(150,50));
        //alignement horizontal du JLabel
        l1.setHorizontalAlignment(SwingConstants.LEFT);
        //alignement vertical du JLabel
        l1.setVerticalAlignment(SwingConstants.CENTER);
        menuCentre.add(l1);    
        
        JTextField t1 = new JTextField(); // à ajouter dans tous les Jtext une valeur par défaut qui est la variable de l'élève
        //modifier taille de police dans le JTextField
        t1.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(t1);
        
        JLabel l2 = new JLabel("Mot de passe :");
        //modifier taille de la police
        l2.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(l2);   
        //cacher le texte dans l'aire de texte pour rentrer le mot de passe sans pouvoir le lire
        JPasswordField t2 = new JPasswordField();
        //modifier taille de police dans le JPasswordField
        t2.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(t2);
        //vérifier que les noms et prénoms existent dans la base de données

                
        //ajout bouton démarrer
        JButton b = new JButton("Démarrer");
        //changement de taille du bouton
        b.setPreferredSize(new Dimension(250,100));
        b.setFont(new Font("Arial",Font.BOLD,30));
        //placer le bouton au sud
        mainIcp.add(b,BorderLayout.SOUTH);
        
        //ajout bouton retour
        JButton retour = new JButton("Retour");
        l4.add(retour);
        //changement de taille du bouton
        retour.setPreferredSize(new Dimension(150,60));
        //changement de taille de la police du bouton
        retour.setFont(new Font("Arial",Font.BOLD,30));
        //placer le bouton au nord
        l4.add(retour,BorderLayout.NORTH);
        
        icp.add(l5,BorderLayout.EAST);
        icp.add(l4,BorderLayout.WEST);
        icp.add(mainIcp);
        
        //ajout du listener sur le bouton démarrer
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                refreshW(interfacePrincEleve());
            }
        });
        
        //ajout du listener sur le bouton retour
        retour.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                refreshW(interfaceOuverture());
            }
        });
        
        //besoin d'ajouter les listeners pour les text field, et que l'interface d'après soit spécifique de l'élève
        return icp;
    }
    
    /**
     * méthode interfaceListe affiche une fenêtre qui contient sur la gauche une liste des classes
     * quand le prof sélectionne une classe, la liste des élèves de cette classe apparait sur la droite, il peut ensuite sélectionner un élève pour l'évaluer
     * 
     */
    
    public void interfaceListe(){
        JPanel mainPanel = new JPanel(new BorderLayout());
        JPanel panelClasses; //panel avec un Jtree qui affiche la liste des classes
        JPanel panelEleves; //panel avec la liste des élèves de la classe sélectionnée qui s'affiche
        
        //ajout des panels
        panelClasses = new JPanel();
       // panelClasses.add(new TreeExample(classe1bdd)
       mainPanel.add(panelClasses);
    }
    
    /**
     * méthode eleveExo permet d'obtenir une fenêtre correspondant à un élève précis et qui affiche la liste des exercices qu'il a faits ainsi que le nombre d'essais pour chacun et le statut
     */
    
    public void eleveExo(){
        
    }
    
    /**
     * méthode eleveTenta permet d'afficher une fenêtre spécifique à un élève et à un exercice et qui recense toutes les tentatives qu'il a effectué
     * le professeur pourra y changer le statut de l'exercice et mettre des commentaires
     */
    
    public void eleveTenta(){
        
    }
    
    public JPanel interfacePrincProf(Classe classe1){
        
        JPanel panelGauche = new JPanel(new GridLayout(4,0));
        JPanel mainPanel = new JPanel(new BorderLayout());
        
        //création des arbres
        TreeExample arbre = new TreeExample(classe1);
        arbre.setPreferredSize(new Dimension(200,300));
        //TreeExo arbre2 = new TreeExo(listeExos);
        //arbre2.setPreferredSize(new Dimension(200,300));
        
        //création des boutons
        JButton creer = new JButton("Créer Exercice");
        creer.setPreferredSize(new Dimension(200,100));
        JButton modif = new JButton("Modifier Exercice");
        modif.setPreferredSize(new Dimension(200,100));
        
        panelGauche.add(creer);
        panelGauche.add(modif);
        panelGauche.add(arbre);
        //panelGauche.add(arbre2);
        mainPanel.add(panelGauche, BorderLayout.WEST);
        
        return mainPanel;
    }
    
    /**
     * méthode interfacevisuExo crée une fenêtre à partir de laquelle leprof pourra visualiser les exercices qu'il a déja créé
     * sur la gauche on a la liste des exercices et sur la droite on peut voir le dessin et le code voulu, ainsi que les critères d'évaluation pour chaque statut
     * @return un panel qui correspond à l'affichage et que l'on va ajouter dans la frame principale
     */
    public JPanel interfaceVisuExo(){
       JPanel mainPanel = new JPanel(new BorderLayout());
       
       //TreeExo arbre = new TreeExo();
      // mainPanel.add(arbre, BorderLayout.WEST);
       
       mainPanel.add(new JLabel("Nom Exercice"), BorderLayout.NORTH);
       
       JPanel centre = new JPanel(new GridLayout(2,0));
       JPanel centreHaut = new JPanel();
       centreHaut.add(new JLabel(new ImageIcon(getClass().getResource("/projet_logo/images/tortue_connexion.png"))));
       centreHaut.add(new JTextField("CODE QUI REJOUE"));
       
       centre.add(centreHaut);
       centre.add(new JTextArea("Critères d'évaluation :"));
       mainPanel.add(centre, BorderLayout.CENTER);
       return mainPanel;
    }
}
