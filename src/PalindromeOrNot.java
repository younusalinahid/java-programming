import java.util.LinkedList;

public class PalindromeOrNot {

    public static void main(String[] args) {
        int n = 6, k = 5;
        int ans = 0;
        for(int i = 1; i <= n; i++)
        {
            ans = (ans + k) % i;
        }
        System.out.println(ans + 1);
    }
}
