package Oop;

public class ToSring {

    String name;
    int age;

    ToSring(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "name : "+name +"\nage : "+age;
    }

}
