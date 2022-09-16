package practice_3;

public class MovableCircle implements Movable{


    private final int radius;
    private final MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public void moveUp(){
        center.moveUp();
    }

    public void moveDown(){
        center.moveDown();
    }

    public void moveRight(){
        center.moveRight();
    }

    public void moveLeft(){
        center.moveLeft();
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
