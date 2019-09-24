import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class Servidor 
    extends UnicastRemoteObject
    implements InterfazOperaciones	 
{
    Servidor() throws java.rmi.RemoteException{
	super();
    }
    public String cadena(String a) {
           
	   StringBuilder builder = new StringBuilder(a);
           String cadena_invertida = builder.reverse().toString();
           return cadena_invertida;
	}
    public static void main(String args[]) { 
	try {
	    Servidor cadena_invertida;
	    LocateRegistry.createRegistry(1099);
	    cadena_invertida=new Servidor(); 
	    Naming.bind("CadenaIinvertida", cadena_invertida); 
            System.out.println("El servidor esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    }   
}