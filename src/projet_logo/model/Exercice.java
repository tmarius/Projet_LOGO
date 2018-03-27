/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;
import java.util.ArrayList;

/**
 *
 * @author Lucas
 */
public class Exercice {
    
    private int id;
    private String critere;
    private String scriptSolution;
    private String consigne;
    private int refProf;
    private ArrayList<Tentatives> tentatives; //chaque exercice a une liste de tentatives...?
    
        public Exercice(int id, String scriptSolution, String critere, String consigne, int refProf){
        this.id = id;
        this.critere = critere;
        this.scriptSolution  = scriptSolution;
        this.consigne = consigne;
        this.refProf = refProf;
    }

    public int getId() {
        return id;
    }

    public String getCritere() {
        return critere;
    }

    public String getScriptSolution() {
        return scriptSolution;
    }

    public String getConsigne() {
        return consigne;
    }

    public int getRefProf() {
        return refProf;
    }

    public ArrayList<Tentatives> getTentatives() {
        return tentatives;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setCritere(String critere) {
        this.critere = critere;
    }

    public void setScriptSolution(String scriptSolution) {
        this.scriptSolution = scriptSolution;
    }

    public void setConsigne(String consigne) {
        this.consigne = consigne;
    }

    public void setRefProf(int refProf) {
        this.refProf = refProf;
    }

    public void setTentatives(ArrayList<Tentatives> tentatives) {
        this.tentatives = tentatives;
    }
    
    public void ajoutTenta(Tentatives tentas){
        tentatives.add(tentas);
    }  
}
