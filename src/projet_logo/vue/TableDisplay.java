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


/**
 *
 * @author ivan
 */
public class TableDisplay extends JFrame implements ActionListener{
     
    private JPanel myPanel;
    private JButton change;
    private DefaultTableModel model;

    private JTable tableaumain;
    private final String[] title ={"Prénom", "Nom", "Couleur favorite", "Homme"};
    private Object[][] data;
    
public TableDisplay(){
   
}
public JPanel createTable(){
    
    myPanel = new JPanel();
    myPanel.setLayout(new BorderLayout());
    
    change= new JButton("change");
    myPanel.add(change,BorderLayout.EAST);
    change.addActionListener(this);
    
    data = new Object[][]{
        
                {"Johnathan", "Sykes", Color.red, true},
                {"Nicolas", "Van de Kampf", Color.black, true},
                {"Damien", "Cuthbert", Color.cyan, true},
                {"Corinne", "Valance", Color.blue, false},
                {"Emilie", "Schrödinger", Color.magenta, false},
                {"Delphine", "Duke", Color.yellow, false},
                {"Eric", "Trump", Color.pink, true},
                
    };
    model = new DefaultTableModel(data, title);
    
    //creation table
    tableaumain = new JTable(model);
    
    
    //listener
    
    
    //test listener
    tableaumain.setCellSelectionEnabled(true);
    ListSelectionModel cellSelectionModel = tableaumain.getSelectionModel();
    cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
      public void valueChanged(ListSelectionEvent e) {
        String selectedData = null;

        int[] selectedRow = tableaumain.getSelectedRows();
        int[] selectedColumns = tableaumain.getSelectedColumns();

        for (int i = 0; i < selectedRow.length; i++) {
          for (int j = 0; j < selectedColumns.length; j++) {
            selectedData = (String) tableaumain.getValueAt(selectedRow[i], selectedColumns[j]);
          }
        }
        System.out.println("Selected: " + selectedData);
      }

    });

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
    
public void actionPerformed(ActionEvent e) {
        if (e.getSource() == change){
                model.setValueAt("LOIC",2,2);
        }
}
}