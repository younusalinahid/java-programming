package Oop;

public class Varargs {

    void add(int ... num){

        int sum = 0;
        for(int x : num){  //for each loof
            sum = sum + x;
        }



        System.out.println(sum);
    }


}
