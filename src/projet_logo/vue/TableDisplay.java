/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import javax.swing.*;
import java.awt.*;
public class TableDisplay extends JPanel {
    
    private ModeleDynamiqueObjet modele = new ModeleDynamiqueObjet();
    private JTable tableau;
    public TableDisplay() {
        super();
 
        //setTitle("JTable basique dans un JPanel");
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
         
        tableau = new JTable(modele);
 
        this.add(new JScrollPane(tableau), BorderLayout.CENTER);
 
        JPanel boutons = new JPanel();
 
        boutons.add(new JButton("ajouter"));
        boutons.add(new JButton("supprimer"));
 
        this.add(boutons, BorderLayout.SOUTH);
 
        //pack();
    }
 
    public static void main(String[] args) {
        new TableDisplay().setVisible(true);
    }
 
  //  private class AddAction extends AbstractAction {
    //    private AddAction() {
      //      super();//AJOUTER METHODE
      //  }
 
        //public void actionPerformed(ActionEvent e) {
        //   modele.addAmi(new Ami("Megan", "Sami"));
        //}
    //}
    
    
}