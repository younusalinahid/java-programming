import java.util.Arrays;

public class ArrayDescending {
    public static void main(String[] args) {

        int[] number = {10, -13, 13, 20, 17};

        Arrays.sort(number);

        System.out.println("Descending : ");
        for (int i=4; i>=0; i--){
            System.out.print(" "+number[i]);
        }
    }
}
