package practice_2;

public class Main {
    public static void main(String[] args) {
        Author a = new Author("Roma", "ramalguseynov03@gmail.com", 'M');
        System.out.println(a);
        Ball b = new Ball(1, 2);
        b.move(12, 12);
        System.out.println(b);
    }
}