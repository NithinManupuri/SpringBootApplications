package springdatajpa.entitiy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class CustomGenerator implements IdentifierGenerator {
	String prefix = "BD";
	int suffix = 0;

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {

		try {
			JdbcConnectionAccess jdbcConnectionAccess = session.getJdbcConnectionAccess();
			Connection connection = jdbcConnectionAccess.obtainConnection();
			Statement st = connection.createStatement();
			String sql = "SELECT value FROM pk_val";

			    ResultSet rs = st.executeQuery(sql);

			    if (rs.next()) {
			        suffix = rs.getInt("value") + 1;
			        st.executeUpdate("UPDATE pk_val SET value = "+suffix);
			    } else {
			        suffix = 1;
			        st.executeUpdate("INSERT INTO pk_val(value) VALUES (" + suffix + ")");
			    }


		} catch (Exception e) {
			e.printStackTrace();

		}

		return prefix + suffix;
	}

}
