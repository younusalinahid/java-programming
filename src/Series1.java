import java.util.Scanner;

public class Series1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0, n;

        System.out.println("Enter the last number ");
        n = input.nextInt();

        for(int i=1; i<=n; i++){

            sum = sum + i;
            System.out.println(i);
        }
        System.out.println("The sum is "+sum);
    }
}
