package in.spring.entity;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class Generator implements IdentifierGenerator  {
	

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		 
		String prefix="OD";
		int suffix=1;
		try {
		JdbcConnectionAccess jdbc= session.getJdbcConnectionAccess();
		Connection con=jdbc.obtainConnection();
		try(Statement st=con.createStatement()){
			ResultSet rs=st.executeQuery("select id from User");
			
			if(rs.next()) {
				suffix=rs.getInt("id")+1;
				st.executeUpdate("update User set id="+suffix);
			}else {
				st.executeUpdate("insert into User(id) values(" +suffix+ ")");
			}
				
			}
			
			
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			return  prefix+suffix;
		}
		
		
		
		

	}
			
	
	
	

}
