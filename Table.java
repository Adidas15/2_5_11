import java.lang.Math;
public class Table {
    private int nims;
    private int turns;

    public boolean changeBoard(int num) {
        if (num <= nims/2 && nims >=1) {
            nims -= num;
            turns +=1;
            return true;
        }
        else {
            return false;
        }
    }

    public void setNims() {
        nims = 10 + (int) (Math.random() * 41);
    }

    public int getNims() {
        return nims;
    }

}
