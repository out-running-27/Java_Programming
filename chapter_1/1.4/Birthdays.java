public class Birthdays {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] trials = new int[n];

        for (int i = 0; i < n; i++) {
            int[] d = new int[365];
            int counter = 0;

            while (true) {
                counter++;
                int r = (int) (Math.random() * 364);

                if (d[r] == 0) {
                    d[r]++;
                } else {
                    break;
                }
            }
            trials[i] = counter;
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += trials[i];
        }

        double avg = ((double) sum) / n;

        System.out.println("On Average, after " + avg + " people, two share a birthday.");
    }
}