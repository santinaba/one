import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;
public class Cliente{
    public static void main(String args[]){
	InterfazOperaciones cadena_invertida;
        Scanner sc = new Scanner(System.in);
      String cadena = "";
	try {
            cadena_invertida=(InterfazOperaciones)Naming.lookup("rmi://localhost/cadena_invertida");
            System.out.print("Introduzca una cadena : ");
	    System.out.println();
            System.out.println("cadena devuelta es: " + cadena_invertida);
	    System.out.println();
	}
	catch (Exception e){
	    e.printStackTrace();
	}
    }
}