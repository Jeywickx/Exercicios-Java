package EstruturaSequencial;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		
		double grausFahrenheit, grausCelsius;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a temperatura em Fahrenheit");
		grausFahrenheit = sc.nextDouble();
		grausCelsius = 5 * ((grausFahrenheit-32)/9);
		System.out.println("Esta temperatura transformada em graus Celsius fica: " + grausCelsius +"°");
		
		sc.close();

	}

}
