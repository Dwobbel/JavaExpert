package skelet.javaintermediate.chapter11.exercise7.graphics;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class Drawing implements Drawable, Iterable {
    private Collection<Drawable> drawables;

    public Drawing(){
        drawables = new ArrayList<>();
    }

    public void addDrawable(Drawable drawable){
        drawables.add(drawable);
    }

    public void removeDrawable(Drawable drawable){
        drawables.remove(drawable);
    }

    public void clear(){
        drawables.clear();
    }

    public int getSize(){
        return drawables.size();
    }

    @Override
    public void draw(Graphics g) {
        drawables.forEach(drawable -> drawable.draw(g));
    }

    @Override
    public void scale(int s) throws NegativeSizeException {
        for (Drawable drawable : drawables) {
            drawable.scale(s);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Drawable drawable : drawables) {
            sb.append(drawable);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

    @Override
    public Iterator iterator() {
        return drawables.iterator();
    }
}