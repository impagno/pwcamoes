package laboratorio;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String nome = "Francisco";
		String mais = "Francisco";
		String outro = new String("Francisco");

		if (nome.equals(outro)) {
			System.out.println("Deu igual com equals");
		} else {
			System.out.println("Deu diferente :o");
		}

		if (nome == outro) {
			System.out.println("Deu igual com ==");
		} else {
			System.out.println("Deu diferente :o");
		}

		if (nome == mais) {
			System.out.println("Deu igual com ==");
		} else {
			System.out.println("Deu diferente :o");
		}
	}

}
