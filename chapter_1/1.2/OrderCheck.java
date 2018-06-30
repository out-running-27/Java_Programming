public class OrderCheck
{
    public static void main(String[] args) {
        Double x = Double.parseDouble(args[0]);
        Double y = Double.parseDouble(args[1]);
        Double z = Double.parseDouble(args[2]);

        System.out.println(x < y && y < z || z < y && y < x);
    }
}