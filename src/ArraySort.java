import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] number = {10, 20, 13, 15, 25};

        Arrays.sort(number);

        for (int i=0; i<5; i++){
            System.out.print("Ascending "+number[i]);
        }
    }
}
