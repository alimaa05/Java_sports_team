package teams;

import managers.Manager;
import org.junit.jupiter.api.Test;
import players.Player;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TeamsServiceTest {

    @Test
    public void canCountEmptySpacesOnTeamWhenEmpty() {
        // Given
        Manager manager = new Manager("test manager");
        Team team = new Team("team1",manager);
        TeamsService underTest = new TeamsService();

        // When
        int actual = underTest.countEmptySpacesOnTeam(team);
        // data type, followed by placeholder name 'actual' equals underTest (variable name of TestService class)
        // .countEmptySpacesOnTeam i.e. calling on the method we are testing

        //Then
        // state the expected value
        int expected =15;
        // assert that the actual is equal to what you expected
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void canCountEmptySpacesWithOnePlayer(){
        // Given
        Manager manager = new Manager("test manager");
        Team team = new Team("team RFC",manager);
        Player player = new Player("test player", "winder", 12, 2);
        TeamsService underTest = new TeamsService();
        // add a single player as we haven't tested the addPlayerToTeam method yet
        team.getPlayers()[0] = player;

        // this was done before as alternative for not testing addPlayerToTeam method
//        try {
//            underTest.addPlayerToTeam(team, player);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //When
       int actual = underTest.countEmptySpacesOnTeam(team);

        //Then
        int expected = 14;
        assertThat(actual).isEqualTo(expected);
    }
}