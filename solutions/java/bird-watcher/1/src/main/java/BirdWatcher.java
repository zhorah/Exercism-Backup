
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getLastWeek() method");
        return new int[] {0, 2, 5, 3, 7, 8 ,4};
    }

    public int getToday() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getToday() method");
        return birdsPerDay[6];
    }

    public void incrementTodaysCount() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.incrementTodaysCount() method");
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.hasDayWithoutBirds() method");
        for (int day : birdsPerDay) {
            if (day == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getCountForFirstDays() method");
        int count = 0;
        if(numberOfDays >= 7) {
            for (int day : birdsPerDay) {
                count += day;
            }
        } else {
            for (int i = 0; i < numberOfDays; i++) {
                count += birdsPerDay[i];
            }
        }
        return count;
    }

    public int getBusyDays() {
        //throw new UnsupportedOperationException("Please implement the BirdWatcher.getBusyDays() method");
        int count = 0;
        for (int day : birdsPerDay) {
            if (day >= 5) {
                count++;
            }
        }
        return count;
    }
}
