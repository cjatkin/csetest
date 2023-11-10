import org.junit.After;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.assertEquals;
import junit.runner.Version;
public class StackTest {

        @After
        public void tearDown()
        {
                System.out.println("this is a teardown");
        }

        @Test
        public void testPush()
        {
                Stack s = new Stack();
                s.push(1);
                assertEquals(1, s.size());
                System.out.println("JUnit version is: " + Version.id());
        }

        @Test
        public void testEmpty()
        {
                Stack s = new Stack();
                assertEquals(0, s.size());
        }

}

