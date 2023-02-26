package Oop;

import java.util.LinkedList;

public class LinkeListDemo {

    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<String>();

        countryNames.add("Bangladesh");
        countryNames.add("Pakisten");
        countryNames.add("India");
        countryNames.add("Afghannustan");
        countryNames.add("Napal");
        countryNames.add(5,"Brazil");
        countryNames.addFirst("Australia");
        countryNames.addLast("Jepan");
        //countryNames.remove("Japan");
        //countryNames.remove(7);
        //countryNames.removeFirst();
        //countryNames.removeLast();


        for (String country : countryNames){
            System.out.println(country);
        }

        System.out.println("Size of the Linkedlist : "+countryNames.size());

        System.out.println("First element : "+countryNames.getFirst());
        System.out.println("Last element : "+countryNames.getLast());

        countryNames.clear();
        System.out.println(countryNames);

    }

}
