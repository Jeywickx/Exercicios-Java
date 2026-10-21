package EstruturaSequencial;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {
		
		double n1, n2, n3, n4, media;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe sua primeira nota");
		n1 = sc.nextDouble();
		System.out.println("Informe sua segunda nota");
		n2 = sc.nextDouble();
		System.out.println("Informe sua terceira nota");
		n3 = sc.nextDouble();
		System.out.println("Informe sua quarta nota");
		n4 = sc.nextDouble();
		media = (n1+n2+n3+n4)/4;
		System.out.println("A média das suas notas foi " + media);
		sc.close();

	}

}
