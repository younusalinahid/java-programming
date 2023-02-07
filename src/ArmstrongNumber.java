import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int temp, num, r, sum = 0;
        System.out.println("Enter any number ");
        num = input.nextInt();

        temp = num;

        while(temp!=0){

            r = temp % 10;
            sum = sum + r * r *r;
            temp = temp / 10;

        }
        if (num==sum)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");




    }
}
