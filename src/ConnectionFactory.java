import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

	private ComboPooledDataSource dataSource;


	public ConnectionFactory() {
		ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
		comboPooledDataSource.setJdbcUrl("jdbc:mysql://localhost/Produto?useTimezone=true&&serverTimezone=UTC");
		comboPooledDataSource.setUser("root");
		comboPooledDataSource.setPassword("katherinp");
		
		this.dataSource = comboPooledDataSource;
	
	}
	
	
	public Connection recuperarConexao() throws SQLException{
		return this.dataSource.getConnection();
		
	}
}
