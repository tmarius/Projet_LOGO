package projet_logo.model;



/**
 * Tortue LOGO capable d'écrire en couleur
 * Seules les couleurs suivantes sont autorisées :
 *  "black", "red", "blue", "green", "yellow" , "magenta"
 *  Si la couleur demandée est différente, la tortue écrit en noir
 *  
 * @author Patrick Girard 
 * @version février 2017
 */


public class TortueCouleur extends TortueG {

    // Couleurs
    private static final String lesCouleurs [] = { "black", "red", "blue", "green", "yellow" , "magenta" };
    
    /**
     * Constructeur par défaut, la tortue écrit en noir
     *
     */
    public TortueCouleur() {
        super();
    }

    
    /**
     * Constructeur permettant de spécifier la couleur
     *
     * @param coul la couleur demandée
     */
    public TortueCouleur(String coul) {
        super();
        couleurTrace = rendCouleur(coul);
    }
    
    /**
     * Méthode setCouleur : change la couleur de la tortue
     *
     * @param coul la couleur demandée
     */
    public void setCouleur(String coul){
        couleurTrace = rendCouleur(coul);
    }
    
    /**
     * Accesseur de la couleur
     *
     * @return la couleur de la tortue
     */
    public String getCouleur() {
        return couleurTrace;
    }
    
    /**
     * Méthode rendCouleur : permet de vérifier que la couleur demandée est correcte
     * rend "black" sinon
     *
     * @param coul la couleur demandée
     * @return la couleur vérifiée
     */
    private String rendCouleur(String coul) {
        for (int i=0; i<lesCouleurs.length; i++)
            if (coul.equalsIgnoreCase(lesCouleurs[i]))
              return coul.toLowerCase();
        return "black";
    }

}