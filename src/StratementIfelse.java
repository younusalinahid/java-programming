import java.util.Scanner;

public class StratementIfelse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter any number :");
        num = input.nextInt();

        if (num > 0) {
            System.out.println("Positive number :");
        } else

            System.out.println("Negative number:");

    }
}
