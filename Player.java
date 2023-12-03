public class Player {
    private String name;
    private int points;

    public Player(String n) {
        name = n;
    }

    public void addPoints(int p) {
        points += p;
    }

    public int getPoints(){
        return points;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return (name + "'s turn. " + name + " has " + points + " points.");
    }
}