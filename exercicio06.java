package EstruturaSequencial;

import java.util.Scanner;

public class exercicio06 {

	public static void main(String[] args) {
		
		double raio, area;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o raio de um circulo");
		raio = sc.nextDouble();
		area = (3.14*(raio*raio));
		System.out.println("A area do circulo é: " + area);
		
		sc.close();

	}

}
