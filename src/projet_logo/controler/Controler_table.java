/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.controler;

import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import projet_logo.model.Classe;
import projet_logo.model.Eleve;
import projet_logo.vue.MainWindow;

/**
 *
 * @author ivan
 */
public class Controler_table {
    private JTable table;
    private Classe classe;
    private MainWindow mainview;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * javax.swing.event.ListSelectionListener#valueChanged(javax.swing.event.
	 * ListSelectionEvent)
	 */
	public Controler_table(JTable table, Classe classe, MainWindow view) {
		this.table = table;
		this.classe = classe;
		this.mainview = view;

	}


}

