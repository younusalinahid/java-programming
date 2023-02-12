package Overloading_construction;

public class test {

    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher("Younus","male");
        teacher2.displayIngormation();

        Teacher teacher3 = new Teacher("Lisa","female",01235345000);
        teacher3.displayIngormation();

    }
}
