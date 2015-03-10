
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class BasicExercisesIntegrationTests{


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Before
    public void before(){
        setUpStreams();
    }

    public String getOutput(){
        return outContent.toString();
    }

    @Test
    public void testEasiestExerciseEver(){
        BasicExercises basicExercises = new BasicExercises();
        basicExercises.easiestExerciseEver();
        assertEquals(getOutput(), "*\n");
    }

    @Test
    public void testHorizontalLine(){
        BasicExercises basicExercises = new BasicExercises();
        basicExercises.horizontalLine(8);
        assertEquals(getOutput(), "********\n");
    }

    @Test
    public void testVerticalLine(){
        BasicExercises basicExercises = new BasicExercises();
        basicExercises.verticalLine(3);
        assertEquals(getOutput(), "*\n*\n*\n");
    }

    @Test
    public void testRightTriangle(){
        BasicExercises basicExercises = new BasicExercises();
        basicExercises.rightTriangle(3);
        assertEquals(getOutput(), "*\n**\n***\n");
    }

    @Test
    public void testIsoscelesTriangle(){
        BasicExercises basicExercises = new BasicExercises();
        basicExercises.isoscelesTriangle(3);
        assertEquals(getOutput(), "*\n***\n*****\n");
    }

    @Test
    public void testDiamond(){
        BasicExercises basicExercises = new BasicExercises();
        basicExercises.diamond(3);
        assertEquals(getOutput(), "*\n***\n*****\n***\n*\n");
    }


    @Test
    public void testDiamondName(){
        BasicExercises basicExercises = new BasicExercises();
        basicExercises.diamondName(3, "Roger Ramjet");
        assertEquals(getOutput(), "*\n***\nRoger Ramjet\n***\n*\n");
    }

    @Test
    public void testFizzBuzz(){
        BasicExercises basicExercises = new BasicExercises();
        basicExercises.fizzBuzz();
        String firstFourteenLines = getOutput().substring(0,getOutput().indexOf("14")+3);
        assertEquals(firstFourteenLines, "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\n");
    }

    @Test
    public void testPrimeFactors(){
        BasicExercises basicExercises = new BasicExercises();
        basicExercises.getPrimeFactors(1);
        assertEquals(getOutput(), "");
        String primeFactors = basicExercises.getPrimeFactors(30);
        assertEquals(primeFactors, "2,3,5");
    }

}
