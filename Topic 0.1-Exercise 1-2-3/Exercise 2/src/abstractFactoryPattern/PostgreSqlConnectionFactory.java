package abstractFactoryPattern;

public class PostgreSqlConnectionFactory extends ConnectionFactory {

	@Override
	public ConnectionDb getConnection(String type) {
		// TODO Auto-generated method stub
		return new PostgreSqlConnection();
	}
}
