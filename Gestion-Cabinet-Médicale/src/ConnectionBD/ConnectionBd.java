package ConnectionBD;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionBd {
	public static Connection GetConnecttion() {
		Connection connection;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestion_cm", "root", "");
			System.out.println("Connected Succefully!");
			return connection;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

}
