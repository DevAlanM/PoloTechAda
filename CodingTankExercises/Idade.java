package CodingTankExercises;

import java.time.LocalDate;
import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome");
        String nome = scanner.nextLine();
        if (nome.equalsIgnoreCase("Willian") || nome.equalsIgnoreCase("Bruno")) {
            System.out.println("Seja bem vindo(a) querido professor " + nome);
        } else {
            System.out.println("Seja bem vindo querido(a) aluno(a) " + nome);
        }

        System.out.println("Informe o ano de nascimento");
        int anoNascimento = scanner.nextInt();

        int anoAtual = LocalDate.now().getYear();
        int calculoIdade = anoAtual - anoNascimento;
        System.out.println("Informe o seu peso Inicial");
        float pesoInicial = scanner.nextFloat();
        System.out.println("Informe o seu peso Final");
        float pesoFinal = scanner.nextFloat();
        System.out.println("Informe o periodo de Meses");
        int periodoMeses = scanner.nextInt();
        float resultado = (pesoFinal - pesoInicial) / periodoMeses;


        System.out.println(nome + " sua idade é " + calculoIdade + " anos e voce perdeu "
                + resultado + " kg em " + periodoMeses + " meses");


    }
}
