package practice_1;

public class Main {
    public static void main(String[] args) {
        Dog a = new Dog();
        System.out.println(a.getName());
        Ball b = new Ball(12);
        System.out.println(b.getDiameter());
        Book c = new Book("12 chairs");
        System.out.println(c.getName());
    }
}