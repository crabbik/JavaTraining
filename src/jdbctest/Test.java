package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException,
			SQLException {

		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/java_training", "postgres",
				"1");
		Statement stmt = conn.createStatement();

		PreparedStatement stat = conn.prepareStatement(
				"insert into role (name) values ('user11')  ",
				Statement.RETURN_GENERATED_KEYS);
		stat.executeUpdate();
		ResultSet generatedKeys = stat.getGeneratedKeys();
		if (generatedKeys.next()) {

			System.out.println(generatedKeys.getLong(1));
		}

		printTable(stmt);
		int rowsAffected = stmt
				.executeUpdate("update role set name =concat(name,'!') where id = 2 ");
		printTable(stmt);
		int del = stmt.executeUpdate("delete from role  where id > 2 ");
		printTable(stmt);

		int ins = stmt
				.executeUpdate("insert into role (name) values ('user')  ");
		printTable(stmt);

		// conn.close();

	}

	private static void printTable(Statement stmt) throws SQLException {
		ResultSet rs = stmt.executeQuery("select * from role");
		while (rs.next()) {

			String id = rs.getString("id");
			String name = rs.getString("name");

			System.out.println(String.format("id: %s , name: %s", id, name));

		}
	}

}
