package learn.goit.unittest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParserTest {

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After each");
    }

    @Test
    void parse() {
        //given
        Parser parser = new Parser ('-');
        String toParse = "one-two-three";
        String [] expecting = {"one","two","three"};
        //when
        String [] result = parser.parse(toParse);
        //then
        assertArrayEquals(result,expecting,"Array nat ikvals");
    }
}