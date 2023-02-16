package Oop;

public class InheritanceTest {

    public static void main(String[] args) {
        InheritanceAnimal a = new InheritanceAnimal();
        InheritancePerson p = new InheritancePerson();
        InheritanceTeacher t = new InheritanceTeacher();

        System.out.println(a instanceof InheritanceAnimal);
        System.out.println(p instanceof InheritanceAnimal);
        System.out.println(t instanceof InheritancePerson);
        System.out.println(t instanceof InheritanceAnimal);
        System.out.println(p instanceof InheritanceTeacher);

    }

}
