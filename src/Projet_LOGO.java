import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import static projet_logo.model.SQLiteJDBCDriverConnection.connect;
import projet_logo.model.Requete;
import projet_logo.vue.Formulaire;
import projet_logo.vue.MainWindow;
import projet_logo.vue.TreeExample;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Projet_LOGO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //Formulaire formulaires = new Formulaire();
    //formulaires.InterfaceEleve();
   // TreeExample trees = new TreeExample();
    MainWindow Windows = new MainWindow();
    Windows.Window();
    Requete R = new Requete(); 
    ResultSet ResultatRequete;
    ResultatRequete = R.NvtRequete("select * from nom");
    R.Remplir_tableau(ResultatRequete);
    
    
    }
    
}