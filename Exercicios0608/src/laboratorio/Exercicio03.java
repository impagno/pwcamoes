package laboratorio;

import java.text.NumberFormat;
import java.util.Random;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] array = new double[10];
		Random random = new Random();
		double aux;
		
		for(int c = 0;c < 10;c++) {
			array[c] = (random.nextDouble() * 100);
			System.out.println(array[c]);
		}
		
		System.out.println("Ordenar crescente:");
		for(int i = 0;i < array.length; i++) {
			for(int j = 0;j < array.length - 1; j++) {
				if(array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j+1];
					array[j+1] = aux;
				}
			}
		}
		for(double d: array) {
			System.out.println(
					NumberFormat.getInstance().format(d));
		}
	}

}
