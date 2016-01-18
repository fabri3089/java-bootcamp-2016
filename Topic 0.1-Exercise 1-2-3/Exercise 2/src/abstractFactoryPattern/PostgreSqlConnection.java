package abstractFactoryPattern;

public class PostgreSqlConnection extends ConnectionDb {

	@Override
	public String connection() {
		// TODO Auto-generated method stub
		return "Connecting to PostgreSql...";
	}
}
