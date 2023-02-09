
import java.lang.StringBuffer;

public class PalindromDmo {

    public static void main(String[] args) {

        String s1 = "madam";
        StringBuffer sb = new StringBuffer(s1);

       String s2 =  sb.reverse().toString();

        if (s1.equals(s2)){
            System.out.println("Palindromse");
        }
        else
            System.out.println("Not a palindrome");



    }
}
