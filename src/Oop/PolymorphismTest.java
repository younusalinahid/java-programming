package Oop;

public class PolymorphismTest {

    public static void main(String[] args) {

        // Run time polymorphism
        PolymorphismPerson p = new PolymorphismPerson();
        p.display();

        p = new PolymorphismTeacher();
        p.display();

        p = new PolymorphismStudent();
        p.display();


    }

}
