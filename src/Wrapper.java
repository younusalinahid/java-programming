public class Wrapper {

    public static void main(String[] args) {

        //primitive to object
        int x = 30;

        Integer y = Integer.valueOf(x);
        System.out.println(y);

        Integer z = x; //Integer.valueoff(x) autoboxing
        System.out.println(y);


    }
}
