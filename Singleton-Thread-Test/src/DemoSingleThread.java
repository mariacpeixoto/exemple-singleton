/* O objetivo deste código é demonstrar o comportamento do padrão Singleton, 
 * mostrando que apenas uma instância da classe é criada, mesmo que o método 
 * getInstance seja chamado várias vezes. Isso é verificado comparando as 
 * referências das instâncias, garantindo que apenas uma única instância seja 
 * compartilhada entre as variáveis singleton1 e singleton2.*/
public class DemoSingleThread {
	public static void main(String[] args) {
		// Criando instâncias Singleton
        Singleton singleton1 = Singleton.getInstance("Data from Singleton 1");
        Singleton singleton2 = Singleton.getInstance("Data from Singleton 2");

        // Exibindo os dados das instâncias
        System.out.println("Data from singleton1: " + singleton1.getData());
        System.out.println("Data from singleton2: " + singleton2.getData());

        // Verificando se as instâncias são iguais
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same (singleton pattern works).");
        } else {
            System.out.println("Different instances were created (singleton pattern failed).");
        }
    }
}
