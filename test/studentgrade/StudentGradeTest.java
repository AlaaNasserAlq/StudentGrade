
package studentgrade;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlaaNasserAlq
 */
public class StudentGradeTest {
    
    private int mark;
    private String expectedResult, actualResult;
    
    public StudentGradeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("StudentGradeTest Class Begin \n");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("StudentGradeTest Class End \n");
    }
    
    @Before
    public void setUp() {
        System.out.print("Start Test Case: Mark = ");
    }
    
    @After
    public void tearDown() {
        System.out.println("End Test Case \n");
    }

    /**
     * Test of getGrade(A, B, C, D, F) methods of class StudentGrade.
     */
    @Test
    public void testGetGrade95() {
       System.out.println("95");
       mark = 95;
       expectedResult = "A";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testGetGrade85() {
       System.out.println("85");
       mark = 85;
       expectedResult = "B";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testGetGrade75() {
       System.out.println("75");
       mark = 75;
       expectedResult = "C";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testGetGrade65() {
       System.out.println("65");
       mark = 65;
       expectedResult = "D";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
    
    @Test
    public void testGetGrade55() {
       System.out.println("55");
       mark = 55;
       expectedResult = "F";
       actualResult = StudentGrade.getGrade(mark);
       assertEquals(expectedResult, actualResult);
    }
}
