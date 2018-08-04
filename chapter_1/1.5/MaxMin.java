import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MaxMin {
    public static void main(String[] args) {
        int minimum = StdIn.readInt();
        int maximum = minimum;

        while (!StdIn.isEmpty()) {
            int n = StdIn.readInt();
            if (n > maximum) maximum = n;
            if (n < minimum) minimum = n;
        }
        StdOut.printf("Minimum is %d, Maximum is %d\n", minimum, maximum);
    }
}