import java.util.Scanner;

class DragonBody {
    int x, y, width, height;

    void moveLeft() {
        System.out.println("You moved left");
        x--;
        printPos();
        detectCollision(width, height);
    }

    void moveRight() {
        System.out.println("You moved right");
        x++;
        printPos();
        detectCollision(width, height);
    }

    void moveUp() {
        System.out.println("You moved up");
        y--;
        printPos();
        detectCollision(width, height);
    }

    void moveDown() {
        System.out.println("You moved down");
        y++;
        printPos();
        detectCollision(width, height);
    }

    void printPos() {
        System.out.println("Current position: " + x + "," + y);
    }

    void detectCollision(int widthwack, int heightwack) {
        width = widthwack;
        height = heightwack;
        if (x > width || x < 0 || y > height || y < 0) {
            System.out.println("Game over");
            System.exit(8);
        }
    }
}

public class DragonGame {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        DragonBody dragame = new DragonBody();
        dragame.height = 5;
        dragame.width = 5;
        while (true) {
            String input = inp.next();
            switch (input) {
                case "w":
                    dragame.moveUp();
                    break;
                case "s":
                    dragame.moveDown();
                    break;
                case "a":
                    dragame.moveLeft();
                    break;
                case "d":
                    dragame.moveRight();
                    break;
            }
        }
    }
}