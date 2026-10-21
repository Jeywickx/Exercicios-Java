package EstruturaSequencial;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		
		Double valorHora, horasTrabalhadas, salario;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quanto você ganha por hora?");
		valorHora = sc.nextDouble();
		System.out.println("Quantas horas você trabalhou este mês?");
		horasTrabalhadas = sc.nextDouble();
		salario = (valorHora * horasTrabalhadas);
		System.out.println("Seu salario este mês foi: " + salario + "$");
		
		sc.close();

	}

}
