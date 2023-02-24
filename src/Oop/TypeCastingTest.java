package Oop;

public class TypeCastingTest {
    public static void main(String[] args) {

        //upcasting
        TypeCasting1 p = new TypeCasting2();
        p.display();

        TypeCasting2 t = (TypeCasting2) new TypeCasting1();
        t.display();


    }
}
