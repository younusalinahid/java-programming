import java.util.HashMap;

public class HashmapDemo {

    public static void main(String[] args) {
        //put,get
       HashMap<Integer,String> customer = new HashMap<Integer,String>();

       customer.put(82,"Younus");
       customer.put(83,"Ali");
       customer.put(84,"Nahid");

        System.out.println(customer.get(82));
        System.out.println(customer.get(83));
        System.out.println(customer.get(84));

    }

}
