
import java.rmi.*;

public class Server{
    public static void main(String args[]){
    try{
        MusicMixInterface stub=new MusicMixRemote();
        Naming.rebind("rmi://localhost:53041/MUSIC",stub);

        } catch(Exception e){System.out.println(e);}
     }
}
