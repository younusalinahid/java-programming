import java.util.ArrayList;

public class Arraylist02 {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = "+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        System.out.println("Arraylist contains :"+number);
        System.out.println();
        System.out.println("size = "+number.size());

        //number.clear();
        //System.out.println("after clear Arraylist contains :"+number);

        number.clear();
        boolean check = number.isEmpty();
        System.out.println("Arraylist empty :"+check);

        boolean contain = number.contains(30);
        System.out.println("30 is in the list :"+contain);


    }

}
