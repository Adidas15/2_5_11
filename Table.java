import java.lang.Math;
public class Table {
    private int nims;

    public boolean changeBoard(int num) {
        if (num <= nims/2 && num >=1) { //checks to make sure that conditions for a move are met, which are that it has to be greater than 0 and less than half the remianing nims.
            nims -= num; //reduces total amount of nimes
            return true; //makes the turn go
        }
        else {
            return false; //returns false so it asks again
        }
    }

    public void setNims() { //sets the starting # of nims
        nims = 10 + (int) (Math.random() * 41);
    }

    public int getNims() {
        return nims; //returns amount of nims left
    }

}