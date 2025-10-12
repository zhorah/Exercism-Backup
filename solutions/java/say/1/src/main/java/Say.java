public class Say {
    private final String[] smallNumbers = {"zero", "one", "two", "three", "four",
        "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen",
        "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private final String[] bigNumbers = {"", "", "twenty", "thirty", "forty", "fifty",
        "sixty", "seventy", "eighty", "ninety"};
    public String say(long number) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        if (number < 0 || number > 999_999_999_999L) {
            throw new IllegalArgumentException("number should be between 0 and 999,999,999");
        } else if (number < 20) {
            return smallNumbers[(int) number];
        } else if (number < 100) {
            return bigNumbers[(int) number / 10] +
                    (number % 10 == 0 ? "" : "-" + smallNumbers[(int) number % 10]);
        } else if (number < 1000) {
            return smallNumbers[(int) number / 100] + " hundred" +
                    ((number % 100) / 10 == 0 ? "" : " " + say(number % 100));
        } else if (number < 1_000_000) {
            return say(number / 1000) + " thousand" +
                    (number % 1000 == 0 ? "" : " " + say(number % 1000));
        } else if (number < 1_000_000_000) {
            return say(number / 1_000_000) + " million" +
                    (number % 1_000_000 == 0 ? "" : " " + say(number % 1_000_000));
        } else {
            return say(number / 1_000_000_000L) + " billion" +
                    (number % 1_000_000_000L == 0 ? "" : " " + say(number % 1_000_000_000L));
        }
    }
}
