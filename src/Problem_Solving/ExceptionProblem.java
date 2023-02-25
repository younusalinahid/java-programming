package Problem_Solving;

import java.util.Scanner;

public class ExceptionProblem {
    public static void main(String[] args) {

        int count = 1;

       do {

            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter num1 : ");
                int num1 = input.nextInt();

                System.out.println("Please enter num2 : ");
                int num2 = input.nextInt();

                int result = num1/num2;
                System.out.println("Result : "+num1+"/"+num2+" = "+result);
                count = 2;

            }catch (Exception e){

                System.out.println("Exception  "+e);
                System.out.println("you must enter integer please try again   "+e);

            }

        }while (count==1);






    }

}
