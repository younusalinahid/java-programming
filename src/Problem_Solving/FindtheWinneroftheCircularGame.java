package Problem_Solving;

public class FindtheWinneroftheCircularGame {
    public static void main(String[] args) {
        int n = 5, k = 2;
        int ans = 0;
        for(int i = 1; i <= n; i++)
        {
            ans = (ans + k) % i;
        }
        System.out.println(ans + 1);

    }

}
