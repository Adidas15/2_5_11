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

    public String display() {
        return "Player: " + name; 
    }

    public String toString() {
        return (name + " has " + points + " points");
    }
}