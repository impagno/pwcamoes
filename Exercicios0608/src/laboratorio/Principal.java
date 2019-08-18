package laboratorio;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ano;
		boolean teste;
		
		System.out.println("Entre com o ano:");
		ano = scan.nextInt();
		
		teste = Exercicio06.ehBissexto(ano);
		
		if(teste) {
			System.out.println("O ano "
					+ ano
					+ " eh bissexto.");
		} else {
			System.out.println("O ano "
					+ ano
					+ " nao eh bissexto.");			
		}
		
		scan.close();
	}
}
