package laboratorio;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero:");
		int num1 = scan.nextInt();
		System.out.println("Entre com o segundo numero:");
		int num2 = scan.nextInt();

		System.out.println("Entre com a operacao:");
		String oper = scan.next();
		
		if(oper.equals("/") && num2 == 0) {
			System.out.println("Divisao por 0 nao e permitida");
			scan.close();
			System.exit(1);
		}

		int resultado = 0;

		switch (oper) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "*":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		}

		System.out.println("O resultado e: " + resultado);

		scan.close();
	}
}
