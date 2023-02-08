import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] number = new double[5];
        double sum = 0;

        System.out.print("Enter 5 number ");

        for (int i = 0; i < 5; i++) {
            number[i] = input.nextInt();
        }
        //number[0] = 1
        //number[1] = 2
        //number[2] = 3
        //number[3] = 4
        //number[4] = 5

        for (int i = 0; i < 5; i++) {
            sum = sum + number[i];
        }
        System.out.println("The sum is :" + sum);
        double avg = sum / 5;
        System.out.println("The Average is :" + avg);

        double max = number[0];
        double min = number[0];
        for (int i=1; i<5; i++){

            if (max<number[i]){
                max = number[i];
            }
            if (min>number[i]){
                min = number[i];
            }
        }
        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);

    }
}
