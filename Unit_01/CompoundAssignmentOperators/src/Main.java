import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Unit 1.5: Compound Assignment Operators");
        System.out.println("Traditional operators         Compound assignment operator");
        System.out.println("x = x + 1;                    x++;");
        System.out.println("x = x - 1;                    x--;");
        System.out.println("x = x * 2;                    x *= 2;");
        System.out.println("x = x / 2;                    x /= 2;");
        System.out.println("x = x % 2;                    x %= 2;");
        System.out.println();

        double x = 5.0;
        x = x + 1;
        x = x - 1;
        x = x * 2;
        x = x / 2;
        x = x % 2;
        System.out.printf("x = %f\n", x);

//        System.out.printf("x = x + 1; x = %f", x);
//        System.out.printf("x = x - 1; x = %f", x);
//        System.out.printf("x = x*2; x = %f", x);
//        System.out.printf("x = x/2; x = %f", x);
//        System.out.printf("x = x%2; x = %f", x);

        x = 5.0;
        x = x + 1;
        x = x - 1;
        x = x * 2;
        x = x / 2;
        x = x % 2;
        System.out.printf("x = %f\n", x);
//        System.out.printf("x++; x = %f", x);
//        System.out.printf("x--; x = %f", x);
//        System.out.printf("x *= 2; x = %f", x);
//        System.out.printf("x /= 2; x = %f", x);
//        System.out.printf("x %= 2; x = %f", x);

        System.out.println();

        x = GetUserNumber();

        x = x + 1;
        x = x - 1;
        x = x * 2;
        x = x / 2;
        x = x % 2;
        System.out.printf("x = %f\n", x);

//        System.out.printf("x++; x = %f", x);
//        System.out.printf("x--; x = %f", x);
//        System.out.printf("x *= 2; x = %f", x);
//        System.out.printf("x /= 2; x = %f", x);
//        System.out.printf("x %= 2; x = %f", x);
    }

    private static double GetUserNumber() {
        double x;
        System.out.print("Please enter a number: ");
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            String input = scan.nextLine();
            try {
                x = Double.parseDouble(input);
                break;
            }
            catch (Exception e)
            {
                System.out.print("That's not a number. Please enter a number: ");
            }
        }

        System.out.printf("User value: x = %f\n", x);
        scan.close();
        return x;
    }
}
