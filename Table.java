import java.lang.Math;
public class Table {
    private int pieces;
    private int turns;

    public void setup() {
        pieces = 10 + (int) (Math.random() * 41);
    }

    public void removePieces(int num) {
        if (num < pieces/2 && pieces >=1) {
            pieces -= num;
            turns +=1;
        }
    }

    public int getPieces() {
        return pieces;
    }

}
