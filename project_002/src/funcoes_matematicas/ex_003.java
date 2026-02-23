package funcoes_matematicas;

import java.util.Locale;
import java.util.Scanner;

public class ex_003 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, horasTrabalho;
		double valorPorHora, result;
		
		System.out.println("digite o numero do funcionario: ");
		numeroFuncionario = sc.nextInt();
		System.out.println("digite a quantidade de horas de trabalho: ");
		horasTrabalho = sc.nextInt();
		System.out.println("qual o valor por hora? ");
		valorPorHora = sc.nextDouble();
		
		result = horasTrabalho * valorPorHora;
		
		System.out.printf("NUMERO = %d %n" + "SALARIO = %.2f ",numeroFuncionario, result);
		
		
		
		
		sc.close();
	}
}
