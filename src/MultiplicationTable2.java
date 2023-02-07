import java.util.Scanner;

public class MultiplicationTable2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, m;

        System.out.println("Enter Initital number ");
        m = input.nextInt();

        System.out.println("Enter Final number ");
        n = input.nextInt();

        for (int i = m; i <= n; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
            System.out.println("\n");
        }
    }
}
