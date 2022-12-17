package CodingTankExercises;

import java.util.Scanner;

public class DescountProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o valor do seu produto");
        double vlrVenda = scanner.nextDouble();

        System.out.println("Parabéns, será aplicado um desconto de 5% no seu produto");

        double vlrDescount = vlrVenda - (vlrVenda * 0.05);
        System.out.println("O valor do produto agora é R$ " + vlrDescount);

    }
}
