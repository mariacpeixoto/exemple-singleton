/* Esse c�digo implementa o padr�o Singleton em Java, 
 * garantindo que apenas uma inst�ncia da classe `Singleton` seja criada e 
 * fornecendo um ponto global de acesso a essa inst�ncia. 
 * O m�todo `getInstance` retorna a inst�ncia existente se j� houver uma, 
 * caso contr�rio, cria uma nova inst�ncia com o valor fornecido. 
 * O construtor privado inclui uma pausa de 1 segundo, 
 * para simular um cen�rio de cria��o demorada da inst�ncia.*/
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
