package week08d01;

public class Robot {
    private int x = 0;
    private int y = 0;
    private String move;

    public Robot(String move) {
        this.move = move;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String move() {
        move = move.toLowerCase();
        char k;
        for (int i = 0; i < move.length(); i++) {
            calc(move.charAt(i));
        }
        return "A robot koordinátái: X = " + getX() + ", Y = " + getY();
    }

    public void calc(char k) {
        switch (k) {
            case 'f':
                y++;
                break;
            case 'l':
                y--;
                break;
            case 'j':
                x++;
                break;
            case 'b':
                x--;
                break;
            default:
                throw new IllegalArgumentException();

        }
    }
}
