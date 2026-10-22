package EstruturaCondicional;

import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		
		double a, b, c, delta, x1, x2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de A");
		a = sc.nextDouble();
		if (a == 0) {
			System.out.println("O valor informado é igual a zero entao a equação não é do segundo grau por isso o programa sera encerrado");
		} else {
			System.out.println("Informe o valor de B");
			b = sc.nextDouble();
			System.out.println("Informe o valor de C");
			c = sc.nextDouble();
			delta = (b*b)-(4*a*c);
			if (delta < 0) {
				System.out.println("A equação não possui raizes reais e o programa sera encerrado");
			} else if (delta == 0) {
				x1 = (- b + Math.sqrt(delta)) /(2*a);
				System.out.println("A equação possui apenas uma raiz real: " + x1);
			} else {
				x1 = (- b + Math.sqrt(delta)) /(2*a);
				x2 = (- b - Math.sqrt(delta)) /(2*a);
				System.out.println("A equação possui duas raizez reais: " + x1 + " e " + x2);
			}
		
		}
		
		sc.close();
	}

}
