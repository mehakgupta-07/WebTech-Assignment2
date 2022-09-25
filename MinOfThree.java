package Assignment_2;

public class MinOfThree {
    public static void main(String[] args) throws Exception {

        int num1 = 20, num2 = 16, num3 = 5;

        if (num1 < num2 && num1 < num3) {
            System.out.println(num1);

        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2);

        } else {
            System.out.println(num3);

        }

    }
}
