package teams;

import players.Player;

public class TeamsService {

    public TeamsService() {

    }

    // counting the empty spaces on team
    // return int
    // parameters; Team
    public int countEmptySpacesOnTeam(Team team) {
        // temporary variable to store count
        int count = 0;
        // Loop through players array and count nulls
        for (Player player : team.getPlayers()) { // team.getplayers is going to return player objects
            // if statement
            // if player equals null add it to the count
            if (player == null) {
                count++;
            }
        }
        // return count
        return count;
    }

    public void addPlayerToTeam(Team team, Player player) throws Exception {
        // check if there's space on the team
        int spaces = countEmptySpacesOnTeam(team);
        // if there is, add the player
        if (spaces > 0) {
            // get players array from team
            Player[] players = team.getPlayers();
            // add player to first available empty space
            // loop through players array
            for (int i = 0; i < players.length; i++) {
                // if we find an empty array, add the player then break
                if (players[i] == null) { // if the player array is equal to null then...
                    players[i] = player; // put the player in our players array
                    break;

                }
            }
        } else {
            throw new IllegalAccessException("Team is full!");
        }

    }

}
