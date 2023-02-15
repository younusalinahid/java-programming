package Oop;

public class Teacher {
    //Overloadng constructor
    String name,gender;
    int phone;

    Teacher(){
        System.out.println("No information ");

    }
    Teacher(String n,String g){
        name = n;
        gender = g;
    }
    Teacher(String n, String g,int p){
        name = n;
        gender = g;
        phone = p;

    }

    void displayIngormation(){
        System.out.println("Name :"+name);
        System.out.println("gender :"+gender);
        System.out.println("Phone :"+phone);
    }



}
