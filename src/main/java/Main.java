import managers.Manager;
import players.Player;
import teams.Team;
import teams.TeamsService;

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

        Team england = new Team("England", manager1);

        System.out.println(england.toString());
        System.out.println("------------");

        TeamsService teamsService = new TeamsService(); // calling on TeamService and creating a new object

        // new variable which is equal to printing the nu of spaces on team in the team 'scotland'
        int spacesBefore = teamsService.countEmptySpacesOnTeam(scotland);

        System.out.println(spacesBefore);
//        System.out.println(teamsService.countEmptySpacesOnTeam(scotland)); // printing the nu of spaces without giving it new variable name
        System.out.println("------------");

        // calling on the adding player to the team
        teamsService.addPlayerToTeam(scotland,player);
        // printing the nu of players on the team after player is added
        int spacesAfter = teamsService.countEmptySpacesOnTeam(scotland);
        System.out.println(spacesAfter);




    }
}
