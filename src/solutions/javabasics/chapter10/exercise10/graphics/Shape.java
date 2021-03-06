package solutions.javabasics.chapter10.exercise10.graphics;

/**
 * Created by JonathanSyntra on 26/12/2016.
 */
public abstract class Shape {
    private int x;
    private int y;
    private static int count = 0;

    {
      count++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setPosition(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public static int getCount() {
        return count;
    }
}
