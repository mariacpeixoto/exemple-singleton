/* Esse código implementa o padrão Singleton em Java, 
 * garantindo que apenas uma instância da classe `Singleton` seja criada e 
 * fornecendo um ponto global de acesso a essa instância. 
 * O método `getInstance` retorna a instância existente se já houver uma, 
 * caso contrário, cria uma nova instância com o valor fornecido. 
 * O construtor privado inclui uma pausa de 1 segundo, 
 * para simular um cenário de criação demorada da instância.*/
public final class Singleton {
	private static Singleton instance;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
