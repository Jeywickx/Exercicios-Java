package EstruturaSequencial;

import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double arquivo, velocidade, tempo;
		
		System.out.println("Informe o tamanho do arquivo para donwload em mb");
		arquivo = sc.nextDouble();
		System.out.println("Informe a velocidade do link de internet em mbps");
		velocidade = sc.nextDouble();
		arquivo = (arquivo*8);
		tempo = arquivo/velocidade;
		tempo = (tempo/60);
		System.out.println("Tempo estimado para donwload " + tempo + " minutos");
		
		sc.close();
		
		
	}

}
