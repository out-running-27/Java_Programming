public class ISBN {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int checksum = 0;
        
        for (int i = 2; i <= 10; i++) {
            int r = n % 10;          
            checksum += i * r;
            n = n / 10;
        }

        System.out.print("ISBN number is " + args[0]);
        if      (checksum % 11 == 1)    System.out.println("X");
        else if (checksum % 11 == 0)    System.out.println("0");
        else                            System.out.println(11 - checksum % 11);

    }
}