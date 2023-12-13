public class PlayerRatingTester {
    public static void main(String[] args) {
        // Test for two critics
        PlayerRating player1 = new PlayerRating(1, "Beckham", 9, 9.9);
        player1.displayDetails();

        System.out.println();

        // Test for three critics
        PlayerRating player2 = new PlayerRating(1, "Oscar", 1, 1, 1);
        player2.displayDetails();
    }
}