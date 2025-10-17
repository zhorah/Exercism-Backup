import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (square <= 0 || square > 64) throw new IllegalArgumentException("square must be between 1 and 64");
        return BigInteger.TWO.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        BigInteger grainsOnBoard = new BigInteger("0");
        for (int i = 1; i < 65; i++) {
            grainsOnBoard = grainsOnBoard.add(grainsOnSquare(i));
        }
        return grainsOnBoard;
    }

}
