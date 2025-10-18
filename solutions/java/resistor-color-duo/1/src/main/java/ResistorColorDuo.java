
class ResistorColorDuo {
    ResistorColor rc = new ResistorColor();
    int value(String[] colors) {
       // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String digits = new String();
        for (String color: colors) {
            digits = digits.concat(Integer.toString(rc.colorCode(color)));
        }
        String digitsFinal = digits.substring(0,2);
        return Integer.parseInt(digitsFinal);
    }
}
