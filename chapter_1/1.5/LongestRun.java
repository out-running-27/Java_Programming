import edu.princeton.cs.algs4.*;

public class LongestRun {
    public static void main(String[] args) {
        int runCounter = 1;
        int lastNum = StdIn.readInt();
        int maxRun = 1;
        int maxRunNum = lastNum;

        while (!StdIn.isEmpty()) {
            int currentNum = StdIn.readInt();

            if (lastNum == currentNum) {
                runCounter++;
                if (runCounter > maxRun) {
                    maxRun = runCounter;
                    maxRunNum = currentNum;
                }
            }
            else {
                lastNum = currentNum;
                runCounter = 1;
            }
        }

        StdOut.printf("Longest Run: %d consuctive %d's.\n", maxRun, maxRunNum);

    }
}