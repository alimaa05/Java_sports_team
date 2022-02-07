public class Main {

    public static void main(String[] args) {
        Player player = new Player("Finn Russell", "Fly Half", 10, 10);
//        System.out.println(player);
        // this will print numerical hashcode that rep that specific position of player object
        System.out.println(player.toString());
        // the default of @override .toString gives us the readable, specific implementation of it

    }
}
