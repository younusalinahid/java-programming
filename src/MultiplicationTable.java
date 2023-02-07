import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter any sumber ");
        num = input.nextInt();

        for(int i = 1; i<=10; i++){
            System.out.println(num+"x"+i +"="+num*i);
        }
    }
}
