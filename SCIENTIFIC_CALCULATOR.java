import java.util.Scanner;

public class SCIENTIFIC_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🔬 Welcome to Scientific Calculator");

        try {
            System.out.print("Enter an operation (sqrt, divide): ");
            String op = sc.next().toLowerCase();

            switch (op) {
                case "sqrt" -> {
                    System.out.print("Enter number: ");
                    double x = sc.nextDouble();
                    if (x < 0)
                        throw new ArithmeticException("Cannot compute square root of negative number.");
                    System.out.println("Result = " + Math.sqrt(x));
                }

                case "divide" -> {
                    System.out.print("Enter numerator and denominator: ");
                    double a = sc.nextDouble();
                    double b = sc.nextDouble();
                    if (b == 0)
                        throw new ArithmeticException("Cannot divide by zero.");
                    System.out.println("Result = " + (a / b));
                }

                default -> System.out.println("❌ Invalid operation. Supported: sqrt, divide");
            }

        } catch (ArithmeticException e) {
            System.out.println("⚠️ Math Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("⚠️ Input Error: " + e.getMessage());
        }

        sc.close();
    }
}
