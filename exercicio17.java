package EstruturaSequencial;

import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		
		double metro, litros, galoes;
		int latas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe a quantidade de metros da área que vai ser pintada");
		metro = sc.nextDouble();
		litros = (metro/6);
		galoes = (metro/3.6);
		latas = (int) Math.ceil(litros / 18);
		galoes = (int) Math.ceil(galoes / 3.6);
		
		System.out.println(latas + " lata de tinta com valor total de: " + (latas * 80) + "$");
		System.out.printf("%.0f galoes de tinta com valor total de " + (galoes * 25), galoes);
		
		
		sc.close();
		
		
	}

}
