package practice_3;



public class Main {
    public static void main(String[] args) {
        MovableCircle a = new MovableCircle(1, 1,1, 1, 1);
        a.moveDown();
        System.out.println(a);
        MovableRectangle b = new MovableRectangle(0, 100, 100, 0, 1, 2);
        b.moveRight();
        System.out.println(b);
        b.moveUp();
        System.out.println(b);


//        Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
//        System.out.println(s1); // переопределение версия из Circle
//        System.out.println(s1.getArea()); // переопределение версия из Circle (абстрактный метод)
//        System.out.println(s1.getPerimeter()); // переопределение версия из Circle (абстрактный метод)
//        System.out.println(s1.getColor());
//        System.out.println(s1.isFilled());
////        System.out.println(s1.getRadius()); ошибка у класса shape нет метода getRadius
//        System.out.println();
//
//        Circle c1 = (Circle)s1; // Downcast back to Circle
//        System.out.println(c1);
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimeter());
//        System.out.println(c1.getColor());
//        System.out.println(c1.isFilled());
//        System.out.println(c1.getRadius());
//
////        Shape s2 = new Shape(); нельзя создать объект абстрактного класса через его конструктор
//
//        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
//        System.out.println(s3);
//        System.out.println(s3.getArea());
//        System.out.println(s3.getPerimeter());
//        System.out.println(s3.getColor());
////        System.out.println(s3.getLength()); ошибка у класса shape нет метода getLength
//
//        Rectangle r1 = (Rectangle)s3; // downcast
//        System.out.println(r1);
//        System.out.println(r1.getArea());
//        System.out.println(r1.getColor());
//        System.out.println(r1.getLength());
//
//        Shape s4 = new Square(6.6); // Upcast
//        System.out.println(s4);
//        System.out.println(s4.getArea());
//        System.out.println(s4.getColor());
////        System.out.println(s4.getSide()); у класса rectangle нет метода getSide


    }
}
