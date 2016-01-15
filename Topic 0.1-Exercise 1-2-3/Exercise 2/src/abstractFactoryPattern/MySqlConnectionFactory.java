package abstractFactoryPattern;

public class MySqlConnectionFactory extends ConnectionFactory {

	@Override
	public ConnectionDb getConnection(String type) {
		// TODO Auto-generated method stub
		return new MySqlConnection();
	}
}
