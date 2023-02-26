import java.util.HashMap;

public class HashmapDemo {

    public static void main(String[] args) {
        //put,get
        HashMap <Integer,String> customer = new HashMap<Integer,String>();

        customer.put(82,"Nahid");
        customer.put(83,"Nadim");
        customer.put(84,"Nahida");

        System.out.println(customer.get(83));

    }

}
