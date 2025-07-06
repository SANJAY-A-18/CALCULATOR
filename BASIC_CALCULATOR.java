import java.util.Scanner;

public class BASIC_CALCULATOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("📱 Welcome to Basic Calculator");

        do {
            System.out.println("\n--- Calculator Menu ---");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            double a, b;

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a + b));
                }
                case 2 -> {
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a - b));
                }
                case 3 -> {
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    System.out.println("Result = " + (a * b));
                }
                case 4 -> {
                    System.out.print("Enter two numbers: ");
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    if (b != 0)
                        System.out.println("Result = " + (a / b));
                    else
                        System.out.println("⚠️ Cannot divide by zero!");
                }
                case 5 -> System.out.println("👋 Exiting... Thank you!");
                default -> System.out.println("❌ Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}

