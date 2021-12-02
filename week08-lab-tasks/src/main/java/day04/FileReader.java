package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    private List<String> fileWeather = new ArrayList<>();

    public int findSmallestTemperatureSpread(String fileName) {
        List<String> fileWeather = fileRead(fileName);
        int maxTempDifference = 0;
        for (int i = 2; i < fileWeather.size()-1; i++) {
            int day = Integer.parseInt(fileWeather.get(i).substring(2, 4).trim());
            int max = Integer.parseInt(fileWeather.get(i).substring(6, 8).trim());
            int min = Integer.parseInt(fileWeather.get(i).substring(12, 14));
            if ((max - min) > maxTempDifference) {
                maxTempDifference = max -min;
            }
        }
        return maxTempDifference;
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

    public List<String> getFileWeather() {
        return fileWeather;
    }
}
