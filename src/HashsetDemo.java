import java.util.HashSet;

public class HashsetDemo {

    public static void main(String[] args) {

        HashSet<String> fruitsName = new HashSet<String>();

        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Banana");
        fruitsName.add("Mango");

        System.out.println(fruitsName);
        System.out.println("Size "+fruitsName.size());

        fruitsName.remove("Apple");
        System.out.println(fruitsName);

        fruitsName.clear();
        System.out.println(fruitsName);

        boolean value = fruitsName.isEmpty();//true or false
        System.out.println(value);

    }
}
