import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // y = a(1 + r)^x
        // a = intial value
        // r = growth rate
        // x = time interval

        System.out.println("Let's calculate subs!");
        System.out.println("This program uses y = a(1 + r)^x");

        System.out.println("Enter inital value (a): ");

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

        System.out.println("Enter growth rate (a): ");
        double r = scan.nextDouble();

        System.out.println("Enter time interval in days (a): ");
        int x = scan.nextInt();

        System.out.println(calculateSubs(a, r, x));
    }

    public static int calculateSubs(int a, double r, int x) {
        return (int) (a * Math.pow((1 + r), x));
    }
}
