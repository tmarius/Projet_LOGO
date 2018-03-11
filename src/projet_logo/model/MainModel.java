/*
 * Cette classe permet de récupérer les données de la base de donnée et de entrer
 * leur donner dans leur classe respective.
 */
package projet_logo.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class MainModel {
    private Classe classe1;
    
    /**
     * Recupere les données via leur requete, les stocks dans result et ouvre le resultat
     * dans une boucle en fonction du nombre de resultat pour permettre la creation des classes.
     */
    public void RetrieveBdd()
    {
       
    eleve leseleves; //Declaration de l'object eleve.    
    classe1 = new Classe(1,"Classe1",2); //Declaration de l'object classe.        
    Requete RequeteEleve = new Requete(); //Declaration de l'objet requete. L'implementation permet de faire la connexion a la bdd
    ResultSet Result; //Declation de l'object permettant de recuperer les resultats.
    Result = RequeteEleve.NvtRequete("select * from nom"); //Lance la requete en string via la connexion requete et est recupere dans l object resultat.
    
    try {
                while (Result.next()) //Boucle temps que l'object n est pas vide
                {
                    leseleves = new eleve(Result.getInt("id"), Result.getString("name"),
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
    

}
