public class FunctionGrowth {
    public static void main(String[] args) {
        for (long n = 16; n <= 2048; n *= 2) {
            System.out.print((int)Math.log(n) + "\t");
            System.out.print(n + "\t");
            System.out.print((int)(n * Math.log(n)) + "\t");
            System.out.print(n * n + "\t\t");
            System.out.print(n * n * n + "\t\t");
            System.out.print(Math.pow(2, n));
            System.out.println();
        }
            
    }
}