package Oop;

public class SuperKeyB extends SuperKeyA {

    //sub class
    @Override        //overridded method
    void display(){
        super.display();
        System.out.println("Inside B class ");
    }

}
