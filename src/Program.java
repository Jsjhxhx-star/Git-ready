public class Program {
    public static void main(String[] args) {
        // Goal: Simulate rolling a six-sided die and display the result
        int dieRoll = (int) (Math.random() * 6) + 1;
        System.out.println("You rolled a " + dieRoll + "!");
    }
}
