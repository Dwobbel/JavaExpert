package solutions.javabasics.chapter8.exercise6.graphics;

/**
 * Created by JonathanSyntra on 4/12/2016.
 */
public class Rectangle {
    private int x;
    private int y;
    private int height;
    private int width;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x < 0 ? 0 : x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y < 0 ? 0 : y;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height < 0 ? -height: height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width < 0 ? -width:width;
    }

    public void setPosition(int x, int y){
        this.setX(x);
        this.setY(y);
    }

    public double getArea(){
        return this.getHeight() * this.getWidth();
    }

    public double getPerimeter(){
        return (this.getHeight() + this.getWidth()) * 2;
    }

    public void grow(int d){
        int newHeight = this.getHeight() + d;
        int newWidth = this.getWidth() + d;
        this.setHeight(newHeight > 0 ? newHeight : 0);
        this.setWidth(newWidth > 0 ? newWidth : 0);
    }
}
