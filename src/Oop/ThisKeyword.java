package Oop;

public class ThisKeyword {

    String name;
    String hairColor;
    int age;


    ThisKeyword(String name,int age){
        this.name = name;
        this.age = age;
    }
    ThisKeyword(String name,int age,String hairColor){
        this(name, age);
        this.hairColor = hairColor;

    }

    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("HairColor : "+hairColor);
    }

}
