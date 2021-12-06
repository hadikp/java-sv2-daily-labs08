package day05;

public class SearchMin {

    private int spread;
    private int minDifference;

    public SearchMin(int spread, int minDifference) {
        this.spread = spread;
        this.minDifference = minDifference;
    }

    public int searcMinToDay() {
        int minDifference = 1000;
        if (spread < minDifference) {
            minDifference = spread;
        }
        return minDifference;
    }
}
