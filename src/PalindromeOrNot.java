import java.util.Scanner;

public class PalindromeOrNot {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int temp, num, r, sum = 0;
        System.out.println("Enter any number ");
        num = input.nextInt();

        temp = num;

        while(temp!=0){

            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        if(num==sum){
            System.out.println("palindrom");
        }
        else
            System.out.println("Not Palindrom");






    }
}
