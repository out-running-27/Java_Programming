public class GaussianRandomNumber
{
    public static void main(String[] args) {
        Double v = Math.random();
        Double u = Math.random();

        Double r = Math.sin(2 * Math.PI * v) * Math.pow(-2 * Math.log(v), 0.5);

        System.out.println(r);
    }
}