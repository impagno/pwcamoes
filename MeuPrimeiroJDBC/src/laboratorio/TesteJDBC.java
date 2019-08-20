package laboratorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TesteJDBC {

	public static void main(String[] args) 
			throws SQLException {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Connection con = DriverManager
			.getConnection("jdbc:derby:d:\\temp\\AulaDB;create=true");
		
		System.out.println("Conectado.");
		
		System.out.println("Entre com o nome:");
		String nome = scan.next();
		System.out.println("Entre com o contato:");
		String contato = scan.next();
		
		PreparedStatement pst = 
				con.prepareStatement(
		"insert into pessoa(nome,contato) values(?,?)");
		pst.setString(1, nome);
		pst.setString(2, contato);
		pst.executeUpdate();
		pst.close();
		
		Statement stmt = con.createStatement();
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
		
		scan.close();
		rs.close();
		stmt.close();
		con.close();
	}

}
