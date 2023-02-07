import java.util.Scanner;

public class Input1Demo {
    public static void main(String[] args) {

        //Event 1 to n number
        Scanner input = new Scanner(System.in);
        int sum = 0,n;


        System.out.println("Ener Final number ");
        n = input.nextInt();

        for(int i=1; i<=n; i++){
            sum = sum +i;

        }
            System.out.println("The sum is "+sum);



    }
}
