package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FootballReader {

    private String findSmallestDifference;

    public String  findSmallestDifference(String fileName) {
        List<String> fileFootball = fileRead(fileName);
        int minDifference = 1000;
        String team = "";

        for (int i = 1; i < fileFootball.size(); i++) {
            if (i == 18) {
                continue;
            }
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
}
