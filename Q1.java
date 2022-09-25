package Assignment_2;

import java.util.*;

public class Q1 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter score:");
        double score = sc.nextDouble();

        if (score >= 80 && score <= 90) {
            score += 5;
        }
        System.out.println("New score: " + score);

        sc.close();

    }
}
