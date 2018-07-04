public class RollLoadedDie {
    public static void main(String[] args) {
        double die = Math.random();
        if (die >= 5.0/8.0) {
            System.out.println(6);
            return;
        }
        for (int i = 1; i < 6; i++) {
            if (die < i/8.0) {
                System.out.println(i);
                break;
            }
        }     
    }
}