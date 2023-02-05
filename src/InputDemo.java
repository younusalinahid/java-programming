import java.util.Scanner;

public class InputDemo {
//psvm (shortcut)
    public static void main(String[] args) {

        int number = 120;

        System.out.println("Enter any number : ");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();

        System.out.println("Number = "+number);
    }
}
