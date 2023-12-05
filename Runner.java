import java.util.Scanner; //import libraries
import java.lang.Math;
public class Runner {

    public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in); 
            Table table = new Table();
            
            System.out.println("Enter player one's name: "); //gets player 1 name
            String p1Name = sc.nextLine(); //takes player 1's name as an input
            Player p1 = new Player(p1Name); //creates player 1 object
            System.out.println("Enter player two's name: "); //gets player 2 name
            String p2Name = sc.nextLine();//takes player 2's name as an input
            Player p2 = new Player(p2Name); //creates player 2 object
            Player currentPlayer;
            int pi;
            String play = "y";
            while (play.equals("y")) { //program loop
                table.setNims();
                p1.resetPoints(); //replay
                p2.resetPoints();
                if (Math.random()>=0.50) { //sets which player goes first
                    currentPlayer = p1;
                }
                else {
                    currentPlayer = p2;
                }
                while (table.getNims()>1) { //game loop
                    System.out.println(currentPlayer.toString()); //prints out which player's turn it is
                    System.out.println("There are " + table.getNims() + " nims on the board."); //prints out # of nims
                    System.out.println("Enter nims: "); 
                    pi = sc.nextInt(); //takes player input
                    if (table.changeBoard(pi)) { //checks if the player input is valid
                        currentPlayer.addPoints(pi); //if it is, add their points
                    }
                    else {
                        System.out.println("Invalid number of nims. Try again: "); //if it isn't, ask for a new input
                        pi = sc.nextInt(); 
                        if (table.changeBoard(pi)) {
                            currentPlayer.addPoints(pi);
                        }
                        else {
                            System.out.println("Too many incorrect guesses. You have forfeited your turn. Moving on..."); //so people actually play the game
                        }
                    }     
                    if (currentPlayer.equals(p1)) { //changes turn
                        currentPlayer = p2;
                    }       
                    else {
                        currentPlayer = p1;
                    }
                }
                
                System.out.print(currentPlayer.getName() + " is the loser! "); //prints who lost
                System.out.print(currentPlayer.getName() + " had " + currentPlayer.getPoints() + " points. "); //prints who won
                System.out.println(currentPlayer.getName() + "'s wins so far: " + currentPlayer.getWins()); //prints total wins for player 1
                if (currentPlayer.equals(p1)) { //changes turn per game
                    currentPlayer = p2;
                }       
                else {
                    currentPlayer = p1;
                }
                currentPlayer.addWin(); //counts up wins
                System.out.print(currentPlayer.getName() + " is the winner!  "); //prints out wins
                System.out.print(currentPlayer.getName() + " had " + currentPlayer.getPoints() + " points. "); //prints our total scorecard
                System.out.println(currentPlayer.getName() + "'s wins so far: " + currentPlayer.getWins()); //prints out other player's wins

                System.out.println("Play again? (y/n)"); //replay?
                play = sc.next();
            }
            System.out.println("Game ended");//if no, game ends

    }
    
}