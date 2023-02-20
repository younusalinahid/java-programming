package Oop;

public class PolymorphismShapeTest {

    public static void main(String[] args) {

        PolymorphismShape[] s = new PolymorphismShape[3];

        s[0] = new PolymorphismShape();
        s[1] = new PolymorphismRectangle(10, 20);
        s[2] = new PolymorphismTriangle(10, 20);

        for (int i = 0; i < 3; i++) {

            System.out.println(s[i].area());

        }

    }
}
