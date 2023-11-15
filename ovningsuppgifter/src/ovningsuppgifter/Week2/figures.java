package ovningsuppgifter.Week2;

import java.awt.*;

public class figures {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(20);
        rectangle1.setHeight(10);
        rectangle1.setColor(Color.BLUE);
        System.out.println(rectangle1.getWidth());
        System.out.println(rectangle1.getHeight());
        System.out.println(rectangle1.getColor());
        float area = rectangle1.calculateArea();
        System.out.println(area);

    }
}
