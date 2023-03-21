package chapter20;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.format.DateTimeFormatter;

public class JDBCProgramming2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Statement statement=null;
		Connection connection=null;
		ResultSet resultSet=null;
		
	    try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "PARK98";
			String password = "java";
			
			connection = DriverManager.getConnection(url, user, password);
			statement = connection.createStatement();
			
			
			// 문자열 결합보다 Stringbuilder나 StringBuffer를 사용하는 게 좋다.
			
			StringBuilder builder = new StringBuilder();
			builder.append("SELECT");
			builder.append("    mem_id,");
			builder.append("    mem_name,");
			builder.append("    mem_bir,");
			builder.append("    mem_add1,");
			builder.append("    mem_add2,");
			builder.append("    mem_job ");
			builder.append("FROM");
			builder.append("    member");
			
			String sql = builder.toString();	
			resultSet = statement.executeQuery(sql);
			while(resultSet.next()) {
				String memId = resultSet.getString("mem_id");
				String memName = resultSet.getString("mem_name");
				Date memBir = resultSet.getDate("mem_bir");
				String memAdd1 = resultSet.getString("mem_add1");
				String memAdd2 = resultSet.getString("mem_add2");
				String memJob = resultSet.getString("mem_job");
				System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\n"
						,memId
						,memName
						,memBir.toLocalDate().toString()
						,memAdd1
						,memAdd2
						,memJob);
			} // 
	    } catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try { 
				if(resultSet != null) {
					resultSet.close();					
				}
				if(statement != null) {
					statement.close();
				}
				if(connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}