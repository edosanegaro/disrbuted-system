
import java.io.File;
import java.rmi.*;
import java.rmi.server.*;
import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javax.swing.JOptionPane;
public class MusicMixRemote extends
        UnicastRemoteObject implements MusicMixInterface {

    MusicMixRemote() throws RemoteException {
        super();
    }

    @Override
    public void playAudio(String audioName) {
       try {
            JFXPanel j=new JFXPanel();
            String urip=new File("Far Yohaannis Taaddasaa.mp3").toURI().toString();
            new MediaPlayer(new Media(urip)).play();    
        } catch(Exception ex){
                JOptionPane.showMessageDialog(null,ex);
        }
        
        
    }
   
}
