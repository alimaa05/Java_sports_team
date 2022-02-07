import pojos.Manager;
import pojos.Player;
import pojos.Team;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Finn Russell", "Fly Half", 10, 10);
        Player player2 = new Player("Finn Russell", "Fly Half", 10, 10);

//        System.out.println(player);
        // this will print numerical hashcode that rep that specific position of player object
        System.out.println(player.toString());
        System.out.println("------------");
        // the default of @override .toString gives us the readable, specific implementation of it

        System.out.println(player == player2);
        // this will print false because its two different objects
        System.out.println("------------");

        System.out.println(player.equals(player2));
        // this is checking equality by checking whether that have the same stuff inside them
        System.out.println("------------");

        Manager manager = new Manager("Gregor Townsend");

        Team scotland = new Team("scotland", manager);

        System.out.println(scotland.toString());
        System.out.println("------------");

        Manager manager1 = new Manager("Gregor Townsend");

        Team england = new Team("England", manager);

        System.out.println(england.toString());
        System.out.println("------------");


    }
}
