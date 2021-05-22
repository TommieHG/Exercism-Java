import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {

    static List<Signal> calculateHandshake(int number) {

        List<Signal> secretHandshake = new ArrayList<>();

        //a reversed string of a binary number. Easier to work with in for loop below.
        String binary = new StringBuffer(Integer.toBinaryString(number)).reverse().toString();

        //a for loop that checks that the indices are right, exists and so forth
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1' && i == 0) {
                secretHandshake.add(Signal.WINK);
            }
            if (binary.charAt(i) == '1' && i == 1) {
                secretHandshake.add(Signal.DOUBLE_BLINK);
            }
            if (binary.charAt(i) == '1' && i == 2) {
                secretHandshake.add(Signal.CLOSE_YOUR_EYES);
            }
            if (binary.charAt(i) == '1' && i == 3) {
                secretHandshake.add(Signal.JUMP);
            }
            if (binary.charAt(i) == '1' && i == 4) {
                Collections.reverse(secretHandshake);
            }
        }

        return secretHandshake;
    }
}
