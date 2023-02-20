package Oop;

public class AbstractionTest {
    public static void main(String[] args) {

        AbstractionMobileUser mu;

        mu = new AbstractionPerson();
                mu.sendMassage();

        mu = new AbstractionPerson2();
        mu.sendMassage();

    }


}
