package Oop;

public class ConstructorTest {

    public static void main(String[] args) {

        Constructor teacher1 = new Constructor("Younus ","male ",123456788);
        teacher1.displayInformation();


        Constructor teacher2 = new Constructor("Nahid ","male ",876443212);
        teacher2.displayInformation();


        Constructor teacher3 = new Constructor();
        teacher3.displayInformation();

    }
}
