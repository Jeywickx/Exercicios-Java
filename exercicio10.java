package EstruturaSequencial;

import java.util.Scanner;

public class exercicio10 {

	public static void main(String[] args) {
		
		double grausFahrenheit;
		int grausCelsius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a temperatura em graus Celsius");
		grausCelsius = sc.nextInt();
		grausFahrenheit = (double) grausCelsius * 9/5 + 32;
		System.out.printf("Esta temperatura transformada para Fahrenheit fica: " + grausFahrenheit);
		
		sc.close();

	}

}
