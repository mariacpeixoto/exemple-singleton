/* O objetivo principal deste código é garantir que apenas uma instância 
 * da classe Singleton seja criada e fornecer um ponto global de acesso 
 * a essa instância, permitindo o compartilhamento de recursos ou estado único 
 * em toda a aplicação. Além disso, ele garante que a criação da instância 
 * seja thread-safe, evitando problemas de concorrência em ambientes multithread.
*/
public class Singleton {
	
	private static volatile Singleton instance;
	private String data;
	
	private Singleton(String data) {
		this.setData(data);
	}
	
	public static Singleton getInstance(String data) {
		Singleton result = instance;
		if(result == null) {
			synchronized (Singleton.class) {
				result = instance;
				if(result == null) {
					instance = result = new Singleton(data);
				}
			}
		}
		return result;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
