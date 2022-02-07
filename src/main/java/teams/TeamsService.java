package teams;

import players.Player;

public class TeamsService {

    public TeamsService(){

    }

    // counting the empty spaces on team
    // return int
    // parameters; Team
    public int countEmptySpacesOnTeam(Team team){
        // temporary variable to store count
        int count = 0;
        // Loop through players array and count nulls
        for (Player player: team.getPlayers()) { // team.getplayers is going to return player objects
            // if statement
            // if player equals null add it to the count
            if(player == null){
                count++;
            }

        }

        // return count
        return count;
    }

}
