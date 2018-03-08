/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static projet_logo.model.SQLiteJDBCDriverConnection.connect;

/**
 *
 * @author Thomas
 */
public class Requete {
    
    
    
       
        
        public ResultSet NvtRequete(String sql) {
            
            Connection recon = connect();
        
            Statement stmt = null; 
            //String ss=req.requestFunction();
            //String sql = "select idEleve from Eleve";
            
               try
                {
                    stmt = recon.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);
                    return (rs);
                } 
               catch (SQLException e) 
                {
                    System.out.println(e.getMessage());
                    return(null);
                }
        }
               
        public void Remplir_tableau(ResultSet ResultatRequete) 
        {
        
            
            try {
                while (ResultatRequete.next())
                {
                    int idR = ResultatRequete.getInt("id");
                    String nameR = ResultatRequete.getString("name");
                    String prenomR = ResultatRequete.getString("prenom");
                    System.out.println(idR + "\t" +nameR + "\t" +prenomR);
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                //    return(null);
            }

            }       
        
        }

