class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int pow = (int) Math.log10(numberToCheck) + 1;
        int tally = 0;
        int remainingNumber = numberToCheck;
        while (remainingNumber != 0) {
            int digit = remainingNumber % 10;
            tally += (int) Math.pow(digit,pow);
            remainingNumber /= 10;
        }
        return tally == numberToCheck;
    }

}
