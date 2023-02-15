package Problem_Solving;

public class Box {

    double height, width, depth;//instance variable

    Box (double h,double w,double d){
        //local variable
        height = h;
        width = w;
        depth = d;
    }
    void displayVol(){
        double vol = height * width * depth;
        System.out.println("Volume is : "+vol);
        }
    }



