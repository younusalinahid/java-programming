package Oop;

public class AddDemo {

    //Variable length arguments

    void add (int ... num){

        int sum = 0;
        for (int x : num){
            sum = sum + x;
        }

        System.out.println(sum);
    }

}
