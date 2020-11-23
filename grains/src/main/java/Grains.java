import java.math.BigInteger;

class Grains {

    private BigInteger base = BigInteger.valueOf(2); //Calculate 2^i

    BigInteger grainsOnSquare(final int square) {
        if(square < 1 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }

        return base.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i < 64; i++) {
            sum = sum.add(base.pow(i));
        }

        return sum;
    }
}
