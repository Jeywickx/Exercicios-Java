package EstruturaSequencial;

import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		
		int n1, n2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número inteiro");
		n1 = sc.nextInt();
		System.out.println("Informe outro número inteiro");
		n2 = sc.nextInt();
		n1 = (n1 + n2);
		System.out.println("A soma dos dois números informados foi " + n1);
		
		sc.close();
	}

}
