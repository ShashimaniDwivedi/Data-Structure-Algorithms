import java.util.*;

public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of minutes: ");
        long minutes = sc.nextLong();

        long minutesInYear = 365L * 24 * 60;

        long years = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;

        long days = remainingMinutes / (24 * 60);

        System.out.println("Years: " + years);
        System.out.println("Days: " + days);
    }
}