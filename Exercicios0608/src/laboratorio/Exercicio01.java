package laboratorio;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double nota1, nota2, nota3, media = 0.0;
		
		System.out.println("Entre com a primeira nota:");
		nota1 = scan.nextDouble();
		System.out.println("Entre com a segunda nota:");
		nota2 = scan.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		if(media >= 70) {
			System.out.println("Aluno aprovado com media "
					+ NumberFormat.getInstance().format(media));
		} else if (media < 40) {
			System.out.println("Aluno reprovado com media "
					+ NumberFormat.getInstance().format(media));			
		} else {
			System.out.println("Entre com a nota do exame final:");
			nota3 = scan.nextDouble();
			
			if(nota3 >= 60) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado");
			}
		}
		
		scan.close();
	}

}
