package Oop;

public class MethodOverridingTest {

    public static void main(String[] args) {

        MethodOverridingTeacher t1 = new MethodOverridingTeacher();
        t1.name = "Younus";
        t1.age = 20;
        t1.qualification = "BSc in CSE";
        t1.displayInformation();


        System.out.println();
        MethodOverridingPerson p1 = new MethodOverridingPerson();
        p1.name = "Nahid";
        p1.age = 20;
        p1.displayInformation();
    }

}
