package Exercicios_Portugol;

import java.util.Scanner;

public class aluno {
	public static void main (String args[]) 
	{
		@SuppressWarnings("resource")
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, nota3, mp;
		String nome;
		System.out.println("Por gentileza, digite o nome do aluno: ");
		nome = ler.nextLine();
		System.out.println("Digite a primeira nota do "+nome+": ");
		nota1 = ler.nextInt();
		System.out.println("Agora, digite a segunda nota: ");
		nota2 = ler.nextInt();
		System.out.println("Por fim, digite a terceira nota: ");
		nota3 = ler.nextInt();
		mp = (nota1*2+nota2*3+nota3*5)/10;
		System.out.println("Ap�s a execu��o dos c�culos de m�dia, a nota final do aluno "+nome+" � igual a: "+ mp);
	}
	
}

