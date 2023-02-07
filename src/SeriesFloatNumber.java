import java.util.Scanner;

public class SeriesFloatNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0, n;

        System.out.println("Enter the last number ");
        n = input.nextDouble();

        for(double i=1.5; i<=n; i++){
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("The sum is "+sum);
    }
}
