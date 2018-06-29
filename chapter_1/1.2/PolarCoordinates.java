
/***
 * Compilation:     javac PolarCoordinates.java
 * Execution:       java PolarCoordinates x y
 * 
 * Given two points on the cartesian plane, x and y,
 * print the polar coordinates r and theta
 * 
 ***/

class PolarCoordinates
{
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt((x*x) + (y*y));
        double theta = Math.atan2(y, x);

        System.out.println("the radius r = " + r);
        System.out.println("the angle theta = " + theta);
    }
}