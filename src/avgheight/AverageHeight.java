package avgheight;

import java.util.Scanner;

public class AverageHeight {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Número de pessoas: ");
		int n = scan.nextInt();
		
		double[] vect = new double[n];
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print((i+1) + "º Pessoa: ");
			vect[i] = scan.nextDouble();
		}
		
		double sum = 0.0;
		
		for(int i = 0; i < vect.length; i++) {
			sum += vect[i];
		}
		
		double averageHeight = sum / vect.length;
		
		System.out.println("Média das alturas: " + String.format("%.2f", averageHeight));
		
		scan.close();
		
	}
}
