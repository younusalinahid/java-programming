import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any letter ");
        char ch;
        ch = input.next().charAt(0);

        if(ch=='a' || ch=='e' || ch=='i' || ch=='u' || ch=='o' || ch=='A' || ch=='E' || ch=='I' || ch=='U' || ch=='O')
        {
            System.out.println("Vowel");
        }
        else
        System.out.println("Consonent");
    }
}
