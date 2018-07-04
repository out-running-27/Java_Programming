public class Hellos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        
        for (int i = 1; i <= n; i++) {
            if (i % 10 == 1 && (i % 100 < 10 || i % 100 > 20)) {
                System.out.print(i + "st");
            }
            else if (i % 10 == 2 && (i % 100 < 10 || i % 100 > 20)) {
                System.out.print(i + "nd");
            }
            else if (i % 10 == 3 && (i % 100 < 10 || i % 100 > 20)) {
                System.out.print(i + "rd");
            }
            else
            {
                System.out.print(i + "th");
            }
            System.out.println(" Hello");

        }
    }
}