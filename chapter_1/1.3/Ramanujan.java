public class Ramanujan {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            int i3 = i*i*i;
            if (i3 > n) break;

            for (int j = i; j <= n; j++) { 
                int j3 = j*j*j;
                if (i3 + j3 > n) break;

                for (int k = i+1; k <= n; k++) {
                    int k3 = k*k*k;
                    if (k3 > i3 + j3) break;

                    for (int l = k; l <= n; l++) {
                        int l3 = l * l * l;
                        if (k3 + l3 > i3 + j3) break;

                        if (i3 + j3 == k3 + l3) {
                            System.out.println(i3 + j3 + " = " + i + "^3 + " + j + "^3 = " + k+ "^3 + " + l + "^3");
                        }
                    }
                }
            }
        }
    }
}