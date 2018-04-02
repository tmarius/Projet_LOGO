/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;

import java.util.ArrayList;

/**
 * @author grp8
 * 
 * Cette classe va contenir plusieurs attributs, dont :
 * -l'identifiant de la classe, étant unique
 * -le nom de la classe, étant une chaîne de caractères
 * -l'identifiant d'un professeur
 * -Une liste d'eleves, avec une arraylist.
 * String Classe 
 * int idProf
 * 
 */
public class Classe {
    
    private int idClasse;
    private String Classe;
    private int idProf;
    private ArrayList<Eleve> eleves;//contient la liste des eleves de la classe

   //Constructeur de la classe Classe. En paramètre sont passé idClasse, Classe, idProf
    public Classe(int idClasse, String Classe, int idProf) {
        this.idClasse = idClasse;
        this.Classe = Classe;
        this.idProf = idProf;
        eleves = new ArrayList<>();
    }

    
    /* getIdClasse
    mthode retournant idClasse, étant l'identifiant de la classe, un integer.
    @return idClasse, l'id de la Classe
    */
    public int getIdClasse() {
        return idClasse;
    }

	/* setIdClasse
    Méthode modifiant l'identifiant de la classe, en spécifiant un nouvel id en parametre
    @param idClasse, l'identifiant de la classe, un integer
    */
    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

	/* getClasse
    méthode retournant le nom de la classe, un string.
    @return Classe, étant le nom de la classe
    */
    public String getClasse() {
        return Classe;
    }

   /* setClasse
    Méthode modifiant le nom de la classe
    @param Classe, étant le nouveau nom de la Classe.
    */
    public void setClasse(String Classe) {
        this.Classe = Classe;
    }

    
    /* getIdProf
    Méthode retournant idProf, étant l'identifiant du professeur de la classe, un integer.
    @return idProf, l'id du professeur de la classe
    */
    public int getIdProf() {
        return idProf;
    }

    
    /* setIdProf
    Méthode modifiant l'identifiant du professeur.
    @param idProf, étant le nouvel identifiant du professeur, un integer.
    */
    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    
    /* getEleves
    Méthode retournant la liste d'élèves
    @return eleves, étant une arrayList comportant des élèves.
    */
    public ArrayList<Eleve> getEleves() {
        return eleves;
    }

    
    /* setEleves
    Méthode modifiant une liste d'élèves
    @param eleves, étant une arrayList comportant des élèves.
    */
    public void setEleves(ArrayList<Eleve> eleves) {
        this.eleves = eleves;
    }
    
    /* ajoutEleves
    Méthode ajoutant un élève à une liste d'élèves
    @param unEleve, étant un objet Eleve.
    */
    public void ajoutEleves(Eleve unEleve)
    { eleves.add(unEleve);    }

    /* getEleve
    Méthode retournant un objet Eleve, après avoir indiqué l'inde du tableau
    @param index, l'index du tableau eleves
    @return un objet Eleve
    */
    public Eleve getEleve(int index){
        return eleves.get(index);
    }
    
}
