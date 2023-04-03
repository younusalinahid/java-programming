package Oop;

public class AbstractionTest {
    public static void main(String[] args) {

        AbstractionMobileUser mu; //refrence variable

        mu = new AbstractionPerson();
        mu.call();
        mu.sendmessage();

        mu = new AbstractionPerson2();
        mu.sendmessage();

    }
}
