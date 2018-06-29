public class compound_interest
{
    public static void main(String[] args)
    {
        // calculates continuously compounded interest Pe^(rt)
        double p = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);
        double fv = p * Math.pow(Math.E, r * t);

        System.out.println(fv);
    }
}