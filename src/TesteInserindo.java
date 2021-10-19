import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteInserindo {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory factory = new ConnectionFactory ();
		Connection connection = factory.recuperarConexao();
		
	Statement stm = connection.createStatement();
	stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES ('Notebool DELL', '(DELL Latitude 7480 i5-6300U 8gb/256gb')",
			Statement.RETURN_GENERATED_KEYS);
	
	ResultSet rst = stm.getGeneratedKeys();
	
	while (rst.next()) { 
		Integer id = rst.getInt(1);
		System.out.println("Id n�: " + id+ "criado");
	}
	
	}

}
