package Oop;

public class InheritanceTeacher extends InheritancePerson{

    String qualification;

    void displayInformation2(){

        displayInformation1();
        System.out.println("Qualification : "+qualification);
    }

}
