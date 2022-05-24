import java.util.ArrayList;

public class Herd implements Movable {

    private ArrayList<Movable> herd;
    String a = System.lineSeparator();

    public Herd() {
        herd = new ArrayList<Movable>();

    }

    /*
     * Returns a string representation of the positions of the members of the herd,
     * each on its own line
     */
    public String toString() {
        String word = "";
        for (Movable value : this.herd) {
            word += value.toString();
            word += a;
        }
        return word;
    }

    // Adds an object that implements the Movable interface to the herd
    public void addToHerd(Movable movable) {
        this.herd.add(movable);
    }

    /* Moves the herd with by the amount specified by the parameters
    Each member of the herd must be moved individually */
    public void move(int dx, int dy) {
        for (Movable herdMember : this.herd) {
            herdMember.move(dx, dy);
        }
    }
}