package Problem_Solving;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int temp,num,r,sum=0;
        System.out.print("x = ");
        num = input.nextInt();

        temp = num;

        while (temp!=0 && num>0){
            r = temp % 10;
            sum = sum * 10 + r;
            temp = temp / 10;

        }
        if (num == sum) {
            System.out.println("true");
        }
        else
            System.out.println("false");



    }




}
