public class LogLevels {

    public static String message(String logLine) {
        return logLine.split("]: ")[1].trim();
    //throw new UnsupportedOperationException("Please implement the (static) LogLevels.message() method");
    }

    public static String logLevel(String logLine) {
        return logLine.split("]: ")[0].substring(1).toLowerCase();
        // throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
//        throw new UnsupportedOperationException("Please implement the (static) LogLevels.reformat() method");
    }
}
