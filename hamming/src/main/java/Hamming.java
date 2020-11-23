public class Hamming {

    private int hamDist;

    public Hamming(String leftStrand, String rightStrand) {
        hamDist = 0;

        //Moved validation to its own method according to auto suggestion from Exercism
        validateInput(leftStrand, rightStrand);

        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                hamDist++;
            }
        }
    }

    public int getHammingDistance() {
        return hamDist;
    }

    public void validateInput(String left, String right){
        if (left.isEmpty() && !right.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if (right.isEmpty() && !left.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (left.length() != right.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }
}
