import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.*;

public class TestMain {

    @Test
    public void testCO2GraphOutput() throws IOException {
        // Capture System.out output
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream oldOut = System.out;
        System.setOut(new PrintStream(output));

        // Run Main
        Main.main(new String[]{});

        // Restore System.out
        System.setOut(oldOut);

        String out = output.toString();

        // Check that header is correct
        assertTrue(out.contains("Year                CO\u2082 in Atmosphere (ppm)"), 
            "Header does not match expected output.");

        // Check first year CO2
        assertTrue(out.contains("2001 🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 371.32"),
            "First year bar is incorrect.");

        // Check last year CO2
        assertTrue(out.contains("2020 🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢🛢 414.24"),
            "Last year bar is incorrect.");

        // Check growth calculation
        assertTrue(out.contains("From 2001 to 2020, the average atmospheric CO\u2082 levels across the globe has grown 42.92 ppm."),
            "Growth calculation is incorrect.");
    }
}