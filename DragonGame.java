class Dragon {
    int x;
    int y;
    int width;
    int height;
    void moveLeft() {
        x--;
        if (x < 0) {
            detectCollision();
        }
    }
    void moveRight() {
        x++;
        if (x > width) {
            detectCollision();
        }
    }
    void moveUp() {
        y--;
        if (y < 0) {
            detectCollision();
        }
    }
    void moveDown() {
        y++;
        if (y > height) {
            detectCollision();
        }
    }
    void printPosition() {
        System.out.println("Dragon Position: (" + x + ", " + y + ")");
    }
    void detectCollision() {
        System.out.println("Game Over");
        System.exit(0);
    }
}

public class DragonGame{
    public static void main(String[] args) {
        Dragon dragon = new Dragon();
        dragon.x = 2;
        dragon.y = 3;
        dragon.width = 10;
        dragon.height = 5;
        dragon.printPosition();
        dragon.moveRight();
        dragon.printPosition();
        dragon.moveUp();
        dragon.printPosition();
        dragon.moveLeft();
        dragon.printPosition();
        dragon.moveDown();
        dragon.printPosition();
    }
}
