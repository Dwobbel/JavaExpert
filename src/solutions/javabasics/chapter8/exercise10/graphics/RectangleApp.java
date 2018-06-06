package solutions.javabasics.chapter8.exercise10.graphics;

import static solutions.javabasics.chapter8.exercise10.graphics.Rectangle.getCount;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class RectangleApp {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Rectangle rect3 = new Rectangle();
        Rectangle rect4 = new Rectangle();
        Rectangle rect5 = new Rectangle();

        System.out.println(getCount());

        int a = 600_000;
        short b = (short)a;
        System.out.println(b);
    }
}
