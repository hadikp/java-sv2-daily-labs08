package day01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class NumberSequence {

    private List<Integer> intList = new ArrayList<>();

    public NumberSequence(List<Integer> intList) {
        this.intList = intList;
    }

    public NumberSequence(int numberOfPiece, int min, int max) {
        Random rnd = new Random();
        for (int i = 0; i < numberOfPiece; i++) {
            int number = rnd.nextInt(max-min+1) + min;
            intList.add(number);
        }
    }

    public double makeAverage() {
        double sum = 0;
        for (int i: intList) {
             sum += i;
        }
        return sum / intList.size();
    }

    public List<Integer> closeToAverage(int value) {
        List<Integer> resulList = new ArrayList<>();
        double average = makeAverage();
        System.out.println(average);
        for (int i: intList) {
            if (Math.abs(i - average) < value) {
                resulList.add(i);
            }
        }
        return resulList;
    }

    public List<Integer> getIntList() {
        return intList;
    }
}
