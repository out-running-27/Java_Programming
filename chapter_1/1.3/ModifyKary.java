public class ModifyKary { 
    public static void main(String[] args) { 

        // read in the command-line argument
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);

        // set power to the largest power of 2 that is <= n
        int power = 1;
        while (power <= n/k) {
            power *= k;
        }
  
        // check for presence of powers of 2 in n, from largest to smallest
        while (power > 0) {

            // power is not present in n 
            if (n < power) {
                System.out.print(0);
            }

            // power is present in n, so subtract power from n
            else {
                int digit = (n / power);
                String alpha;

                switch (digit) {
                    case 10: alpha = "A";
                    break;
                    case 11: alpha = "B";
                    break;
                    case 12: alpha = "C";
                    break;
                    case 13: alpha = "D";
                    break;
                    case 14: alpha = "E";
                    break;
                    case 15: alpha = "F";
                    break;
                    default: alpha = String.valueOf(digit);
                    break;
                }

                System.out.print(alpha);
                n -= (power * digit);
            }

            // next smallest power of 2
            power /= k;
        }

        System.out.println();

    }

}