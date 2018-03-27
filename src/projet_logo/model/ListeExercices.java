/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.model;
import java.util.ArrayList;

/**
 *
 * @author morgane
 */
public class ListeExercices {
    
    private ArrayList<Exercice> listeExos;

    public ListeExercices(){
        listeExos = new ArrayList<>();
    }
    
    public ArrayList<Exercice> getListeExos() {
        return listeExos;
    }

    public void setListeExos(ArrayList<Exercice> listeExos) {
        this.listeExos = listeExos;
    }
    
    public void ajoutExercice(Exercice exercice){
        listeExos.add(exercice);
        
    }
    
}
