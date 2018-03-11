/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;

/**
 *
 * @author Thomas
 */
public class eleve {
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private int Classe;

    public eleve(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        //this.age = age;
        //this.refClasse = refClasse;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRefClasse() {
        return Classe;
    }

    public void setRefClasse(int refClasse) {
        this.Classe = refClasse;
    }

    
}

