public class Question05 {

    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        Question05 calc = new Question05();

        int result1 = calc.square(
                calc.add(calc.multiply(3, 4), calc.multiply(5, 7))
        );

        int result2 = calc.add(
                calc.square(calc.add(4, 7)),
                calc.square(calc.add(8, 3))
        );

        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}
