public class UniformRandomNumbers
{
    public static void main(String[] args) {
        double n1 = Math.random();
        double n2 = Math.random();
        double n3 = Math.random();
        double n4 = Math.random();
        double n5 = Math.random();

        double avg = (n1 + n2 + n3 + n4 + n5) / 5;
        double mn = Math.min(Math.min(Math.min(Math.min(n1, n2), n3), n4), n5);
        double mx = Math.max(Math.max(Math.max(Math.max(n1, n2), n3), n4), n5);

        System.out.println("Average: " + avg);
        System.out.println("Min: " + mn);
        System.out.println("Max: " + mx);

    }
}