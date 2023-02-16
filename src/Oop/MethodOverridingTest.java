package Oop;

public class MethodOverridingTest {

    public static void main(String[] args) {

        MethodOverridingTeacher t1 = new MethodOverridingTeacher();
        t1.name = "Younus";
        t1.age = 20;
        t1.qualification = "BSc in CSE";

        t1.displayInformation();


        MethodOverridingPerson p1 = new MethodOverridingPerson();
        t1.name = "Nahid";
        t1.age = 20;

        t1.displayInformation();
    }

}
