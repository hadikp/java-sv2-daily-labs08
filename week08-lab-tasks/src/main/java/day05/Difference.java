package day05;

public class Difference {

    private int max;
    private int min;

    public Difference(int max, int min) {
        this.max = max;
        this.min = min;
    }

    public int maxMinusMin() {
        int spread = Math.abs(max - min);
        return spread;
    }
}
