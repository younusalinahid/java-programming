package Oop;

public class ParametrizedMethodTest {

    public static void main(String[] args) {

        ParametrizedMethod teacher1 = new ParametrizedMethod();
        teacher1.setInformation("Younus ali nahid ","male",878772283);
        teacher1.displayInformation();


        ParametrizedMethod teacher2 = new ParametrizedMethod();
        teacher2.setInformation("Nahid","male ",918772304);
        teacher2.displayInformation();


    }

}
