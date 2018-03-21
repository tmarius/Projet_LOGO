package projet_logo;


//import java.sql.ResultSet;
import java.util.ArrayList;
//import projet_logo.model.MainModel;
import projet_logo.model.Eleve;
import projet_logo.vue.MainWindow;


/**
 *Main classe du projet, permet de cree les objects et d'appeler les fonction pour charger tous les elements
 */
public class Projet_LOGO {

     
    
    /**
     * Main fonction
     */
    public static void main(String[] args) {
    //Declaration    
    ArrayList<Eleve> eleves;
    eleves = new ArrayList<>();
    //MainModel datas;
    
    
    //datas = new MainModel(); 
     // Le mettre en static ? 
    //datas.RetrieveBdd(); // Permet de charger la bdd dans des classes
     
    MainWindow window = new MainWindow(); 
    //Windows.RefreshW(datas.getClasse1()); // Appel les elements graphiques. La windows.
    //window.RefreshW();
    
    //Requete R = new Requete(); 
    //ResultSet ResultatRequete;
    //ResultatRequete = R.NvtRequete("select * from nom");
    //R.Remplir_tableau(ResultatRequete);
    
    //eleves = datas.getListeEleve();
    
    //Windows.Window(eleves);
    
     // retrieving data from string list array in for loop
    
    }
    
}
