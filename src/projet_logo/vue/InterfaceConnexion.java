/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import projet_logo.model.Classe;

/**
 *
 * @author Lucas
 */
public class InterfaceConnexion {
    private final JPanel menuDroite;
    private Formulaire formulaires;
    private TableDisplay table;
    private TreeExample trees ;
    private JPanel Thewindows;
      
    public InterfaceConnexion(Classe classe1) 
    {    
        table = new TableDisplay();
        formulaires = new Formulaire();
        Thewindows= new JPanel();
        Thewindows.setLayout(new BorderLayout());
        menuDroite = new JPanel();
        menuDroite.setLayout(new BorderLayout());
        menuDroite.add(formulaires.InterfaceEleve() , BorderLayout.NORTH);
        menuDroite.add(table.createTable() , BorderLayout.SOUTH);
        Thewindows.add(trees = new TreeExample(classe1), BorderLayout.WEST);
        Thewindows.add(menuDroite, BorderLayout.EAST);
    }        
    
    public JPanel getInterfaceConnexion(){
        return Thewindows;
    }
}
