
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rushi
 */
public class Play {
 
    FileInputStream FIS;
    BufferedInputStream BIS;
    
    public Player player;
    public void Stop() {
        if (player != null)
        {
            player.close();
        }
    }
    public void Play(String path) throws JavaLayerException {
        try {
            FIS = new FileInputStream(path);
            BIS = new  BufferedInputStream(FIS);
            
            player = new Player(BIS);
        } catch (FileNotFoundException | JavaLayerException ex) {
           
        }
      new Thread()
      {
        @Override
        public void run()
        {
            try {
                player.play();
            } catch (JavaLayerException ex) {
                
            }
        }
      }.start();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }}

   
