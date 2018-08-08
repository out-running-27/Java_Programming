import edu.princeton.cs.algs4.*;

public class Closest {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double z = Double.parseDouble(args[2]);

        double bestx = Double.NaN;
        double besty = Double.NaN;
        double bestz = Double.NaN;
        double bestDist = Double.POSITIVE_INFINITY;

        while(!StdIn.isEmpty()) {
            double x1 = StdIn.readDouble();
            double y1 = StdIn.readDouble();
            double z1 = StdIn.readDouble();

            double dist = (x - x1) * (x - x1) + (y - y1) * (y - y1) + (z - z1) * (z - z1);

            if (dist < bestDist) {
                bestx = x1;
                besty = y1;
                bestz = z1;
                bestDist = dist;
            }

        }

        StdOut.printf("Closest point = (%f, %f, %f)\n", bestx, besty, bestz);


    }
}