package EstruturaSequencial;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		
		double pesoPeixe, excessoPeso, multa;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o peso do peixe");
		pesoPeixe = sc.nextDouble();
		
		if  (pesoPeixe > 50 ) {
			excessoPeso = (pesoPeixe-50);
			multa =  (pesoPeixe - 50) * 4.0;
			System.out.println("Peso em excesso: " + excessoPeso + "kg");
			System.out.println("Valor multa: " + multa + "$");
		} else {
			System.out.println("peso: " + pesoPeixe + "kg");
		}
		
		
		
		
		sc.close();

	}

}
