public class DiscreteDistribution {
    public static void main(String[] args) {
        int n = 0;
        for (int x = 0; x < args.length; x++) {
            n += Integer.parseInt(args[x]);
        }
        int p = (int) (Math.random() * n);

        int runningTotal = 0;
        for (int y = 0; y < args.length; y++) {
            int m = Integer.parseInt(args[y]);
            if (m + runningTotal > p) {
                System.out.println(y);
                break;
            } else {
                runningTotal += m;
            }
        }

    }
}