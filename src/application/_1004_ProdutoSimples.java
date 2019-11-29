package application;

import java.util.Scanner;

public class _1004_ProdutoSimples {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeroUm = sc.nextInt();
		int numeroDois = sc.nextInt();
		
		int PROD = numeroUm * numeroDois;
		
		System.out.printf("PROD = %d%n", PROD);
		
		
		sc.close();
		
	}

}
