package laboratorio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Arquivos {
	public static void main(String[] args) throws IOException {
		int value, contador = 0;
		char caracter;

		File file = 
			new File("d:\\temp\\fernandopessoa.txt");
		FileInputStream in = 
			new FileInputStream(file);
		FileOutputStream out =
			new FileOutputStream("arquivo_semespaco.txt");
		
		byte[] conteudo = new byte[(int)file.length()];

		System.out.println("Eros e Psique.\n");
//		do {
			value = in.read(conteudo);
			System.out.println(new String(conteudo));
//			System.out.print((char) value);
//			
//			caracter = (char)value;
//			if(Character.toLowerCase(caracter) == 'a') {
//				contador++;
//			}
//			
//		} while (value != -1);
			
		for(byte c: conteudo) {
			caracter = (char)c;
			if(Character.toLowerCase(caracter) == 'a') {
				contador++;
			}
			
			if(caracter == ' ') {
				continue;
			} else {
				out.write(c);
			}
		}

		System.out.printf(
			"\n\nO arquivo tem %d caracteres 'a' ou 'A'."
			, contador);
		
		in.close();
		out.close();
	}
}
