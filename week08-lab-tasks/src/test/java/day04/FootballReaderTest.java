package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FootballReaderTest {

    @Test
    void testDifference() {
        FootballReader footballReader = new FootballReader();
        String file = "football.dat";
        String fileName = "src/test/resources/" + file;
        assertEquals("Aston_Villa", footballReader.findSmallestDifference(fileName));

    }

}