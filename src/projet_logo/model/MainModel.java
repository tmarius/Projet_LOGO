/*
 * Cette classe permet de récupérer les données de la base de donnée et de entrer
 * leur donner dans leur classe respective.
 */
package projet_logo.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static projet_logo.model.SQLiteJDBCDriverConnection.connect;

/**
 *
 * Classe permettant la récupération des données dans des classes
 */
public class MainModel {
    private Classe classe1;
    private ListeExercices liste1;
    private Exercice exercice1;
    //private ListeTentatives liste2;
    
    /**
     * Permet de se connecter a la base de donnée, retourne un object de type ResultSet qui retient tout les resultat de la requete. L'input est la requete SQL en string 
     * @param sql
     * @return Resultset
     */
    public ResultSet NvtRequete(String sql)  
        {
            
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
    
      /**
     * Recupere les données via leur requete, les stocks dans result et ouvre le resultat
     * dans une boucle en fonction du nombre de resultat pour permettre la creation des classes.
     */
    public void RetrieveBdd()
    {
       
    Eleve leseleves; //Declaration de l'object eleve.    
    classe1 = new Classe(1,"Classe1",2); //Declaration de l'object classe.        
    ResultSet Result; //Declaration de l'objet permettant de recuperer les resultats.
    Result = NvtRequete("select * from Eleve"); //Lance la requete en string via la connexion requete et est recupere dans l object resultat.
    
    try {
                while (Result.next()) //Boucle temps que l'object n'est pas vide
                {
                    leseleves = new Eleve(Result.getInt("idEleve"), Result.getString("nom"),
                    Result.getString("prenom"));  //Cree un eleve avec les information de la bdd (sur une itinerance i de la boucle)
                    classe1.ajoutEleves(leseleves);  //Ajoute l'eleve dans la liste d'eleve dans la classe                              
//                    eleve.setSexe()=ResultatRequete.getBoolean("sexe");
//                    eleve.setAge()=ResultatRequete.getInt("id");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                //Si la connexion echoue
            }        
    }

    public Classe getClasse1() {
        return classe1;
    }
    
    public void retrieveExercice(){
        
    //pour récupérer les exercices
    Exercice exercice1;
    //liste1 = new ListeExercices(); //déclaration de la liste d'exercices
    ResultSet res;
    res = NvtRequete("select * from Exercice");
    
    try {
                while (res.next()) //Boucle tant que l'objet n'est pas vide
                {
                    exercice1 = new Exercice(res.getInt("idExercice"), res.getString("scriptSolution"), res.getString("criteres"), res.getString("consigne"), res.getInt("refProf"));  //Cree un eleve avec les information de la bdd (sur une itinerance i de la boucle)
                    liste1.ajoutExercice(exercice1);  //Ajoute l'exercice dans la liste d'exercices                             
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                //Si la connexion echoue
            }
   }
    
    
    
//    public void retrieveTentative(){
//        
//    //pour récupérer les tentatives
//    Tentative tentative1;
//    liste2 = new ListeTentatives(); //déclaration de la liste de tentatives
//    ResultSet res;
//    res = NvtRequete("select * from Tentative");
//    
//    try {
//                while (res.next()) //Boucle tant que l'object n est pas vide
//                {
//                    tentative1 = new Tentative(res.getInt("idTentative"), res.getString("scriptEleve"), res.getString("commentaire"), res.getInt("refExercice"), res.getInt("refEleve"));  //Cree une tentative avec les information de la bdd (sur une itinerance i de la boucle)
//                    liste2.ajoutTentative(tentative1);  //Ajoute la tentative dans la liste de tentatives                            
//                }
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//                //Si la connexion echoue
//            }
//   }
    

}
