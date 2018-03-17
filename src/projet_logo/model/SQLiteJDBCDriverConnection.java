/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Classe SQLiteJDBCDriverConnection
 * Permet de tester la connexion à SQLite Studio, après avoir spécifié l'url permettant d'aller jusqu'à la base de données.
 * Crée un objet Connection conn, permettant de se connecter à la base de données.
 * Si la connection a lieu, affiche un message à l'utilisateur, disant que la connection à SQLite Studio a été établie.
 * Sinon, renvoie un message d'erreur.
 * Dans tous les cas, renvoie l'objet Connection.
 */

public class SQLiteJDBCDriverConnection {
     /**
     * Connection à une BDD, en spécifiant l'url.
     */
    public static Connection connect() {
        Connection conn = null; //Création 
        try {
            // db parameters
            String url = "jdbc:sqlite:C:/sqlitestudio-3.1.1/SQLiteStudio/bddtest2.db"; //url permettant de se connecter à la BDD.
            // create a connection to the database
            conn = DriverManager.getConnection(url); //Connection à la BDD, en passant par l'url
            
            System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) { //Si la connection n'a pas été établit, catch une erreur
            System.out.println(e.getMessage()); //Affiche un message d'erreur
        }
        return(conn);
    }
}
