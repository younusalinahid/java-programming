package Static_Variable;

public class StaticBlock {
    static int id;
    static String name;

    static {

        id = 82;
        name = "Nahid";

    }

   static void display(){
        System.out.println("id : "+id);
        System.out.println("Name : "+name);
    }

    public static void main(String[] args) {
        StaticBlock.display();
    }


}
