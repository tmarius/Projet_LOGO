/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    private ArrayList<eleve> ListeEleve;
    
    /**
     *
     */
    public void retrieveData()
    {
    ListeEleve = new ArrayList<>();     
    Requete RequeteEleve = new Requete();
    ResultSet Result;
    Result = RequeteEleve.NvtRequete("select * from nom");
    eleve leseleves;
    try {
                while (Result.next())
                {
                    leseleves = new eleve(Result.getInt("id"), Result.getString("name"),
                    Result.getString("prenom"));
                    ListeEleve.add(leseleves);
                        
//                    eleve.setSexe()=ResultatRequete.getBoolean("sexe");
//                    eleve.setAge()=ResultatRequete.getInt("id");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                
            }        
    }
    
   

 //    eleve.setId() = ResultatRequete.getInt("id");
//                    eleve.setNom() = ResultatRequete.getString("name");
//                    eleve.setPrenom() = ResultatRequete.getString("prenom");
//                    eleve.setSexe()=ResultatRequete.getBoolean("sexe");
//                    eleve.setAge()=ResultatRequete.getInt("id");

    public ArrayList<eleve> getListeEleve() {
        return ListeEleve;
    }

}
