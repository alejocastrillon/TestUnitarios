public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        int a = 5;
        int b = 10;
        System.out.println("La suma de %d y %d es: %d".formatted(a, b, Calculadora.suma(a, b)));
    }
}
