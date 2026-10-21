package EstruturaSequencial;

import java.util.Scanner;

public class exercicio05 {

	public static void main(String[] args) {
		
		double metros, centimetros;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quantos metros deseja converter para centimetros");
		metros = sc.nextDouble();
		centimetros = (metros*100);
		System.out.println("A conversao ficou " + centimetros +"cm");
		
		sc.close();

	}

}
