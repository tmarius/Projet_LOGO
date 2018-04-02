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
 * Classe ListeExercices
 * Classe composée d'une liste d'objets Exercice : listeExos
 * Classe composée de méthodes setters et getters, et ajoutExercice.
 * 
 */
public class ListeExercices {
    
    ArrayList<Exercice> listeExos;

    /* getListeExos
    Méthode retournant une liste d'exercices, étant des objets Exercice
    @return listeExos, étant une liste d'exercices (objets Exercice)
    */
    public ArrayList<Exercice> getListeExos() {
        return listeExos;
    }

    /* setListeExos
    Méthode modifiant la liste d'exercices par une nouvelle liste passée en paramètre.
    @param listeExos, étant une nouvelle liste d'objets Exercice
    */
    public void setListeExos(ArrayList<Exercice> listeExos) {
        this.listeExos = listeExos;
    }
    
    /* ajoutExercice
    Méthode ajoutant un objet Exercice, nommé exercice, à une liste d'objets Exercice.
    @param exercice, étant un objet Exercice à ajouter à listeExos, une liste d'objets Exercice.
    */
    public void ajoutExercice(Exercice exercice){
        listeExos.add(exercice);
        
    }
    
}
