package EstruturaSequencial;

import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		
		double metro, litros;
		int latas;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tamanho em metros quadrados da área a ser pintada");
		metro = sc.nextDouble();
		litros = metro/3;
		latas = (int) Math.ceil(litros/18);
		System.out.println("Latas de tinta necessárias: " + latas);
		System.out.println("Valor total: " + latas * 80 + "$");
		
		sc.close();
	}

}
