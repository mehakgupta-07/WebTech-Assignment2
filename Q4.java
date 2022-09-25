package Assignment_2;

public class Q4 {
    public static void main(String[] args) throws Exception {

        int population = 80000;
        int year = 0;
        while (population <= 150000) {
            // population= population + (1/20)*population
            population += (population / 20);
            year++;
        }
        System.out.println(year);

    }
}
