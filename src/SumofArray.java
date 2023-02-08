import java.util.Scanner;

public class SumofArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;

        System.out.print("Enter 5 number ");

        for (int i=0; i<5; i++){
            number[i] = input.nextInt();
        }
        //number[0] = 1
        //number[1] = 2
        //number[2] = 3
        //number[3] = 4
        //number[4] = 5

        for (int i=0; i<5; i++){
            sum = sum + number[i];
        }
        System.out.println("The sum is :"+sum);


    }
}
