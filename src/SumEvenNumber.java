import java.util.Scanner;

public class SumEvenNumber {

    public static void main(String[] args) {

    //print even number
        Scanner input = new Scanner(System.in);
        int sum = 0, n;
        System.out.println("Enter final number");
        n = input.nextInt();


        for(int i=1; i<=n; i++){

            if(i%2==0)
                sum = sum + i;
        }
        System.out.println("The sum is : "+sum);
    }
}
