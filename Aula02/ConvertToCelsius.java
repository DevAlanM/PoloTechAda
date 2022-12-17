package Aula02;

import java.util.Scanner;

public class ConvertToCelsius {

    public static void convertDegree() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fº: ");
        double tempfah = scanner.nextDouble();
        double tempCelsius = ((tempfah - 32) * 5)/ 9;

        System.out.printf("A temperatura em Fº é : %.2f, transformando em Cº é : %.2f ", tempfah, tempCelsius);
    }
}