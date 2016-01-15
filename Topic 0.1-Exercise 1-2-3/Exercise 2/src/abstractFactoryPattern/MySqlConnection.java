package abstractFactoryPattern;

public class MySqlConnection extends ConnectionDb{

	@Override
	public String connection() {
	   return "Connecting to MySql...";
	}
}
