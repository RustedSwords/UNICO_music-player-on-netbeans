
import javazoom.jl.decoder.JavaLayerException;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rushi
 */
public class Welcome {

     public static void main(String args[]) throws JavaLayerException {
        WelcomePage Splash = new WelcomePage();
        
        Splash.setVisible(true);
        
        Sign_Up Start = new Sign_Up();
        try {
            for (int i = 0; i <= 100; i++) 
            {
                Thread.sleep(30);
                Splash.jProgressBar1.setValue(i);
                if (i==100) {
                    Splash.setVisible(false);
                    Start.setVisible(true);
                    
        
        
  
                
                }
            }
        } catch (Exception e) {
            
        }
       
        
     }
}
