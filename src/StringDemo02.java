public class StringDemo02 {

    public static void main(String[] args) {

        String firstName = "Younus ali ";
        String lastName = "Nahid";

      /* String fullName = firstName + lastName;
         System.out.println("Full name : "+fullName);
      */

        //or
        String fullName = firstName.concat(lastName);
        System.out.println("Full name : "+fullName);

        String upperName = fullName.toUpperCase();
        System.out.println("UpperName "+upperName);

        String lowerName = fullName.toLowerCase();
        System.out.println("UpperName "+lowerName);

        //stating word
        boolean b = firstName.startsWith("Y");
        System.out.println("b = "+b);

        //last word
        boolean last = lastName.endsWith("an");
        System.out.println("last = "+last);

        //use for each
        String[] name = {"younus","ali","nahid"};
        for (String x : name){
            System.out.println(x);
        }



    }
}
