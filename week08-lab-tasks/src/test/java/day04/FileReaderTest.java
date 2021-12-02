package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class FileReaderTest {

    @Test
    void testFileReader() {
        FileReader fileReader = new FileReader();
        String fileName = "src/test/resources/weather.dat";
        System.out.println( fileReader.findSmallestTemperatureSpread(fileName));

    }

}