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
    }
}
