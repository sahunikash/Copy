package Web;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcUrils {
	private static Statement st = 	null;
public static Statement getConnection() throws ClassNotFoundException, SQLException {
	if(st==null) {
		st=getStatement();
	}
	return st;

}
public static Statement getStatement() throws ClassNotFoundException, SQLException {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "nikash", "nikash");
	return con.createStatement();
}
}
