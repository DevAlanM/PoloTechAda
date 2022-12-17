package CodingTankExercises;

import java.util.Scanner;

public class DiscountStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o tipo do seu produto");
        System.out.println("1 - Calça");
        System.out.println("2 - Bota");
        System.out.println("3 - Blusa");
        System.out.println("4 - Cachecol");
        int optionProducts = scanner.nextInt();

        System.out.println("Informe o valor do seu produto");
        double vlrVenda = scanner.nextDouble();
        switch (optionProducts) {
            case 1:
                System.out.println("Parabéns, será aplicado um desconto de 10% na sua calça");
                double vlrDisc10 = vlrVenda - (vlrVenda * 0.10);
                System.out.println("O valor com o desconto aplicado é de R$ " + vlrDisc10);
                break;
            case 2:
                System.out.println("Parabéns, será aplicado um desconto de 20% na sua bota");
                double vlrDisc20 = vlrVenda - (vlrVenda * 0.20);
                System.out.println("O valor com o desconto aplicado é de R$ " + vlrDisc20);
                break;
            case 3, 4:
                System.out.println("Parabéns, será aplicado um desconto de 40% no seu produto");
                double vlrDisc40 = vlrVenda - (vlrVenda * 0.40);
                System.out.println("O valor com o desconto aplicado é de R$ " + vlrDisc40);
                break;

                default:
                System.out.println("O produto não terá desconto, portanto o valor será o mesmo");
                    double totalValue = vlrVenda;
                    System.out.println("O valor do produto é de R$ " + totalValue);
                break;
        }

    }
}
