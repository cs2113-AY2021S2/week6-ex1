import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

import java.io.*;

public class TestMain {

    @Test
    public void testOutput() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(bos));

        // action
        Main.main(null);

        String output = "Adding numbers to the list\n[3]\n[3, 8]\n[3, 8, 24]\nThe total is: 35\n8 in the list : true\n5 in the list : false\n[3, 24]\nThe total is: 27";
        // assertion
        assertTrue(bos.toString().equals(output) || bos.toString().equals(output + "\n"));

        // undo the binding in System
        System.setOut(originalOut);
    }
}
