package abstractFactoryPattern;

public class AbstractFactory {
	public ConnectionFactory getConnectionFactory(String type) {
		if ("MySql".equals(type)) {
			return new MySqlConnectionFactory();
		} else if("PostgreSql".equals(type)) {
			return new PostgreSqlConnectionFactory();
		}
		return null;
}
}
