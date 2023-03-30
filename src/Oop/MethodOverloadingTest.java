package Oop;

public class MethodOverloadingTest {

    public static void main(String[] args) {

        MethodOverloading ob = new MethodOverloading();
        ob.add();

        ob.add(5,5); //type conversion int to double

        ob.add(5,6,2);

        ob.add(5,10,20);

    }

}
