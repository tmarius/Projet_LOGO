/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;

/**
 * @author Lucas
 */
public class Tentatives {
    
    private int idTentative;
    private String scriptEleve;
    private String commentaire;
    private int refExercice;
    private int refEleve;
    
    public Tentatives(int idTentative, int refExercice, int refEleve){
    this.idTentative = idTentative;
    this.refEleve = refEleve;
    this.refExercice = refExercice;   
    
}

    public int getIdTentative() {
        return idTentative;
    }

    public String getScriptEleve() {
        return scriptEleve;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public int getRefExercice() {
        return refExercice;
    }

    public int getRefEleve() {
        return refEleve;
    }

    public void setIdTentative(int idTentative) {
        this.idTentative = idTentative;
    }

    public void setScriptEleve(String scriptEleve) {
        this.scriptEleve = scriptEleve;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public void setRefExercice(int refExercice) {
        this.refExercice = refExercice;
    }

    public void setRefEleve(int refEleve) {
        this.refEleve = refEleve;
    }    
}
