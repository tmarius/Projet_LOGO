/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;


import java.awt.*;
import static java.awt.BorderLayout.CENTER;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import javax.swing.table.*;
import projet_logo.controler.Controler_table;
import projet_logo.model.Classe;


/**
 *
 * @author ivan
 */
public class TableDisplay extends JFrame implements ActionListener{
     
    private JPanel myPanel;
    private JButton change;
    private DefaultTableModel model;

    private JTable tableaumain;
    private final String[] title ={"Id", "Prénom", "Nom", "Age", "Sexe"};
    private Object[][] data;
    
public TableDisplay(){
   
}
public JPanel createTable(Classe classetable){
    
    myPanel = new JPanel();
    myPanel.setLayout(new BorderLayout());
    
    change= new JButton("change");
    myPanel.add(change,BorderLayout.EAST);
    change.addActionListener(this);
    
    
     
    
    int i;
    Object[][] shades = new Object [classetable.getEleves().size()][5];
    for (i=0;i<classetable.getEleves().size();i++) 
    { shades[i][0]= classetable.getEleve(i).getId();
      shades[i][1]= classetable.getEleve(i).getNom(); 
      shades[i][2]= classetable.getEleve(i).getPrenom();
      shades[i][3]= classetable.getEleve(i).getAge();
      shades[i][4]= classetable.getEleve(i).isHomme();  
    }
        
    
    
    
   
    
             
    
    model = new DefaultTableModel(shades, title);
    
    //creation table
    tableaumain = new JTable(model);
    
    

    myPanel.add(new JScrollPane(tableaumain), CENTER);
    
    
    myPanel.add(tableaumain, BorderLayout.CENTER);
    myPanel.add(change, BorderLayout.SOUTH);
    
    
   return(myPanel);
}
    public boolean isCellEditable(int row, int col) {
        //Note that the data/cell address is constant,
        //no matter where the cell appears onscreen.
        if (col < 2) {
            return false;
        } else {
            return true;
        }
    }
    
     public void setValueAt(Object value, int row, int col) {
        data[row][col] = value;
        //fireTableCellUpdated(row, col);
    }


    public void tableChanged(TableModelEvent e) {
       
        int row = e.getFirstRow();
        int column = e.getColumn();
        TableModel model = (TableModel)e.getSource();
        String columnName = model.getColumnName(column);
        Object data = model.getValueAt(row, column);
        
        model.setValueAt("LOIC",row,column);
        
        
    			
       //fireTableCellUpdated();
    }

    public JTable getTableaumain() {
        return tableaumain;
    }
    
public void actionPerformed(ActionEvent e) {
        if (e.getSource() == change){
                model.setValueAt("LOIC",2,2);
        }
}
}