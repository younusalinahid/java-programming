import java.util.Scanner;

public class Pattern {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter line numbers: ");
        int n= input.nextInt();//The input is stored in the variable "n".

        int row = 1;
        while (row<=n){
            System.out.println();
            int col = 1;
            while (col<=row){
                System.out.print(" "+col);
                col++;
            }
            row++;
        }
        System.out.println();


    }

}
