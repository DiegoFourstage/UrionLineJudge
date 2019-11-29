package application;

import java.util.Locale;
import java.util.Scanner;

public class _1002_AreaDoCirculo {
	
	public static final double PI = 3.14159;
	
	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		double area = areaCirculo(raio);
		
		System.out.printf("A = %.4f", area);
		
		
		sc.close();
	}
	
	public static double areaCirculo (double raio) {
		return raio * raio * PI;
	}

}
