package Oop;

public class AnnomymousTest {
    public static void main(String[] args) {

        Annomymous a = new Annomymous(){

            @Override
            void display(){
                System.out.println("Test class ");
            }
        };
        a.display();




    }
}
