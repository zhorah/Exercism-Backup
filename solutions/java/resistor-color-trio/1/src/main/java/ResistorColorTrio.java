class ResistorColorTrio {
    ResistorColor rc = new ResistorColor();

    String label(String[] colors) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String digits = "";
        for (String color : colors) {
            digits = digits.concat(Integer.toString(rc.colorCode(color)));
        }
        String digitsFinal = digits.substring(0, 2);
        int base = Integer.parseInt(digitsFinal);
        int exponent = Integer.parseInt(digits.substring(2,3));
        if (exponent < 2) {
            return (int) (base * Math.pow(10, exponent)) + " ohms";
        } else if (exponent >= 2 && exponent < 5) {
            return (int) (base * Math.pow(10, exponent - 3)) + " kiloohms";
        } else if (exponent >= 5 && exponent < 8) {
            return (int) (base * Math.pow(10, exponent - 6)) + " megaohms";
        } else if (exponent >= 8) {
            return (int) (base * Math.pow(10, exponent - 9)) + " gigaohms";
        } else return "blah";
    }
}
