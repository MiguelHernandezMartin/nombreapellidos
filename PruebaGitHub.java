/**
 * Realiza un programa que pida n�meros hasta que se teclee uno negativo, 
 * y mostrar cu�ntos n�meros se han introducido.
 * @author Miguel Hernandez Martin
 */

import java.util.*;

public class PruebaGitHub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		int cont = 1;
	
		System.out.println("Introduce un n�mero negativo: ");
		num = sc.nextInt();
		
		while (num >= 0) {
			
		System.out.println("Introduce un n�mero negativo: ");
		num = sc.nextInt();
			
		cont ++;
		}
		
		System.out.println("Has introducido " + cont + " n�meros");
	
	}

}
