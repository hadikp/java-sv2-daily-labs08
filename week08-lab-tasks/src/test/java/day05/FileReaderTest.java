package day05;

import day04.FileReader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    day04.FileReader fileReader;
    String fileName;
    String file;

    @BeforeEach
    void init() {
        fileReader = new FileReader();
        file = "weather.dat";
        fileName = "src/test/resources/" + file;
    }

    @Test
    void testSmallestTemperature() {
        assertEquals(14, fileReader.findSmallestTemperatureSpread(fileName));
    }

    @Test
    void testFootballDifference() {
        file = "src/test/resources/football.dat";
        assertEquals("Aston_Villa", fileReader.findSmallestDifference(file));
    }

}