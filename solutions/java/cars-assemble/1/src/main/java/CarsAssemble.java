public class CarsAssemble {

    public double productionRatePerHour(int speed) {
//        throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRatePerHour() method");
        if (speed >= 1 && speed <= 4) {
            return 221 * speed;
        } else if (speed >= 5 && speed <= 8) {
            return .9 * 221 * speed;
        } else if (speed == 9) {
            return .8 * 221 * speed;
        } else {
            return .77 * 221 * speed;
        }
    }

    public int workingItemsPerMinute(int speed) {
//        throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
        return (int) Math.floor(productionRatePerHour(speed)/60);
    }
}
