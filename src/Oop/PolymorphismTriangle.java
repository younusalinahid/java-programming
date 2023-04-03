package Oop;

public class PolymorphismTriangle extends PolymorphismShape{
//extend shep class

    //area
    double base,height;

    PolymorphismTriangle(double base,double height){
        this.base = base;
        this.height = height;
    }

    double area(){
        System.out.println("Area for Triangle ");
        return 0.5*base*height;
    }

}
