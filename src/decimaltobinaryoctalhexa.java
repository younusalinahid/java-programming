import java.util.Scanner;

public class decimaltobinaryoctalhexa {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.println("Enter any decimal number :");
        decimal = input.nextInt();

        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary  = "+binary);


        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal  = "+octal);


        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal = "+hexadecimal);



    }
}
