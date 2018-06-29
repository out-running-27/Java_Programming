public class windChill 
{
    public static void main(String[] args) {
        double T = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        //calculate wind chill
        double wc = 35.74 + 0.6215*T+ (0.4275*T - 35.75)* Math.pow(v, 0.16);

        System.out.println("The windchill is " + wc);
    }
}