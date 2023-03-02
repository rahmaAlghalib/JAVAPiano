
package javamusic;

import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Piano {
    
    private String path;
    
    //CONSTRUCTURE----- 
    Piano(String path){
        this.path = path;
    }
    //-----------------
    
    // METHOD: PLAY THE NOTE----------------------------------------------------
    public void play(){        
        try{                        
              AudioInputStream audio = AudioSystem.getAudioInputStream(new File(path));
              Clip player = AudioSystem.getClip();
              player.open(audio);
              player.start();
        } catch(Exception e){
            System.out.println("There is an ERROR:" + e);           
        } 
    }
    //--------------------------------------------------------------------------

    
}
