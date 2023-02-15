package Static_Variable;

public class StaticBlock {
    static int id;
    static String name;

    static {
        System.out.println("Static block ");
    }


    public static void main(String[] args) {
        System.out.println("main method");
    }


}
