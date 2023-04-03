package Oop;

public class PolymorphismRectangle extends PolymorphismShape{

    //area
    double length,width;

    //construction
    PolymorphismRectangle (double length,double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        System.out.println("Area for Rectangle ");
        return length * width;
    }


}
