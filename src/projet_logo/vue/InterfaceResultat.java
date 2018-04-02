/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet_logo.vue;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author morgane
 */

public class InterfaceResultat {
    
    MainWindow frame;
    JPanel mainPanel;
    
    public InterfaceResultat(MainWindow f){
        frame = f;
        mainPanel = new JPanel();
    }

    public JPanel getInterfaceResultat() {
        return mainPanel;
    }
    
    
    
}
