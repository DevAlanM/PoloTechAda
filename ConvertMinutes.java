package ConvertendoMInuto;

import java.util.Scanner;

public class ConvertMinutes {
    public static void main(String[] args) {

        Scanner min = new Scanner(System.in);
        System.out.println("Enter how many minutes you want to convert:");
        int minInput = min.nextInt();
                                        // minutes in the year
        long minToYear = (long) (minInput / 525600f);
        int minToDay = (minInput / (60 * 24)) % 365;

        System.out.println("The result is: " + minToYear + " years and " + minToDay + " days");
    }
}