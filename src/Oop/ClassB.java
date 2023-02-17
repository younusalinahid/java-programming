package Oop;

public class ClassB extends ClassA{

   //car
    int gear;

    ClassB(String c, double w,int g){
        super(c,w);  //calling Class A
        gear = g;
    }
    @Override
    void attribute(){
        super.attribute();
        System.out.println("Gear : " + gear);
    }


}
