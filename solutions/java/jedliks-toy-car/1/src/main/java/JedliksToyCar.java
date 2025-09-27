public class JedliksToyCar {
    private int distanceDriven = 0;
    private int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        //throw new UnsupportedOperationException("Please implement the (static) JedliksToyCar.buy()  method");
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.distanceDisplay()  method");
        return "Driven " + distanceDriven + " meters";
    }

    public String batteryDisplay() {
        //throw new UnsupportedOperationException("Please implement the JedliksToyCar.batteryDisplay()  method");
        if (batteryPercentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + batteryPercentage + "%";
    }

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the JedliksToyCar.drive()  method");
        if (batteryPercentage == 0) {
            return;
        }
        distanceDriven += 20;
        batteryPercentage -= 1;
    }
}
