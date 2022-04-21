import java.rmi.Remote;
import java.rmi.RemoteException;
public interface MusicMixInterface extends Remote{
public void playAudio(String audioName)throws RemoteException;
}

