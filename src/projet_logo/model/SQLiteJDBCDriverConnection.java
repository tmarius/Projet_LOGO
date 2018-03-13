/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author 
 */
public class SQLiteJDBCDriverConnection {
    //private Connection conn;
    //Request req;
     /**
     * Connect to a sample database
     */
    public static Connection connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/Users/Lucas/Documents/MASTER_GPhy/Master 1/SecondSemestre/IHM/BDD/test2.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return(conn);
    }
    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) 
//    {
//        Connection recon = connect();
//        
//        Statement stmt = null; 
//        //String ss=req.requestFunction();
//        String sql;
//        sql = "select * from nom";
//        //String sql = "select idEleve from Eleve";
//        try
//        {
//            stmt = recon.createStatement();
//
//            ResultSet rs = stmt.executeQuery(sql);
//            while (rs.next()) 
//            {
//                int idR = rs.getInt("id");
//                String nameR = rs.getString("name");
//                String prenomR = rs.getString("prenom");
//                System.out.println(idR + "\t" +nameR + "\t" +prenomR);
//            }
//        } 
//        catch (SQLException e) 
//        {
//            System.out.println(e.getMessage());
//        }
//    }
}
