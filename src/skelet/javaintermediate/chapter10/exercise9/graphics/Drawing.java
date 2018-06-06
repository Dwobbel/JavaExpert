package skelet.javaintermediate.chapter10.exercise9.graphics;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Created by JonathanSyntra on 22/01/2017.
 */
public class Drawing implements Drawable, Iterable {

    private Collection<Drawable> drawables;
    private int size;

    public Drawing(){
        drawables = new ArrayList<>();
        size = 0;
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
        for (Drawable drawable : drawables) {
            if(drawable != null){
                drawable.draw(g);
            }
        }
    }

    @Override
    public void scale(int s) throws NegativeSizeException {
        for (Drawable drawable : drawables) {
            if(drawable != null){
                drawable.scale(s);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Drawable drawable : drawables) {
            if(drawable != null){
                sb.append(drawable);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override
    public Iterator iterator() {
        return drawables.iterator();
    }
}
