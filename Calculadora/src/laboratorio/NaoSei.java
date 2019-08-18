package laboratorio;

import java.util.Random;

public class NaoSei {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		Random r = new Random();
		int somatorio = 0, maior = 0, menor = 101;
		int cont = 0;
		
		for(int i = 0;i < 10;i++) {
			numeros[i] = r.nextInt(100);
		}
		
		System.out.println("Os numeros gerados sao:");
		while(cont < 10) {
			System.out.println(numeros[cont]);
			cont++;
		}
		
		for(int n : numeros) {
			if(n > maior) {
				maior = n;
			}
			if(n < menor) {
				menor = n;
			}
			somatorio += n;
		}
		System.out.println("O somatorio e:");
		System.out.println(somatorio);
		
		System.out.println("O maior numero e: " + maior);
		System.out.println("O menor numero e: " + menor);
		
	}
}
