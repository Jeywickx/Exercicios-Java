package EstruturaSequencial;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		
		double area, lado, dobro;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do lado de um quadrado");
		lado = sc.nextDouble();
		area = (lado*lado);
		dobro = (area*2);
		System.out.println("O dobro da area desse quadrado é: " + dobro);
		
		sc.close();
		

	}

}
