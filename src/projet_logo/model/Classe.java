/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;

import java.util.ArrayList;

/**
 *
 * @author Thomas
 */
public class Classe {
    
    private int idClasse;
    private String Classe;
    private int idProf;
    private ArrayList<eleve> eleves;

    public Classe(int idClasse, String Classe, int idProf) {
        this.idClasse = idClasse;
        this.Classe = Classe;
        this.idProf = idProf;
        eleves = new ArrayList<>();
    }

    
    
    public int getIdClasse() {
        return idClasse;
    }

    public void setIdClasse(int idClasse) {
        this.idClasse = idClasse;
    }

    public String getClasse() {
        return Classe;
    }

    public void setClasse(String Classe) {
        this.Classe = Classe;
    }

    public int getIdProf() {
        return idProf;
    }

    public void setIdProf(int idProf) {
        this.idProf = idProf;
    }

    public ArrayList<eleve> getEleves() {
        return eleves;
    }

    public void setEleves(ArrayList<eleve> eleves) {
        this.eleves = eleves;
    }
    
    public void ajoutEleves(eleve unEleve)
    { eleves.add(unEleve);    }
}
