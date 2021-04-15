package app;

/**
 * My awesome class
 *
 * @author NevetScar
 * @version 1.0
 */
public class App {
    public static void main(String[] args) {
        System.out.println(new App().add(2, 2));
    }

    /**
     * 
     * @param a first number
     * @param b second number
     * @return this is better
     */
    public int add(int a, int b) {return a + b;}
}
