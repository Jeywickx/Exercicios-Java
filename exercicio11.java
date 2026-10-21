package EstruturaSequencial;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		
		int n1, n2;
		double n3, r1, r2, r3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um numero inteiro");
		n1 = sc.nextInt();
		System.out.println("Informe outro numero inteiro");
		n2 = sc.nextInt();
		System.out.println("Informe um numero real");
		n3 = sc.nextDouble();
		
		r1 = (n1*2);
		r1 = r1*(n2/2);
		r2 = (n1*3) + n3;
		r3 = Math.pow(n3, 3);
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		
		
		
		sc.close();

	}

}
