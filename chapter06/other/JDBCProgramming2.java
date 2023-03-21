package chapter06.other;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


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
			
			StringBuilder builder = new StringBuilder();
			builder.append("SELECT ");
			builder.append(" MEM_ID,");
			builder.append(" MEM_NAME,");
			builder.append(" MEM_BIR,");
			builder.append(" MEM_ADD1,");
			builder.append(" MEM_ADD2,");
			builder.append(" MEM_JOB,");
			builder.append(" FROM ");
			builder.append(" MEMBER ");
			
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
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(resultSet!=null) {
					resultSet.close();				
				}
				
				if(statement!=null) {
					statement.close();				
				}

				if(connection!=null) {
					connection.close();				
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
