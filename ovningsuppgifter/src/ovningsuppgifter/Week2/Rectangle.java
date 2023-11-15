package ovningsuppgifter.Week2;

import java.awt.*;

public class Rectangle {
    private Color color;
    private float width;
    private float height;


    public Rectangle(){
        color = Color.BLACK;
        this.height = height;
        this.width = width;
    }
    public void setWidth(float width) {
        if (width < 0.0)
            this.width = 0.0f;
        else
        this.width = width;

    }

    public void setHeight(float height) {
        if (height < 0.0)
            this.width = 0.0f;
        else
        this.height = height;

    }

    public void setColor(Color color) {
        this.color = color;
    }

    public float getWidth() {
        return this.width;
    }

    public Color getColor() {
        return color;
    }

    public float getHeight() {
        return height;
    }

    public float calculateArea(){
        float area = width * height;
        return area;
    }

    public float perimeter(){
        float perimeter = (width * 2) + (height * 2);
       return perimeter;

    }
}
