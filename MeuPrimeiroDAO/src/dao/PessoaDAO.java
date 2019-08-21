package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Pessoa;

public class PessoaDAO {
	private String connectionString = "jdbc:derby:d:\\temp\\AulaDB";

	public List<Pessoa> list() throws PessoaException {
		List<Pessoa> pessoas = new ArrayList<>();

		try {
			Connection con = DriverManager.getConnection(connectionString);
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery(
					"select id,nome,contato from pessoa");
			while(rs.next()) {
				pessoas.add(new Pessoa(rs.getInt(1), 
									   rs.getString("nome"),
									   rs.getString("contato")));
			}
			
			rs.close();
			stmt.close();
			con.close();

		} catch (SQLException e) {
			throw new PessoaException(e.getMessage());
		}
		
		return pessoas;
	}
	
	public void insert(Pessoa pessoa) throws PessoaException {
		try {
			Connection con = DriverManager.getConnection(connectionString);
			
			PreparedStatement stmt = con
				.prepareStatement("insert into pessoa(nome,contato) values (?,?)");
			
			stmt.setString(1, pessoa.getNome());
			stmt.setString(2, pessoa.getContato());

			stmt.executeUpdate();
			
			stmt.close();
			con.close();

		} catch (SQLException e) {
			throw new PessoaException(e.getMessage());
		}		
	}
}
