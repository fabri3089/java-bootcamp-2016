package proxyPattern;
public class Proxy {
	MySqlConnect mySqlConnect;
	public Proxy() {
		System.out.println("Creating proxy.. ");
	}
	public void connect(){
		if(mySqlConnect==null){
			mySqlConnect= new MySqlConnect();
		}
		mySqlConnect.connect();
	}
}
