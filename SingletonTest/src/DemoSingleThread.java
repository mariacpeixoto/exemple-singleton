/* Esse código é uma demonstração simples do padrão Singleton em uma única thread.
 * Ele cria duas instâncias da classe `Singleton` com valores diferentes
 * ("FOO" e "BAR") chamando o método `getInstance`. No entanto, 
 * como o Singleton garante que apenas uma instância seja criada e retornada, 
 * ambas as variáveis criadas, `singleton` e `anotherSingleton`, 
 * referem-se à mesma instância. Portanto, a saída esperada é que ambas as variáveis 
 * tenham o mesmo valor, que é o valor passado durante a inicialização da instância, 
 * conforme demonstrado pela impressão dos valores.*/
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
