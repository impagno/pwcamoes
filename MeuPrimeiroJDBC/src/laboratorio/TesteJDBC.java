package laboratorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteJDBC {

	public static void main(String[] args) 
			throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager
			.getConnection("jdbc:derby:d:\\temp\\AulaDB;create=true");
		
		System.out.println("Conectado.");
		
		Statement stmt = con.createStatement();
//		stmt.executeUpdate("create table pessoa("
//				+ "id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY,"
//				+ "nome varchar(50),"
//				+ "contato varchar(200))");
//		stmt.executeUpdate("insert into pessoa(nome,contato)" 
//				+ "values('Joao', 'joao@aqui')");

		ResultSet rs = stmt
				.executeQuery("select id,nome,contato from pessoa");
		while(rs.next()) {
			System.out.println("["
					+ rs.getInt(1)
					+ "] "
					+ rs.getString("nome")
					+ " - "
					+ rs.getString(3));
		}
		
		rs.close();
		stmt.close();
		con.close();
	}

}
