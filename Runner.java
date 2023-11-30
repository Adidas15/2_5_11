import java.util.Scanner;
public class Runner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Table table = new Table();
        Player p1 = new Player("Aditya");
        Player p2 = new Player("Jonathan");
        int pi;
        table.setup();
        System.out.println(table.getPieces());
        while (table.getPieces()>1) {
            System.out.println("Enter pieces: ");
            pi = sc.nextInt();
            
        }
        
    }
}
