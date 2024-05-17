/* O objetivo principal deste c�digo � garantir que apenas uma inst�ncia 
 * da classe Singleton seja criada e fornecer um ponto global de acesso 
 * a essa inst�ncia, permitindo o compartilhamento de recursos ou estado �nico 
 * em toda a aplica��o. Al�m disso, ele garante que a cria��o da inst�ncia 
 * seja thread-safe, evitando problemas de concorr�ncia em ambientes multithread.
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
