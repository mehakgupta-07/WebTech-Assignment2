package Assignment_2;

import java.util.*;

public class Q3 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month Index:");
        int index = sc.nextInt();
        switch (index) {
            case 1:
                System.out.println("Month: " + "January");
                System.out.println("Number of days: " + "31");
                break;

            case 2:
                System.out.println("Month: " + "February");
                System.out.println("Number of days: " + "28");
                break;

            case 3:
                System.out.println("Month: " + "March");
                System.out.println("Number of days: " + "31");
                break;

            case 4:
                System.out.println("Month: " + "April");
                System.out.println("Number of days: " + "31");
                break;

            case 5:
                System.out.println("Month: " + "May");
                System.out.println("Number of days: " + "31");
                break;

            case 6:
                System.out.println("Month: " + "June");
                System.out.println("Number of days: " + "30");
                break;

            case 7:
                System.out.println("Month: " + "July");
                System.out.println("Number of days: " + "31");
                break;

            case 8:
                System.out.println("Month: " + "August");
                System.out.println("Number of days: " + "31");
                break;

            case 9:
                System.out.println("Month: " + "September");
                System.out.println("Number of days: " + "30");
                break;

            case 10:
                System.out.println("Month: " + "October");
                System.out.println("Number of days: " + "31");
                break;

            case 11:
                System.out.println("Month: " + "November");
                System.out.println("Number of days: " + "30");
                break;

            case 12:
                System.out.println("Month: " + "December");
                System.out.println("Number of days: " + "31");
                break;

            default:
                System.out.println("Not a valid index");

        }
        sc.close();

    }
}
