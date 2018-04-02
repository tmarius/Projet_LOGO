/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.controler;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import projet_logo.model.Classe;
import projet_logo.model.Eleve;
import projet_logo.model.MainModel;
import projet_logo.vue.TableDisplay;

/**
 *
 * @author ivan
 */
public class Controler_table {
    private JTable table;
    private Classe classe;

	/*
	 * @see
	 * javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.
	 * ListSelectionEvent)
	 */
	public Controler_table(Classe newclasse, TableDisplay newtable,  MainModel datas) {
		this.table = newtable.getTableaumain();
		this.classe = newclasse;
                
                table.setCellSelectionEnabled(true);
                ListSelectionModel cellSelectionModel = table.getSelectionModel();
                cellSelectionModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
                cellSelectionModel.addListSelectionListener(new ListSelectionListener() {
                public void valueChanged(ListSelectionEvent e) {
                  String selectedData = null;

                  int[] selectedRow = table.getSelectedRows();
                  int[] selectedColumns = table.getSelectedColumns();

                  for (int i = 0; i < selectedRow.length; i++) {
                    for (int j = 0; j < selectedColumns.length; j++) {
                      selectedData = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);
                       //table.getModel().getValueAt(selectedRow, selectedColumns); 
                    }
                  }
                
                 System.out.println("Selected: " + selectedData + "YOLO");
                 datas.updateEleve(1,"TRIAL","Trial");
                }

               });

	}

	public void valueChanged(ListSelectionEvent listSelectionEvent, MainModel datas) {
		if (listSelectionEvent.getValueIsAdjusting())
                return;
			
                    ListSelectionModel lsm = (ListSelectionModel) listSelectionEvent
				.getSource();
                    if (lsm.isSelectionEmpty()) 
                    {
                        return;
                    }
                    else 
                    {
                        int selectedRow = lsm.getMinSelectionIndex();   
			Eleve selectedEleve = classe.getEleve(table.convertRowIndexToModel(selectedRow));

                    }
	}
}

