public class ThreeSort
{
    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        int max = Math.max(n1, Math.max(n2, n3));
        int min = Math.min(n1, Math.min(n2, n3));
        int median = n1 + n2 + n3 - max - min;

        System.out.println(min);
        System.out.println(median);
        System.out.println(max);
    }
}