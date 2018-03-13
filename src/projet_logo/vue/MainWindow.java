/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import projet_logo.model.Classe;

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
    
    public void RefreshW(Classe classe1) {
        
    windows = new JFrame("Projet_LOGO");
    
    windows.setLayout(new BorderLayout());
    
    
    menuDroite = new JPanel();
    menuDroite.setLayout(new BorderLayout());
    menuDroite.add(formulaires.InterfaceEleve() , BorderLayout.NORTH);
    menuDroite.add(table.createTable() , BorderLayout.SOUTH);
    windows.add(trees = new TreeExample(classe1), BorderLayout.WEST);
    windows.add(menuDroite, BorderLayout.EAST);
    windows.setVisible(true);
    windows.pack();
   // windows.setSize(1000,1000);
   
    
    }
}
