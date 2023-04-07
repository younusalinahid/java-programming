import java.util.Scanner;

public class decimaltobinaryoctalhexa {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.println("Enter any decimal number :");
        decimal = input.nextInt();

        //decimal to Binary
        String binary = Integer.toBinaryString(decimal);
        System.out.println("Binary  = "+binary);

        //Decimal to Octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal  = "+octal);

        //Decimal to Hexadecimal
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal = "+hexadecimal);

    }
}
