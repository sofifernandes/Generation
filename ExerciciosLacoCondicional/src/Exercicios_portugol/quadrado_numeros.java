package Exercicios_portugol;

import java.util.*;

public class quadrado_numeros {
	public static void main (String args[]) 
	{		
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		double n1, n2, n3, n4, res1, res2, res3, res4;
		System.out.println("Por favor, digite o primeiro n�mero: ");
		n1 = ler.nextInt();
		System.out.println("Por favor, digite o segundo n�mero: ");
		n2 = ler.nextInt();
		System.out.println("Por favor, digite o terceiro n�mero: ");
		n3 = ler.nextInt();
		System.out.println("Por favor, digite o quarto n�mero: ");
		n4 = ler.nextInt();
		res1 = Math.pow(n1, 2);
		res2 = Math.pow(n2, 2);
		res3 = Math.pow(n3, 2);
		res4 = Math.pow(n4, 2);
		if (res3 >= 1000) {
			System.out.printf("O quadrado do n�mero 3 � igual a: "+ res3);
		}else {
			System.out.printf("Os quadrados dos n�meros digitados s�o: " + "\nN�mero 1: " + n1 + " \nSeu valor ao quadrado: "+ res1 +"\nN�mero 2: "+n2+ " \nSeu valor ao quadrado: "+res2+"\nN�mero 3: "+n3+ " \nSeu valor ao quadrado: "+res3+"\nN�mero 4: "+n4+ " \nSeu valor ao quadrado: "+res4);
		}
				
	}
		
}
