import java.rmi.*;
public interface InterfazOperaciones extends Remote {
    String cadena(String arg) throws RemoteException; 
}