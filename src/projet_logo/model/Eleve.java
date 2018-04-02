/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;

/**
 *
 * @author grp8
 * 
 * Classe Eleve
 * Un Eleve est composé d'un identifiant, d'un nom, d'un prénom, d'un âge et appartient à une classe.
 * La classe Eleve posséde plusieurs méthodes setters et getters.
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
    
    /* getId
    Méthode retournant l'identifiant de l'élève
    @return id, étant un integer, l'identifiant de l'élève.
    */
    public int getId() {
        return id;
    }

    /* setId
    Méthode modifiant l'identifiant de l'élève
    @param id, le nouvel identifiant de l'élève
    */
    public void setId(int id) {
        this.id = id;
    }

    /* getNom
    Méthode retournant le nom de l'élève
    @return nom, étant un string, le nom de l'élève
    */
    public String getNom() {
        return nom;
    }

    /* setNom
    Méthode modifiant le nom de l'élève
    @param nom, le nouveau nom de l'élève
    */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /* getPrenom
    Méthode retournant le prenom de l'élève
    @return prenom, étant un string, le prenom de l'élève
    */
    public String getPrenom() {
        return prenom;
    }

    /* setPrenom
    Méthode modifiant le prénom de l'élève
    @param prenom, le nouveau prénom de l'élève
    */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /* getAge
    Méthode retournant l'age de l'élève
    @return age, étant un int, l'age de l'élève
    */
    public int getAge() {
        return age;
    }

    /* setAge
    Méthode modifiant l'age de l'élève
    @param age, le nouvel age de l'élève, un integer.
    */
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
