public class Birthday {
    public static void main(String[] args) {
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
        System.out.println("After " + counter + " people, two share a birthday.");
    }
}