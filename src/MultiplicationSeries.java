import java.util.Scanner;

public class MultiplicationSeries {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result  = 1, n;

        System.out.print("Enter the last number ");
        n = input.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i+"x");
            result = result * i;
        }
        System.out.println("\nThe sum is "+result);
    }
}
