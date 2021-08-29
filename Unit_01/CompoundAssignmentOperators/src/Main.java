import java.util.Scanner;

public class Main {
    static private Scanner scan;

    public static void main(String[] args) {
        scan = new Scanner(System.in);

        System.out.println();
        System.out.println("Unit 1.5: Compound Assignment Operators");
        System.out.println("Traditional operators         Compound assignment operator");
        System.out.println("x = x + 1;                    x++;");
        System.out.println("x = x - 1;                    x--;");
        System.out.println("x = x * 2;                    x *= 2;");
        System.out.println("x = x / 2;                    x /= 2;");
        System.out.println("x = x % 2;                    x %= 2;");

        int x = 5;
        System.out.println();
        System.out.printf("Start Traditional: x = %d\n", x);
        scan.nextLine();
        x = x + 1;
        System.out.printf("x = x + 1; x = %d\n", x);
        x = x - 1;
        System.out.printf("x = x - 1; x = %d\n", x);
        x = x * 2;
        System.out.printf("x = x * 2; x = %d\n", x);
        x = x / 2;
        System.out.printf("x = x / 2; x = %d\n", x);
        x = x % 2;
        System.out.printf("x = x %% 2; x = %d\n", x);

        x = 5;
        System.out.println();
        System.out.printf("Start Compound: x = %d\n", x);
        scan.nextLine();
        x++;
        System.out.printf("x++;       x = %d\n", x);
        x--;
        System.out.printf("x--;       x = %d\n", x);
        x *= 2;
        System.out.printf("x *= 2;    x = %d\n", x);
        x /= 2;
        System.out.printf("x /= 2;    x = %d\n", x);
        x = x % 2;
        System.out.printf("x %%= 2;    x = %d\n", x);


        x = GetUserInt();
        System.out.println();
//        System.out.printf("Start User: x = %d\n", x);
//        scan.nextLine();
        x++;
        System.out.printf("x++;       x = %d\n", x);
        x--;
        System.out.printf("x--;       x = %d\n", x);
        x *= 2;
        System.out.printf("x *= 2;    x = %d\n", x);
        x /= 2;
        System.out.printf("x /= 2;    x = %d\n", x);
        x %= 2;
        System.out.printf("x %%= 2;    x = %d\n", x);

        scan.close();
    }

    private static int GetUserInt() {
        int x;
        System.out.println();
        System.out.print("Please enter a number: ");
        while(true)
        {
            String input = scan.nextLine();
            try {
                x = Integer.parseInt(input);
                break;
            }
            catch (Exception e)
            {
                System.out.print("That's not a number, please enter a number: ");
            }
        }

        System.out.printf("User input: x = %d\n", x);
        return x;
    }
}
