package application;

import java.util.Locale;
import java.util.Scanner;

public class _1010_CalculoSimples {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codPeca1, numeroPeca1; double valorPeca1;
		int codPeca2, numeroPeca2; double valorPeca2;
		
		codPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorPeca1 = sc.nextDouble();
		
		double multiPeca1 = numeroPeca1*valorPeca1;
		
		codPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorPeca2 = sc.nextDouble();
		
		double multiPeca2 = numeroPeca2*valorPeca2;
		
		double total = multiPeca2 + multiPeca1;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", total);		
		
		sc.close();
	}

}
