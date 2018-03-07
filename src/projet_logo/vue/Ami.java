/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

/**
 *
 * @author Thomas
 */
public class Ami {
    private String nom;
    private String prenom;
 
    public Ami(String nom, String prenom) {
        super();
 
        this.nom = nom;
        this.prenom = prenom;
    }
 
    public String getNom() {
        return nom;
    }
 
    public void setNom(String nom) {
        this.nom = nom;
    }
 
    public String getPrenom() {
        return prenom;
    }
 
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}