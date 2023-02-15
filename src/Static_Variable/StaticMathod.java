package Static_Variable;

public class StaticMathod {

    static int x = 10;
    void display()
    {

        System.out.println("Iam non static method ");
    }
    static void display2(){

        System.out.println(" "+x);
        System.out.println("I am static method");
    }


}
