import java.util.Scanner;
import java.lang.Math;
public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Table table = new Table();
        Player p1 = new Player("Aditya");
        Player p2 = new Player("Jonathan");
        Player currentPlayer;
        int pi;
        if (Math.random()>=0.50) {
            currentPlayer = p1;
        }
        else {
            currentPlayer = p2;
        }
        System.out.println("Nims remaining: " + table.getNims());
        while (table.getNims()>1) {
            System.out.println(currentPlayer.toString());
            System.out.println("There are " + table.getNims() + " nims on the board.");
            System.out.println("Enter nims: ");
            pi = sc.nextInt();
            if (table.changeBoard(pi)) {
                currentPlayer.addPoints(pi);
            }
            else {
                System.out.println("Invalid number of nims. Try again: ");
                pi = sc.nextInt();
                if (table.changeBoard(pi)) {
                    currentPlayer.addPoints(pi);
                }
            }     
            if (currentPlayer.equals(p1)) {
                currentPlayer = p2;
            }       
            else {
                currentPlayer = p1;
            }
        }
        
        System.out.println(currentPlayer.getName() + " is the loser! " + currentPlayer.getName() + " had " + currentPlayer.getPoints() + " points.");
        if (currentPlayer.equals(p1)) {
            currentPlayer = p2;
        }       
        else {
            currentPlayer = p1;
        }
        System.out.println(currentPlayer.getName() + " is the winner! " + currentPlayer.getName() + " had " + currentPlayer.getPoints() + " points.");


    }
}
