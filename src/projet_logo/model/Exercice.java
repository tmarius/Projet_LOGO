/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;
import java.util.ArrayList;

/**
 *
 * @author grp8
 * Classe Exercice
 * Un exercice est proposé par un professeur. Il pourra être réalisé par les élèves.
 * Un exercice est composé d'un id, critere, scriptSolution, consigne, refProf, tentatives.
 * La classe Exercice contient des getters et setters.
 */
public class Exercice {
    
    private int id; //identifiant de l'exercice
    private String critere; //Critère de réussite de l'exercice
    private String scriptSolution; //Solution de l'exercice, afin de réussir l'exercice.
    private String consigne;
    private int refProf; //Id du professeur réalisant l'exercice
    private ArrayList<Tentatives> tentatives; //Chaque exercice a une liste de tentatives d'élèves.
    
        //Constructeur de la classe Exercice, ayant en paramètre l'id, le scriptSolution, la consigne et la reference du professeur.
        public Exercice(int id, String scriptSolution, String consigne, int refProf){
        this.id = id;
        this.critere = critere;
        this.scriptSolution  = scriptSolution;
        this.consigne = consigne;
        this.refProf = refProf;
    }

    /* getId
    Méthode retournant l'identifiant de l'exercice
    @return id, l'identifiant de l'exercice, un integer.
    */
    public int getId() {
        return id;
    }

    
    /* getCritere
    Méthode retournant le critere de l'exercice
    @return critere, étant un string.
    */
    public String getCritere() {
        return critere;
    }

    
    /* getScriptSolution
    Méthode retournant le script de solution de l'exercice
    @return scriptSolution, un String
    */
    public String getScriptSolution() {
        return scriptSolution;
    }

    
    /* getConsigne
    Méthode retournant la consigne de l'exercice
    @return consigne, un string
    */
    public String getConsigne() {
        return consigne;
    }

    
    /* getRefProf
    Méthode retournant l'identifiant du professeur ayant crée l'exercice
    @return refProf, l'identifiant du professeur, un integer.
    */
    public int getRefProf() {
        return refProf;
    }

    /* getTentatives
    Méthode retournant la liste des tentatives.
    @return tentatives, étant une liste d'objets Tentatives.
    */
    public ArrayList<Tentatives> getTentatives() {
        return tentatives;
    }
    
    /* setId
    Méthode modifiant l'identifiant d'un exercice
    @param id, étant le nouvel identifiant de l'exercice.
    */
    public void setId(int id) {
        this.id = id;
    }

    /* setCritere
    Méthode modifiant le critere d'un exercice
    @param critere, étant le nouveau critere de l'exercice.
    */
    public void setCritere(String critere) {
        this.critere = critere;
    }

    /* setScriptSolution
    Méthode modifiant le script desolution d'un exercice
    @param scriptSolution, étant le nouveau script desolution de l'exercice.
    */
    public void setScriptSolution(String scriptSolution) {
        this.scriptSolution = scriptSolution;
    }

    /* setConsigne
    Méthode modifiant la consigne d'un exercice
    @param consigne, étant la nouvelle consigne de l'exercice.
    */
    public void setConsigne(String consigne) {
        this.consigne = consigne;
    }

    /* setRefProf
    Méthode modifiant l'identifiant du professeur ayant réalisé l'exercice
    @param refProf, étant le nouvel identifiant du prof ayant réalisé l'exercice.
    */
    public void setRefProf(int refProf) {
        this.refProf = refProf;
    }

    /* setTentatives
    Méthode modifiant les tentatives d'un exercice
    @param tentatives, étant la nouvelle liste de tentatives (objets Tentative)
    */
    public void setTentatives(ArrayList<Tentatives> tentatives) {
        this.tentatives = tentatives;
    }
    
    /* ajoutTenta
    Méthode ajoutant une tentative à une liste d'objets Tentative (tentatives)
    @param tentas, étant la tentative à ajouter à la liste d'objets Tentative.
    */
    public void ajoutTenta(Tentatives tentas){
        tentatives.add(tentas);
    }  
}
