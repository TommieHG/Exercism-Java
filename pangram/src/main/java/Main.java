public class Main {
    public static void main(String[] args) {
        PangramChecker test = new PangramChecker();

        System.out.println(test.isPangram("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(test.isPangram("the quick brown fox jumps over the lazy dog"));
        System.out.println(test.isPangram("a quick movement of the enemy will jeopardize five gunboats"));

    }
}
