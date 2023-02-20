package Oop;

public class PolymorphismRectangle extends PolymorphismShape{

    double length,width;

    PolymorphismRectangle (double length,double width){
        this.length = length;
        this.width = width;
    }

    double area(){
        System.out.println("Area for Rectangle ");
        return length * width;
    }


}
