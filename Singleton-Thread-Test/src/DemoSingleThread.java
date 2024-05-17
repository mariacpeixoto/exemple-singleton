/* O objetivo deste c�digo � demonstrar o comportamento do padr�o Singleton, 
 * mostrando que apenas uma inst�ncia da classe � criada, mesmo que o m�todo 
 * getInstance seja chamado v�rias vezes. Isso � verificado comparando as 
 * refer�ncias das inst�ncias, garantindo que apenas uma �nica inst�ncia seja 
 * compartilhada entre as vari�veis singleton1 e singleton2.*/
public class DemoSingleThread {
	public static void main(String[] args) {
		// Criando inst�ncias Singleton
        Singleton singleton1 = Singleton.getInstance("Data from Singleton 1");
        Singleton singleton2 = Singleton.getInstance("Data from Singleton 2");

        // Exibindo os dados das inst�ncias
        System.out.println("Data from singleton1: " + singleton1.getData());
        System.out.println("Data from singleton2: " + singleton2.getData());

        // Verificando se as inst�ncias s�o iguais
        if (singleton1 == singleton2) {
            System.out.println("Both instances are the same (singleton pattern works).");
        } else {
            System.out.println("Different instances were created (singleton pattern failed).");
        }
    }
}
