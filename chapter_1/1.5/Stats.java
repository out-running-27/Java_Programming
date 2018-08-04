import edu.princeton.cs.algs4.*;

public class Stats {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double[] points = new double[n];
        double total = 0.0;

        for (int i = 0; i < n; i++) {
            double p = StdIn.readDouble();
            points[i] = p;
            total += p;
        }

        double avg = total / n;
        double MSE = 0.0;

        for (double point : points) {
            MSE += Math.pow(point - avg, 2);
        }

        StdOut.printf("The mean is %f, the std is %f\n", avg, Math.sqrt(MSE/(n-1)));
    }
}