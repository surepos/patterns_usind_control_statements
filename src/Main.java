import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the number of lines to print a pattern: ");
        int lineNumber = myScanner.nextInt();

        for (int i = 1; i <= lineNumber; i++) {
            for (int j = 0; j < lineNumber - i; j++) {
                System.out.print("\t");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                int power = (j <= (2 * i - 2) / 2) ? j : 2 * i - 2 - j ;
                System.out.print((int)Math.pow(2, power) + "\t");
            }
            System.out.println();
        }
    }
}
