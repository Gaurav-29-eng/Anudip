public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add two ints: " + calc.add(10, 20));
        System.out.println("Add three ints: " + calc.add(5, 15, 25));
        System.out.println("Add two doubles: " + calc.add(10.5, 20.75));
    }
}
