package practice_3;

public class MovableRectangle implements Movable{

    private final MovablePoint topLeft;
    private final MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1,xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2,xSpeed, ySpeed);
    }
    public boolean speedTest(){
        return topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed;
    }
    public void moveUp() {
        if (speedTest()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
    }

    public void moveDown(){
        if (speedTest()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    public void moveRight(){
        if (speedTest()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
    }

    public void moveLeft(){
        if (speedTest()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
