package EstruturaSequencial;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double gigabytes, megabytes, kilobytes;
		System.out.println("Informe o tamanho do arquivo em Gigabytes");
		gigabytes = sc.nextDouble();
		megabytes = (gigabytes * 1024);
		kilobytes = (gigabytes * 1024 * 1024);
		
		System.out.println("O tamanho do arquivo em Megabytes: " + megabytes + " mb");
		System.out.println("O tamano do arquivo em kilobytes: " + kilobytes + " kb");
		
		sc.close();

	}

}
