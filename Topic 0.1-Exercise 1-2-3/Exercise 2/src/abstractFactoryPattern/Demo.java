package abstractFactoryPattern;
public class Demo {

  public static void main(String[] args) {

	    AbstractFactory abstractFactory = new AbstractFactory();

	    ConnectionFactory connectionFactory1=abstractFactory.getConnectionFactory("MySql");
		ConnectionDb con1= connectionFactory1.getConnection("MySql");
		System.out.println(con1.connection());
	
		ConnectionFactory connectionFactory2=abstractFactory.getConnectionFactory("PostgreSql");
		ConnectionDb con2= connectionFactory2.getConnection("PostgreSql");
		System.out.println(con2.connection());
}
  }