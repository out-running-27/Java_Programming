import edu.princeton.cs.algs4.*;

public class WordCount {
    public static void main(String[] args) {
        int counter = 0;
        while (!StdIn.isEmpty()) {
             StdIn.readString();
             counter++;
        }
        StdOut.printf("There are %d words.\n", counter);
    }
}