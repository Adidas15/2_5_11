public class Runner {

    public static void main(String[] args) {
        Table table = new Table();
        Player p1 = new Player("Aditya");
        Player p2 = new Player("Jonathan");
        table.setup();
        System.out.println(table.getPieces());
    }
}
