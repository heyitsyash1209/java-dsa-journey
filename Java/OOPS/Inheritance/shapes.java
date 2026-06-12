class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }
}

class Circle extends Shape {

    String color; 
    
    Circle(String ShapeColor, String ChildColor) {
        super(ShapeColor);
        this.color = ChildColor;
    }

    void display() {
        System.out.println(super.color);
        System.out.println(this.color);
    }
}

class Square extends Shape {

    Square(String color) {
        super(color);
    }
}

public class shapes { 
    public static void main(String[] args) {

        // Shape s1 = new Shape("Red");
        Circle c = new Circle("Red","Blue");
        c.display();

        //Square s1 = new Square("Pink");
        //System.out.println(s.color);
    }
}