package abstractFactoryPattern;

public abstract class ConnectionFactory {
	public abstract ConnectionDb getConnection(String type);
}
