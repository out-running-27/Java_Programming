public class MercatorProjection
{
    public static void main(String[] args) {
        double lambda = Double.parseDouble(args[0]);
        double latitude = Double.parseDouble(args[1]);
        double longitude = Double.parseDouble(args[2]);

        double x = longitude - lambda;
        double y = (1/2) * Math.log((1.0 + Math.sin(latitude)) / (1.0 - Math.sin(latitude)));

        System.out.println("x = " + x + ", y = " + y);
    }
}