import java.util.Scanner;

public class LogicalandOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        char ch;
        System.out.println("Enter any Letter :");
        ch = input.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Small Letter");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Capital Letter");
        } else
            System.out.println("Not Letter");
    }
}
