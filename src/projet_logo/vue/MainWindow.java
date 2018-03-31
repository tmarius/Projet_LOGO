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
import javax.swing.event.ListSelectionEvent;
import projet_logo.controler.Controler_table;
import projet_logo.model.Classe;
import projet_logo.model.MainModel;
import projet_logo.model.*;

/**
 * Page principale. Est une frame ayant des pannels changeant en fonction de l'interface. 
 *Il est possible de passer d'une interface à une autre en en appelant.
 * @author grp8
 */
public class MainWindow extends JFrame {
    private Formulaire formulaires = new Formulaire() ;
    private TreeExample trees ;
    private TableDisplay table = new TableDisplay();
            
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
    windows.add(InCo.getInterfaceConnexion()); //on commence par la première interface
    
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
    //windows.add(PrProf.getInterfacePrincProf());
   
    //Interface visualisation exercice
   //windows.add(VisuEx.getInterfaceVisuExo());

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
    
    
//    public JPanel interfaceConnexion(Classe classe1, MainModel datas) 
//    {   
//        
//       
//        
//        
//        JPanel Thewindows = new JPanel();
//        Thewindows.setLayout(new BorderLayout());
//        menuDroite = new JPanel();
//        menuDroite.setLayout(new BorderLayout());
//        menuDroite.add(formulaires.InterfaceEleve() , BorderLayout.NORTH);
//        menuDroite.add(table.createTable(classe1) , BorderLayout.SOUTH);
//        Thewindows.add(trees = new TreeExample(classe1), BorderLayout.WEST);
//        Thewindows.add(menuDroite, BorderLayout.EAST);
//        Controler_table tcontroler = new Controler_table(classe1,table,datas);
//        
//        return (Thewindows);
//    }        
    
   
}
