import java.util.ArrayList;

public class Arraylist03 {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>();
        System.out.println("size = "+number.size());

        //adding elements
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);

        int pos = number.indexOf(40);
        System.out.println("The index of 40 is :"+pos);

        number.set(3, 50);
        System.out.println("after setting : "+number);

        int x = number.get(0);
        System.out.println("index 0 = "+x);



    }
}
