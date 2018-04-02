/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import projet_logo.controler.Controler_IntPrincProf;

/**
 *
 * @author Grp8
 * Classe permettant la création d'une interface destinée au professeur, afin qu'il puisse créer ou modifier un exercice.
 * Deux arbres sont placés dans l'interface : un permettant de rechercher un exercice en fonction de la difficulté, l'autre en fonction de la classe.
 */
public class InterfacePrincProf {
    
    private JPanel panelGauche, mainPanel;
    private TreeExo arbre, arbre2; //Les 2 arbres (un recherchant en fonction de la difficulté, l'autre en fonction de la classe.
    private JButton creer, modif; //Boutons créer exercice et modifier exercice.
    private MainWindow frame;
    private Controler_IntPrincProf c1,c2;
            
        public InterfacePrincProf(MainWindow f){
        
            frame = f;
        panelGauche = new JPanel(new GridLayout(4,0));
        mainPanel = new JPanel(new BorderLayout());
        
        //création des arbres
        arbre = new TreeExo();
        arbre2 = new TreeExo();
        
        //création des boutons
        creer = new JButton("Créer Exercice");
        modif = new JButton("Modifier Exercice");
        
        //parmètres de base pour le design
        Color couleurBlanche = new Color(255, 255, 255);
        Color couleurFondBoutons = new Color(140, 140, 140);
        Font font = new Font(Font.SERIF, Font.BOLD, 20);
        Color SourisPasse = new Color(0, 0, 0);
        
        //Design des boutons
        creer.setBackground(couleurFondBoutons);
        creer.setForeground(couleurBlanche);
        creer.setFont(font);
        modif.setBackground(couleurFondBoutons);
        modif.setForeground(couleurBlanche);
        modif.setFont(font);
        
        //MouseListeners des boutons
        creer.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Color SourisPasse = new Color(0, 0, 0);
                creer.setBackground(SourisPasse);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                creer.setBackground(couleurFondBoutons);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });
        
        modif.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                Color SourisPasse = new Color(0, 0, 0);
                modif.setBackground(SourisPasse);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                modif.setBackground(couleurFondBoutons);

            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            }

        });
        
        //création des listeners
        c1 = new Controler_IntPrincProf(frame, "creer");
        c2 = new Controler_IntPrincProf(frame,"modifier");
        creer.addActionListener(c1);
        modif.addActionListener(c2);
        
        panelGauche.add(creer);
        panelGauche.add(modif);
        panelGauche.add(arbre);
        panelGauche.add(arbre2);
        mainPanel.add(panelGauche, BorderLayout.WEST);
        
    }
        
        public JPanel getInterfacePrincProf(){
        return mainPanel;
    }
}
