/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Thomas
 */
public class MainWindow extends JFrame {
    Formulaire formulaires = new Formulaire() ;
    TreeExample trees ;
    TableDisplay table ;
            
    private JPanel menuDroite;
    private JFrame windows;
    
    public void Window() {
        
    windows = new JFrame("Projet_LOGO");
    
    windows.setLayout(new BorderLayout());
    
    
    menuDroite = new JPanel();
    menuDroite.setLayout(new BorderLayout());
    menuDroite.add(formulaires.InterfaceEleve() , BorderLayout.NORTH);
    menuDroite.add(table = new TableDisplay() , BorderLayout.SOUTH);
    
    windows.add(trees = new TreeExample(), BorderLayout.WEST);
    windows.add(menuDroite, BorderLayout.EAST);
    windows.setVisible(true);
    windows.pack();
   // windows.setSize(1000,1000);
   
    
    }
}
