/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;
import java.sql.ResultSet;
import javax.swing.*;
import projet_logo.model.MainModel;

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
    private final ConnexionProf CoProf;
    private final InterfacePrincEleve PrEleve;
    private final InterfaceCreaExo CreaEx;
    private final InterfaceListeClasse ListeClasse;
    private final InterfacePrincProf PrProf;
    private final InterfaceVisuExo VisuEx;
    private final InterfaceResultat results;

    /**
     * Constructeur de l'interface
     * @param datas correspond aux données de la base de données
     */
    public MainWindow(MainModel datas){
    
    windows = new JFrame("Projet_LOGO"); //on construit la frame
    InCo = new InterfaceConnexion(datas.getClasse1());
    InOuv = new InterfaceOuverture(this);
    CoEleve = new ConnexionEleve(this);
    CoProf = new ConnexionProf();
    PrEleve = new InterfacePrincEleve(this);
    CreaEx = new InterfaceCreaExo(this);
    ListeClasse = new InterfaceListeClasse();
    PrProf =  new InterfacePrincProf(this);
    VisuEx = new InterfaceVisuExo();
    results = new InterfaceResultat(this);
    

    //Interface de test avec Jtree, Jtable ...
    //windows.add(InCo.getInterfaceConnexion()); //on commence par la première interface
    
    //Interface ouverture, la première qui apparait quand on lance l'appli
    windows.add(InOuv.getInterfaceOuverture());

    windows.setVisible(true);
    windows.pack();
    windows.setExtendedState(windows.MAXIMIZED_BOTH);
    windows.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    }
    public void refreshW(JPanel fenetre) {
    
    windows.setContentPane(fenetre);
    windows.repaint();
    windows.revalidate();
    
    }

    public InterfaceConnexion getInCo() {
        return InCo;
    }

    public InterfaceOuverture getInOuv() {
        return InOuv;
    }

    public ConnexionEleve getCoEleve() {
        return CoEleve;
    }
    
    public ConnexionProf getCoProf() {
        return CoProf;
    }

    public InterfacePrincEleve getPrEleve() {
        return PrEleve;
    }

    public InterfaceCreaExo getCreaEx() {
        return CreaEx;
    }

    public InterfaceListeClasse getListeClasse() {
        return ListeClasse;
    }

    public InterfacePrincProf getPrProf() {
        return PrProf;
    }

    public InterfaceVisuExo getVisuEx() {
        return VisuEx;
    }

    public InterfaceResultat getResults() {
        return results;
    }
    
   
}
