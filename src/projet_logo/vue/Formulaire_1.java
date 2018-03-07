/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


    
   public class Formulaire_1 extends JPanel{
    //private JFrame frame;
    private JPanel frame;   
    private JPanel mainPanel;
    private GridLayout layout;

    public Formulaire_1(){
       // frame = new JFrame("formulaire");
        frame = new JPanel();
        mainPanel = new JPanel();
        layout = new GridLayout();
        mainPanel.setLayout(new GridLayout(4,2));

        //adding the labels and text area
        JLabel l1 = new JLabel("Nom :");
        mainPanel.add(l1);    
        JTextField t1 = new JTextField(); // à ajouter dans tous les Jtext une valeur par défaut qui est la variable de l'élève
        mainPanel.add(t1);
        JLabel l2 = new JLabel("Prénom :");
        mainPanel.add(l2);    
        JTextField t2 = new JTextField();
        mainPanel.add(t2);

        JLabel l3 = new JLabel("Sexe :"); //on veut deux checkbox en meme temps donc on rajoute u
        mainPanel.add(l3);
        JPanel sexPanel = new JPanel();
        JCheckBox c1 = new JCheckBox("Garçon");
        JCheckBox c2 = new JCheckBox("Fille");
        ButtonGroup group = new ButtonGroup();
        group.add(c1);
        group.add(c2);
        sexPanel.add(c1);
        sexPanel.add(c2);
        mainPanel.add(sexPanel);
        //flow.add(c1);

        JLabel l4 = new JLabel("Age");
        mainPanel.add(l4);
        JComboBox age = new JComboBox();
        age.addItem("9 ans");
        age.addItem("10 ans");
        age.addItem("11 ans");
        age.addItem("12 ans");
        mainPanel.add(age);

        //
        frame.add(mainPanel);
        frame.setSize(400,400);
        frame.setVisible(true);
    }

    public void InterfaceClasse(){

        // frame = new JFrame("formulaire");
        frame = new JPanel();
        mainPanel = new JPanel();
        layout = new GridLayout();
        mainPanel.setLayout(new GridLayout(3,2));
        
        //
        JLabel l1 = new JLabel("Niveau de la Classe :");
        mainPanel.add(l1);    
        JComboBox niveau = new JComboBox();
        niveau.addItem("CE2");
        niveau.addItem("CM1");
        niveau.addItem("CM2");
        mainPanel.add(niveau); // à ajouter dans tous les Jtext une valeur par défaut qui est la variable de l'élève
        JLabel l2 = new JLabel("Responsable :");
        mainPanel.add(l2);    
        JTextField t2 = new JTextField();
        mainPanel.add(t2);
        JLabel l3 = new JLabel("Effectif :");
        mainPanel.add(l3);    
        JTextField t3 = new JTextField();
        mainPanel.add(t3);
        
        frame.add(mainPanel);
        frame.setSize(400,400);
        frame.setVisible(true);

    }

}
    

