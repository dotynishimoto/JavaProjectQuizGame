

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StartTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StartTest
{
    private Start start1;

    /**
     * Default constructor for test class StartTest
     */
    public StartTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        start1 = new Start();
        start1.newPlayer();
        start1.run();
        start1.exportScore();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
