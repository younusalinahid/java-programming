public class StringComparision {

    public static void main(String[] args) {

     String password1 = "Nahid123";
     String password2 = "nahid123";
     String password3 = new String("Nahid123");
     String password4 = new String("Nahid45");

        System.out.println(password1.equalsIgnoreCase(password2));
        System.out.println(password1.equals(password3));
        System.out.println(password3.equals(password4));


    }

}
