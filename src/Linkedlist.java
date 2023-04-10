import java.util.LinkedList;

public class Linkedlist {


    public static void main(String[] args) {

        //creat LinkedList method
        LinkedList<String> countryNames = new LinkedList<String>();

        countryNames.add("Bangladesh");
        countryNames.add("Pakisten");
        countryNames.add("India");
        countryNames.add("Afghannustan");
        countryNames.add("Napal");
        countryNames.add(5,"Brazil");
        countryNames.addFirst("Australia");
        countryNames.addLast("Jepan");

        System.out.println(countryNames);

    }

}
