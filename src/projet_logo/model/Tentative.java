/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;

/**
 * @author grp8
 * Classe Tentative
 * Un élève peut s'entraîner sur un exercice en réalisant une tentative.
 * Une tentative est constituée d'un id, un script, un commentaire, une référence d'un exercice, et la référence de l'élève ayant réalisé la tentative.
 */
public class Tentative {
    
    private int idTentative;
    private String scriptEleve;
    private String commentaire;
    private int refExercice;
    private int refEleve;
    
    //Constructeur, ayant en paramètre l'id, le script de l'élève, un commentaire, la reference de l'exercice et de l'élève.
    public Tentative(int idTentative, String scriptEleve, String commentaire, int refExercice, int refEleve){
    this.idTentative = idTentative;
    this.scriptEleve = scriptEleve;
    this.commentaire = commentaire;
    this.refEleve = refEleve;
    this.refExercice = refExercice;   
    
}

    /* getIdTentative
    Méthode retournant l'identifiant de la tentative
    @return id, l'identifiant de la tentative, un integer.
    */
    public int getIdTentative() {
        return idTentative;
    }

    /* getScriptEleve
    Méthode retournant le script de l'élève
    @return scriptEleve, un String
    */
    public String getScriptEleve() {
        return scriptEleve;
    }

    /* getCommentaire
    Méthode retournant le commentaire de la tentative
    @return commentaire, un string
    */
    public String getCommentaire() {
        return commentaire;
    }

    /* getrefExercice
    Méthode retournant la reference de l'exercice
    @return refExercice, un integer
    */
    public int getRefExercice() {
        return refExercice;
    }

    /* getrefEleve
    Méthode retournant la reference de l'eleve
    @return refEleve, un integer
    */
    public int getRefEleve() {
        return refEleve;
    }

    /* setIdTentative
    Méthode modifiant l'identifiant d'une tentative
    @param idTentative, étant le nouvel identifiant de la tentative
    */
    public void setIdTentative(int idTentative) {
        this.idTentative = idTentative;
    }

    /* setScriptEleve
    Méthode modifiant le script d'une tentative
    @param scriptEleve, étant le nouveau script de la tentative.
    */
    public void setScriptEleve(String scriptEleve) {
        this.scriptEleve = scriptEleve;
    }

    /* setCommentaire
    Méthode modifiant le commentaire d'une tentative
    @param commentaire, étant le nouveau commentaire de la tentative.
    */
    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    /* setRefExercice
    Méthode modifiant l'identifiant de l'exercice associé à la tentative
    @param refExercice, étant le nouvel identifiant d'exercice associé à la tentative
    */
    public void setRefExercice(int refExercice) {
        this.refExercice = refExercice;
    }

    /* setRefEleve
    Méthode modifiant l'identifiant de l'eleve associé à la tentative
    @param refExercice, étant le nouvel identifiant de l'eleve associé à la tentative
    */
    public void setRefEleve(int refEleve) {
        this.refEleve = refEleve;
    }    
    

        
}
    
