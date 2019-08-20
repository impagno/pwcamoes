package application;

import dao.PessoaDAO;
import dao.PessoaException;
import model.Pessoa;

public class Principal {

	public static void main(String[] args) 
		throws PessoaException {
		// TODO Auto-generated method stub
		PessoaDAO dao = new PessoaDAO();
		
		System.out.println("Conteudo do BD:");
		for(Pessoa p:dao.list()) {
			System.out.println(p);
		}
	}
}
