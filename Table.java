import java.lang.Math;
public class Table {
    private int nims;

    public boolean changeBoard(int num) {
        if (num <= nims/2 && num >=1) {
            nims -= num;
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