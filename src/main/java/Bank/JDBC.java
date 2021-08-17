package Bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBC {
	public static void main(String[] args) {
		String DB_URL = "jdbc:mysql://localhost/accounts";
		String DB_USER  = "root";
		String DB_PASSWORD = "Nuvelabs123$";

		try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
				Statement statement = connection.createStatement();) {
			create(statement); //create
//			retrieve(statement);
//			update(statement);
//			delete(statement);
//			List<String> regions = retrieveWithCondition(statement, "A");
//			logger.debug(regions.toString());
//			sort(statement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	private static void create(Statement statement) throws SQLException {
		statement.execute("INSERT INTO ACCOUNT VALUES('Deep','Vasai West','1999-08-17','active','current')");
		statement.execute("INSERT INTO account values('Rajani','Vasai East','1999-08-09','inactive','saving')");
	}
	private static void retrieve(Statement statement) throws SQLException {
		ResultSet resultSet = statement.executeQuery("SELECT * FROM account");

		while (resultSet.next()) {
		System.out.println(resultSet.getInt(1) + " | "+ resultSet.getNString("name") + " | " + resultSet.getNString("address") + " | " + resultSet.getDate("dateCreated")+ resultSet.getNString("status") + " | " + resultSet.getNString("accountType") );
		}
		System.out.println("");
	}
	
	private static void update(Statement statement) throws SQLException {
		statement.execute("UPDATE account SET ownerName='Deep' WHERE idaccount=8");
	}
	
	private static void delete(Statement statement) throws SQLException {
		statement.execute("DELETE FROM account WHERE idaccount=4");
	}
}
