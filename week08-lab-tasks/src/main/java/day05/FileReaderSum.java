package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReaderSum {

    public String  findSmallestDifference(String fileName) {
        List<String> fileFootball = fileRead(fileName);
        List<String> fileFiltrateList = filtrate(fileFootball, Arrays.asList(0, 18));
        int minDifference = 1000;
        String team = "";

        for (int i = 0; i < fileFootball.size(); i++) {
            int F = Integer.parseInt(fileFootball.get(i).substring(43, 45).trim());
            int A = Integer.parseInt(fileFootball.get(i).substring(50, 52).trim());
            String  teamList = fileFootball.get(i).substring(7, 23).trim();

            int difference = Math.abs(F - A);
            if ((difference) < minDifference) {
                minDifference = difference;
                team = teamList;
            }

        }
        return team;
    }

    public int findSmallestTemperatureSpread(String fileName) {
        List<String> fileWeather = fileRead(fileName);
        List<String> fileFiltrateList = filtrate(fileWeather, Arrays.asList(0, 1, 32));

        int minDay = 0;

       for (int i = 0; i < fileFiltrateList.size(); i++) {

           int day = Integer.parseInt(fileFiltrateList.get(i).substring(2, 4).trim());
           int max = makeData(fileFiltrateList, i, new Position(6, 8));
           int min = makeData(fileFiltrateList, i, new Position(12, 14));

           Difference diff = new Difference(max, min);
           int spread = diff.maxMinusMin();
           SearchMin searchMin = new SearchMin(spread, day);
           int searchM = searchMin.searcMinToDay();
           minDay = day;
        }
        return minDay;
    }

    private int makeData(List<String> fileFiltrateList, int i, Position pos) {
        int maxOrMin = Integer.parseInt(fileFiltrateList.get(i).substring(pos.getX1(), pos.getX2()).trim());
        return maxOrMin;
    }

    private List<String> fileRead(String fileName) {
        List<String> fileList = new ArrayList<>();
        try {
            fileList = Files.readAllLines(Paths.get(fileName));
        }
        catch (IOException ioe) {
            throw new IllegalArgumentException("Nem tudtam beolvasni a filet!", ioe);
        }
        return fileList;
    }

    private List<String> filtrate(List<String> fileWeather, List<Integer> numbers) {
        List<String> fileFiltrateList = new ArrayList<>();
        for (int i = 0; i < fileWeather.size(); i++) {
                if (numbers.contains(i)) {
                    continue;
                }
                fileFiltrateList.add(fileWeather.get(i));
        }
        return fileFiltrateList;
    }
}
