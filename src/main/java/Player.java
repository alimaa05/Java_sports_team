import java.util.Objects;

public class Player {

    // Properties
    private String name;
    private String position;
    private int number;
    private int contractLength;
// needs to be private access modifier bec we don't want the user or someone to be able to change them etc.
// we should put them as private unless there's a specific reason for not doing so


    // Constructor
     public Player(
             String name,
             String position,
             int number,
             int contractLength){
         this.name = name;
         this.position =position;
         this.number = number;
         this.contractLength = contractLength;
     }
     // the values you assign in the constructor will be applied for specific objects you  create

    //default constructor
    public Player(){}
    // takes no parameters and has no constructors

    // Getters & Setters - for each of our properties
    // getters are methods specifically for POJOs
    // Encapsulation - the properties of a class
    // are only accessible within that class but can only be accessible elsewhere through te methods we created
    public String getName(){
         return name;
    }

    public String getPosition(){
         return position;
    }

    public int getNumber(){
         return number;
    }

    public int getContractLength(){
         return contractLength;
    }

    public void setName(String name){
         this.name = name;
    }
    // void because we're not going to return anything
    // getting a property (this.name) updating it new value

    public void setPosition (String position){
         this.position = position;
    }

    public void setNumber(int number){
         this.number = number;
    }

    public void setContractLength(int contractLength){
         this.contractLength = contractLength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number=" + number +
                ", contractLength=" + contractLength +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return number == player.number && contractLength == player.contractLength && Objects.equals(name, player.name) && Objects.equals(position, player.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, number, contractLength);
    }
}

