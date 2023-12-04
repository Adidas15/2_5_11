public class Player {
    private String name;
    private int points;
    private int wins;

    public Player(String n) {
        name = n;
    }

    public void addWin() {
        wins ++;
    }

    public int getWins() {
        return wins;
    }

    public void resetPoints() {
        points = 0;
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