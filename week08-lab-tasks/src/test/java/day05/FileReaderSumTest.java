package day05;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderSumTest {

    FileReaderSum fileReaderSum;
    String fileName;

    @BeforeEach
    void init() {
        fileReaderSum = new FileReaderSum();
        fileName = "src/test/resources/weather.dat";
    }

    @Test
    void testFindSmallestTemperatureSpread() {
        //assertEquals(14, fileReaderSum.findSmallestTemperatureSpread("src/test/resources/weather.dat"));
        System.out.println(fileReaderSum.findSmallestTemperatureSpread(fileName));

    }

}