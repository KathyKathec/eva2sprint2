import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import modelo.Produto;

public class InsereOferta {
	
	public static void main (String[] args) throws SQLException{
	
		Produto oferta = new Produto ("20%", "23/10/2021", "23/11/2021");
		
		try(Connection connection = new ConnectionFactory().recuperarConexao()){
			
			String sql = "INSERT INTO PRODUTO (DESCONTO, DATA_INI, DATA_FIM) VALUES (?,?)";
			
		pstm.setString(4,oferta.getDesconto());
		pstm.setString(5,oferta.getData_ini() );
		pstm.setString(6,oferta.getData_fim() );
		
		pstm.execute();
		}
					
		}
	
	
	
	
	
}
}

	
