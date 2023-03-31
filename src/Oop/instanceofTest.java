package Oop;

public class instanceofTest {

    public static void main(String[] args) {

        instanceofAnimal a = new instanceofAnimal();
        instanceofPerson p = new instanceofPerson();
        instanceofTeacher t = new instanceofTeacher();


        System.out.println(a instanceof instanceofAnimal);
        System.out.println(p instanceof instanceofPerson);
        System.out.println(t instanceof instanceofPerson);
        System.out.println(t instanceof instanceofTeacher);
        System.out.println(a instanceof instanceofPerson);


    }
}
