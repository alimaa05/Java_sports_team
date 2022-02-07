package teams;

import managers.Manager;
import players.Player;

import java.util.Arrays;
import java.util.Objects;

public class Team {

    private Player[] players; // needs to be an array bec we know we will have several players
    private String name;
    private Manager manager; // will be able to use any class as a data type - using Manager to define property

    // default constructor
    public Team() {

    }

    public Team(
            String name,
            Manager manager) {
        this.name = name;
        this.manager = manager;
        this.players = new Player[15]; // array - do it in the constructor and create a service class
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() { // writing getter for class as data type
        return manager;
    }

    public void setManager(Manager manager){ // writing setter for class as data type
        this.manager = manager;
    }

    public Player[] getPlayers() { // writing getter for arrays
        return players;
    }

    public void setPlayers(Player[] player){  // writing setter for array
        this.players = player;
    }

    @Override
    public String toString() {
        return "Team{" +
                "players=" + Arrays.toString(players) +
                ", name='" + name + '\'' +
                ", manager=" + manager +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Arrays.equals(players, team.players) && Objects.equals(name, team.name) && Objects.equals(manager, team.manager);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, manager);
        result = 31 * result + Arrays.hashCode(players);
        return result;
    }
}
