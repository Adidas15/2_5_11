import java.lang.Math;
public class Table {
    private int nims = 10 + (int) (Math.random() * 41);
    private int turns;

    public boolean chanegBoard(int num) {
        if (num < nims/2 && nims >=1) {
            nims -= num;
            turns +=1;
            return true;
        }
        else {
            return false;
        }
    }

}
