/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class ModeleDynamiqueObjet extends AbstractTableModel {
    private final List<Ami> amis = new ArrayList<Ami>();
 
    private final String[] entetes = {"Prénom", "Nom"};
 
    public ModeleDynamiqueObjet() {
        super();
 
        amis.add(new Ami("Johnathan", "Sykes"));
        amis.add(new Ami("Nicolas", "Van de Kampf"));
        amis.add(new Ami("Damien", "Cuthbert"));
        amis.add(new Ami("Corinne", "Valance"));
        amis.add(new Ami("Emilie", "Schrödinger"));
        amis.add(new Ami("Delphine", "Duke"));
        amis.add(new Ami("Eric", "Trump"));
    }
 
    public int getRowCount() {
        return amis.size();
    }
 
    public int getColumnCount() {
        return entetes.length;
    }
 
    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }
 
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex){
            case 0:
                return amis.get(rowIndex).getPrenom();
            case 1:
                return amis.get(rowIndex).getNom();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
 
    public void addAmi(Ami ami) {
        amis.add(ami);
 
        fireTableRowsInserted(amis.size() -1, amis.size() -1);
    }
 
    public void removeAmi(int rowIndex) {
        amis.remove(rowIndex);
 
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
}