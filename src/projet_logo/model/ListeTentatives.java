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
 * Classe ListeTentatives
 * Classe composée d'une liste d'objets Exercice : listeTentas
 * Classe composée de méthodes setters et getters, et ajoutTentative.
 */
public class ListeTentatives {
    
    ArrayList<Tentative> listeTentas;

    /* getListeTentas
    Méthode retournant une liste de tentatives, étant des objets Tentative
    @return listeTentas, étant une liste de tentatives (objets Tentative)
    */
    public ArrayList<Tentative> getListeTentas() {
        return listeTentas;
    }

    /* setListeTentas
    Méthode modifiant la liste de tentatives par une nouvelle liste passée en paramètre.
    @param listeTentas, étant une nouvelle liste d'objets Tentative
    */
    public void setListeTentas(ArrayList<Tentative> listeTentas) {
        this.listeTentas = listeTentas;
    }
    
    /* ajoutTentative
    Méthode ajoutant un objet Tentative, nommé tentative, à une liste d'objets Tentative.
    @param tentative, étant un objet Tentative à ajouter à listeTentas, une liste d'objets Tentative.
    */ 
    public void ajoutTentative(Tentative tentative){
        listeTentas.add(tentative);
        
    }
    
}
