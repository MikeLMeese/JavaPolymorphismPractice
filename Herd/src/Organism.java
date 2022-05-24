public class Organism implements Movable {

    private int x;
    private int y;

    // Class constructor that receives x/y coordinates of its initial position as parameters
    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Creates and returns a string representation of the organism's location
    public String toString() {
        return "x: " + x + "; y: " + y;

    }

    // Moves the objects by values it receives as parameters
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
    }
}