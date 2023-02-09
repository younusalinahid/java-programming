import javax.swing.*;

public class StringDemo1 {
    public static void main(String[] args) {

         String s1 = "Younus Ali";
         String s2 =new String("Younus ali Nahid");

         char[] s3 = {'N','a','h','i','d'};
          System.out.println(s3);

          //printing string
        System.out.println("s1 = "+s1);
        System.out.println("s2 = "+s2);

        //for string size
        int len = s1.length();
        System.out.println("Langth of s1 "+len);

        //equal or not equal
         if(s1.equals(s2)){
             System.out.println("Equals");
         }
         else
             System.out.println("Not equals");

         //equal or not equal
         if (s1.equalsIgnoreCase(s2)){
             System.out.println("Equal ");
         }
         else
             System.out.println("Not equals ");

        //true or false
         boolean con = s1.contains("ami");
        System.out.println(con);

        //true or false
        boolean b = s1.isEmpty();
        System.out.println("b = "+b);

    }
}
