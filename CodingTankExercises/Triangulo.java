package CodingTankExercises;

public class Triangulo {

    public static void main(String[] args) {
        // Solicite ao usuário que informe qual o tamanho, em linhas, da piramide.
        // Com o valor informado utilize o print para desenha uma piramide com a
        // quantidade de linhas de altura que foi informada pelo usuário
        // Exemplo:
        // Caso o usuário informe 3
        //   *
        //  *
        // ***
        // Caso o usuário informe 5
        // ----*----
        // ---*---
        // --***--
        // -***-
        // ***
        int linhas = 5;
        int base = linhas * 2 - 1;
        int metadeColuna = base / 2;
        int qtdeCaracter = 1;
        for (int linha = 0; linha < linhas; linha++) {
            for (int coluna = 0; coluna < metadeColuna; coluna++) {
                System.out.print(" ");
            }
            for (int caracter = 0; caracter < qtdeCaracter; caracter++) {
                System.out.print("#");
            }
            for (int coluna = 0; coluna < metadeColuna; coluna++) {
                System.out.print(" ");
            }
            System.out.println();
            metadeColuna--;
            qtdeCaracter += 2;
        }
    }
}