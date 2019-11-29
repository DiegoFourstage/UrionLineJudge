package application;

import java.util.Locale;
import java.util.Scanner;

public class _1009_SalarioComBonus {
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.nextLine();
		double salarioFixo = sc.nextDouble();
		double totalVendas = sc.nextDouble();
		double porcentagem = 15.00 / 100.00;
		
		double total = salarioFixo + (totalVendas * porcentagem );
		
		System.out.printf("TOTAL = R$ %.2f%n", total);
		
		sc.close();
	}

}
