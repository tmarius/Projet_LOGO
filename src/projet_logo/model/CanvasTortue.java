package projet_logo.model;

import java.awt.*;
import java.awt.geom.*;

/**
 * Classe utilitaire pour afficher des tortues dans le Canvas, et tracer des traits
 * 
 * @author Patrick Girard
 * @version février 2017
 */
public class CanvasTortue
{
    // instance variables - replace the example below with your own
    static private int n = 0;
    static private int lo = 40;
    static private int la = 30;
    static private int plo = 8;
    static private int pla = 5;
    static private int tlo = 16;
    static private int tla = 9;
    static private int qla = 3;
    static private int milieu = 240;
    static private String couleurTete = "red";
    static private String couleurCorps = "green";
    static private String couleurPattes = "blue";
    static private String corps = "Corps";
    static private String patteAG = "Patte Avant Gauche";
    static private String patteAD = "Patte Avant Droite";
    static private String patteRG = "Patte Arriere Gauche";
    static private String patteRD = "Patte Arriere Droite";
    static private String tete = "Tete";
    static private String queue = "Queue";
    
    /**
     * Constructeur private, pour empecher l'instanciation de la classe
     * Toutes les fonctions sont statiques !
     *
     */
    private CanvasTortue () { };
    
    /**
     * Efface le Canvas
     */
    public static void reset() {
        Canvas canvas = Canvas.getCanvas(); 
        canvas.clear();
    }
    
    /**
     * Dessine une tortue orientee vers le nord
     *
     * @param  x,y  position de la tortue
     */
    public static void tortueNord(int x, int y)
    {
        int xp = x*50 + milieu + 5;
        int yp = y*50 + milieu;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(patteAG, couleurPattes, new Ellipse2D.Double(xp, yp+15, 
                                     plo, pla));
        canvas.draw(patteAD, couleurPattes, new Ellipse2D.Double(xp+la+2, yp+15, 
                                     plo, pla));
        canvas.draw(patteRG, couleurPattes, new Ellipse2D.Double(xp+2, yp+35, 
                                     plo, pla));
        canvas.draw(patteRD, couleurPattes, new Ellipse2D.Double(xp+la+1, yp+35, 
                                     plo, pla));
        canvas.draw(tete, couleurTete, new Ellipse2D.Double(xp+15, yp-5, 
                                     tla, tlo));
        canvas.draw(queue, couleurPattes, new Ellipse2D.Double(xp+19, yp+lo, 
                                     qla, tlo));
        canvas.draw(corps, couleurCorps, new Ellipse2D.Double(xp+5, yp+5, 
                                     la, lo));
                                     
    }
    /**
     * Dessine une tortue orientee vers le sud
     *
     * @param  x,y  position de la tortue
     */
    public static void tortueSud(int x, int y)
    {
        int xp = x*50 + milieu + 5;
        int yp = y*50 + milieu;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(patteAG, couleurPattes, new Ellipse2D.Double(xp, yp+15, 
                                     plo, pla));
        canvas.draw(patteAD, couleurPattes, new Ellipse2D.Double(xp+la+2, yp+15, 
                                     plo, pla));
        canvas.draw(patteRG, couleurPattes, new Ellipse2D.Double(xp+2, yp+35, 
                                     plo, pla));
        canvas.draw(patteRD, couleurPattes, new Ellipse2D.Double(xp+la+1, yp+35, 
                                     plo, pla));
        canvas.draw(tete, couleurTete, new Ellipse2D.Double(xp+15, yp+lo, 
                                     tla, tlo));
        canvas.draw(queue, couleurPattes, new Ellipse2D.Double(xp+19, yp-6, 
                                     qla, tlo));
        canvas.draw(corps, couleurCorps, new Ellipse2D.Double(xp+5, yp+5, 
                                     la, lo));
                                     
    }
    
    /**
     * Dessine une tortue orientee vers l'est
     *
     * @param  x,y  position de la tortue
     */
    public static void tortueEst(int x, int y)
    {
        int xp = x*50 + milieu;
        int yp = y*50 + milieu + 5;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(patteAG, couleurPattes, new Ellipse2D.Double(xp+10, yp+3, 
                                     pla, plo));
        canvas.draw(patteAD, couleurPattes, new Ellipse2D.Double(xp+10, yp+la, 
                                     pla, plo));
        canvas.draw(patteRG, couleurPattes, new Ellipse2D.Double(xp+30, yp+1, 
                                     pla, plo));
        canvas.draw(patteRD, couleurPattes, new Ellipse2D.Double(xp+30, yp+la+2, 
                                     pla, plo));
        canvas.draw(tete, couleurTete, new Ellipse2D.Double(xp+lo, yp+15, 
                                     tlo, tla));
        canvas.draw(queue, couleurPattes, new Ellipse2D.Double(xp-6, yp+19, 
                                     tlo, qla));
        canvas.draw(corps, couleurCorps, new Ellipse2D.Double(xp+5, yp+5, 
                                     lo, la));
                                     
    }
    
    /**
     * Dessine une tortue orientee vers l'ouest
     *
     * @param  x,y  position de la tortue
     */
    public static void tortueOuest(int x, int y)
    {
        int xp = x*50 + milieu;
        int yp = y*50 + milieu + 5;
        Canvas canvas = Canvas.getCanvas(); 
        canvas.draw(patteAG, couleurPattes, new Ellipse2D.Double(xp+10, yp+3, 
                                     pla, plo));
        canvas.draw(patteAD, couleurPattes, new Ellipse2D.Double(xp+10, yp+la, 
                                     pla, plo));
        canvas.draw(patteRG, couleurPattes, new Ellipse2D.Double(xp+30, yp+1, 
                                     pla, plo));
        canvas.draw(patteRD, couleurPattes, new Ellipse2D.Double(xp+30, yp+la+2, 
                                     pla, plo));
        canvas.draw(tete, couleurTete, new Ellipse2D.Double(xp-5, yp+15, 
                                     tlo, tla));
        canvas.draw(queue, couleurPattes, new Ellipse2D.Double(xp+lo, yp+19, 
                                     tlo, qla));
        canvas.draw(corps, couleurCorps, new Ellipse2D.Double(xp+5, yp+5, 
                                     lo, la));
                                     
    }

    /**
     * Trace un trait noir vers le sud
     *
     * @param  x1,y1   position du point de depart, en cases
     */
    public static void ecrisVertical(int x1, int y1, String color)
    {
        String trait = new String("Trait" + n++);
        Canvas canvas = Canvas.getCanvas(); 
        int xPosition = x1*50 + milieu + 23;
        int yPosition = y1*50 + milieu + 23;
        int la = 5;
        int lo = 55;
        canvas.draw(trait, color,
                        new Rectangle(xPosition, yPosition, la, lo));
    }

    /**
     * Trace un trait noir vers l'est
     *
     * @param  x1,y1   position du point de depart, en cases
     */
    public static void ecrisHorizontal(int x1, int y1, String color)
    {
        String trait = new String("Trait" + n++);
        Canvas canvas = Canvas.getCanvas(); 
        int xPosition = x1*50 + milieu + 23;
        int yPosition = y1*50 + milieu + 23;
        int la = 5;
        int lo = 55;
        canvas.draw(trait, color,
                        new Rectangle(xPosition, yPosition, lo, la));
    }
}
