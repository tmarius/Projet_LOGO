import javax.swing.*;
import java.awt.*;
/*
 * Interface de connexion pour l'élève, il va devoir rentrer son nom 
 *et son prénom et sélectionner sa classe puis cliquer sur le bouton 
 *démarrer.
 */

/**
 *
 * @author gourd
 */
public class InterfaceConnexion extends JFrame{
    public InterfaceConnexion(){
        //redimensionner la fenetre non possible
        this.setResizable(false);
        //laisser la fenetre au premier plan
        this.setAlwaysOnTop(true);
        //titre de la fenetre
        this.setTitle("Interface connexion des élèves");
        //taille de la fenetre
        this.setSize(1000,800);
        //positionne la fenetre au centre
        this.setLocationRelativeTo(null);
        //instanciation d'un objet JPanel
        JPanel ic = new JPanel();
        //content pane
        this.setContentPane(ic);
        
        JPanel mainIc = new JPanel();
        //ajout borderLayout
        mainIc.setLayout(new BorderLayout());
        //ajout GridLayout 4 lignes et 2 colonnes
        JPanel menuCentre = new JPanel(new GridLayout(4,2));
        //ajout du GridLayout au centre du BorderLayout
        mainIc.add(menuCentre,BorderLayout.CENTER);
        
        //ajout d'une image
        JLabel image = new JLabel(new ImageIcon("tortue_connexion.PNG"));
        //redimension de l'image
        image.setPreferredSize(new Dimension(350,350));
        //placement de l'image dans le borderLayout au nord
        mainIc.add(image,BorderLayout.NORTH);
        
        //définition d'une couleur de fond
        menuCentre.setBackground(Color.white);
        
        ic.setBackground(Color.white);
        
        //adding the labels and text area
        JLabel l1 = new JLabel("Nom :");
        //modifier taille de la police
        l1.setFont(new Font("Arial",Font.BOLD,30));
        

        //taille du JLabel
        l1.setPreferredSize(new Dimension(150,50));
        //alignement horizontal du JLabel
        l1.setHorizontalAlignment(SwingConstants.LEFT);
        //alignement vertical du JLabel
        l1.setVerticalAlignment(SwingConstants.CENTER);
        menuCentre.add(l1);    
        
        JTextField t1 = new JTextField(); // à ajouter dans tous les Jtext une valeur par défaut qui est la variable de l'élève
        //modifier taille de police dans le JTextField
        t1.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(t1);
        
        JLabel l2 = new JLabel("Prénom :");
        //modifier taille de la police
        l2.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(l2);    
        JTextField t2 = new JTextField();
        //modifier taille de police dans le JTextField
        t2.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(t2);
        //vérifier que les noms et prénoms existent dans la base de données
        
        JLabel l3 = new JLabel("Classe");
        l3.setFont(new Font("Arial",Font.BOLD,30));
        menuCentre.add(l3);
        JComboBox classe = new JComboBox();
        //relier à la base de données pour avoir les classes possibles
        menuCentre.add(classe);
        
        
        //ajout bouton démarrer
        JButton b = new JButton("Démarrer");
        //changement de taille du bouton
        b.setPreferredSize(new Dimension(250,100));
        b.setFont(new Font("Arial",Font.BOLD,30));
        //placer le bouton au sud
        mainIc.add(b,BorderLayout.SOUTH);
        //couleur de fon blanc pour le bouton
        //b.setBackground(Color.WHITE);

        ic.add(mainIc);
        
        
        //rend visible la fenetre
        this.setVisible(true);
        //termine le processus lorsque la fenetre est fermée
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
