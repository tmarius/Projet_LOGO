/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import projet_logo.model.Classe;
import projet_logo.model.Requete;
import projet_logo.model.eleve;

/**
 *
 * @author Thomas
 */
public class MainWindow extends JFrame {
    Formulaire formulaires = new Formulaire() ;
    TreeExample trees ;
    TableDisplay table = new TableDisplay();
            
    private JPanel menuDroite;
    private JFrame windows;
    private ResultSet Result;
    Requete R = new Requete();
    
    public void RefreshW(Classe classe1) {
        
    windows = new JFrame("Projet_LOGO");
    
    windows.setLayout(new BorderLayout());
    
    
    menuDroite = new JPanel();
    menuDroite.setLayout(new BorderLayout());
    menuDroite.add(formulaires.InterfaceEleve() , BorderLayout.NORTH);
    menuDroite.add(table.createTable() , BorderLayout.SOUTH);
    Result = R.NvtRequete("select * from nom");
    windows.add(trees = new TreeExample(classe1), BorderLayout.WEST);
    windows.add(menuDroite, BorderLayout.EAST);
    windows.setVisible(true);
    windows.pack();
   // windows.setSize(1000,1000);
   
    
    }
}
