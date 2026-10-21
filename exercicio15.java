package EstruturaSequencial;

import java.util.Scanner;

public class exercicio15 {

	public static void main(String[] args) {
		
		double valorHora, horasTrabalhadas, salarioBruto, salarioLiquido, impostoRenda, inss, sindicato;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe quanto você ganha por hora");
		valorHora = sc.nextDouble();
		System.out.println("Informe quantas horas você trabalhou este mês");
		horasTrabalhadas = sc.nextDouble();
		salarioBruto = (valorHora * horasTrabalhadas);
		impostoRenda = (salarioBruto*0.11);
		inss = (salarioBruto * 0.08);
		sindicato = (salarioBruto * 0.05);
		System.out.println("Salário bruto:" + salarioBruto + "$" );
		System.out.println("Imposto de renda: " + impostoRenda + "$");
		System.out.println("Desconto INSS: " + inss + "$");
		System.out.println("Desconto sindicato: " + sindicato + "$");
		salarioLiquido = salarioBruto - (impostoRenda + inss + sindicato);
		System.out.println("Sálario liquido: " + salarioLiquido + "$");
		
		sc.close();

	}

}
