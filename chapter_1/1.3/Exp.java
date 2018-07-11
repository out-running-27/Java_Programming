public class Exp {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        double epow = 0.0;
        
        for (int i = 0; i <= 10; i++){
            int fact = 1;

            for(int j = i; j > 0; j--) {
                fact *= j;
            }

            epow += Math.pow(x, i) / fact;
        }
        System.out.println("e^" + x + " = \t\t" + epow);
        System.out.println("check method: \t" + Math.exp(x));
    }
}