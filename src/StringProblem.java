import java.util.Arrays;

public class StringProblem {
    public static void main(String[] args) {
        int[] nums = {1,3,2,1,3,2,2};
        int [] arr = new int[101];
        for(int num : nums){
            arr[num]++;}
        //for(int i=0; i<arr.length; i++){
        //sout(arr[i]);
        int pairs = 0,leftover = 0;
        for(int c : arr){
            pairs += c/2;
            leftover += c%2;
        }
        int[] res = {pairs, leftover};
        System.out.println(Arrays.toString(res));
    }
}

