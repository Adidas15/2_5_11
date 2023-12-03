import java.util.Scanner;
import java.lang.Math;
public class Runner {

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            Table table = new Table();
            System.out.println("Enter player one's name: ");
            String p1Name = sc.nextLine();
            Player p1 = new Player(p1Name);
            System.out.println("Enter player two's name: ");
            String p2Name = sc.nextLine();
            Player p2 = new Player(p2Name);
            Player currentPlayer;
            int pi;
            if (Math.random()>=0.50) {
                currentPlayer = p1;
            }
            else {
                currentPlayer = p2;
            }
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
