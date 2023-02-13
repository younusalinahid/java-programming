package Static_Keyword;

public class Student {

    String name;
    int id;
    static String universityName = "DIU";

    Student (String n, int i){
        name = n;
        id = i;
    }

    void displayIngormation(){
        System.out.println("Name :"+name);
        System.out.println("Id :"+id);
        System.out.println("University name :"+universityName);

    }



}
