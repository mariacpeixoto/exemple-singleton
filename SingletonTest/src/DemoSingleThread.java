/* Esse c�digo � uma demonstra��o simples do padr�o Singleton em uma �nica thread.
 * Ele cria duas inst�ncias da classe `Singleton` com valores diferentes
 * ("FOO" e "BAR") chamando o m�todo `getInstance`. No entanto, 
 * como o Singleton garante que apenas uma inst�ncia seja criada e retornada, 
 * ambas as vari�veis criadas, `singleton` e `anotherSingleton`, 
 * referem-se � mesma inst�ncia. Portanto, a sa�da esperada � que ambas as vari�veis 
 * tenham o mesmo valor, que � o valor passado durante a inicializa��o da inst�ncia, 
 * conforme demonstrado pela impress�o dos valores.*/
public class DemoSingleThread {
	public static void main(String[] args) {
        System.out.println("If you see the same value, then singleton was reused (yay!)" + "\n" +
                "If you see different values, then 2 singletons were created (booo!!)" + "\n\n" +
                "RESULT:" + "\n");
        Singleton singleton = Singleton.getInstance("FOO");
        Singleton anotherSingleton = Singleton.getInstance("BAR");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
