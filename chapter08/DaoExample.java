package chapter08;

public class DaoExample {
	
	
	public static void dbWork(DataAccessObject dao) {
		dao.insert();
		dao.delete();
		dao.select();
		dao.update();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
