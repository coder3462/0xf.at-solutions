import java.util.Scanner;
public class Level12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first #: ");
        int a = input.nextInt();
        System.out.println("Enter second #: ");
        int b = input.nextInt();
        if (a == 1) // This method is better but only works if you are finding a summation with a starting term of 1
            System.out.println("\nSum: " + b * (b + 1) / 2);
        else // This second method works with any bounds
            sum(a, b);
    }
    private static int sumMonotonic(int a, int b) {
        int result = 0;
        while (a <=b) {
            result+=a;
            a++;
        }
        return result;
    }
    private static void sum(int a, int b) {
        int result;
        if (a<=b)
            result = sumMonotonic(a,b);
        else
            result = sumMonotonic(b,a);
    }
}
