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
public class Eleve {
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private boolean homme;
    
    /**
     *
     * @param id
     * @param nom
     * @param prenom
     * @param age
     * @param homme
     */
    public Eleve(int id, String nom, String prenom,int age, boolean homme) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.homme= homme;
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

    public boolean isHomme() {
        return homme;
    }


    public void setHomme(boolean homme) {
        this.homme = homme;
    }

    
}
