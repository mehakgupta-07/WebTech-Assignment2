package Assignment_2;

import java.util.*;

public class Q5 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        System.out.println("n   " + "n^2  " + "n^3  " + "n^4");

        for (int i = 1; i <= n; i++) {
            int var = 1;
            for (int j = 1; j <= 4; j++) {
                var *= i;
                System.out.print(var + "    ");
            }
            System.out.println();
        }
        sc.close();

    }
}
