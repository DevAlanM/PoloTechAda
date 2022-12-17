package CodingTankExercises;

import java.util.Random;

public class Matriz {

    public static void main(String[] args) {
        //declaração de matriz
        //tipo[linhas][colunas] nome = valor
        int[][] matrizDeInteiros = new int[3][];

        //Adicionar valor a matriz (numeros impares)
        matrizDeInteiros[0] = new int[5];
        matrizDeInteiros[0][0] = 1;
        matrizDeInteiros[0][1] = 3;
        matrizDeInteiros[0][2] = 5;
        matrizDeInteiros[0][3] = 7;
        matrizDeInteiros[0][4] = 9;

        //Adicionar valor a matriz (numeros pares)
        matrizDeInteiros[1] = new int[5];
        matrizDeInteiros[1][0] = 0;
        matrizDeInteiros[1][1] = 2;
        matrizDeInteiros[1][2] = 4;
        matrizDeInteiros[1][3] = 6;
        matrizDeInteiros[1][4] = 8;

        //Adicionar valor a matriz (numeros primos)
        matrizDeInteiros[2] = new int[4];
        matrizDeInteiros[2][0] = 1;
        matrizDeInteiros[2][1] = 3;
        matrizDeInteiros[2][2] = 5;
        matrizDeInteiros[2][3] = 7;
        imprimirMatriz(matrizDeInteiros);

        //Mesmos valores que a matrizDeInteiros
        int[][] novaMatrizDeInteiros = {
                {1, 3, 5, 7, 9},
                {0, 2, 4, 6, 8}
        };
        System.out.println("-------- CodingTankExercises.Matriz aleatoria ------");
        int[][] matrizAleatoria = new int[10][10];
        preencheMatriz(matrizAleatoria);
        imprimirMatriz(matrizAleatoria);
        encontraValores(matrizAleatoria);
    }

    public static void imprimirMatriz(int[][] matriz) {
        //matriz.length me entrega quantas linhas eu tenho
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            //valorLinha.length me entrega a quantidade de valorLinha dentro da linha
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                int valorLinhaColuna = valorLinha[coluna];
                System.out.print("[" + valorLinhaColuna + "]");
            }
            System.out.println();
        }
    }

    public static void preencheMatriz(int[][] matriz) {

        Random random = new Random();
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                valorLinha[coluna] = random.nextInt(0, 1000);
            }
        }
    }

    public static void encontraValores(int[][] matriz) {
        int maiorNumeroEncontrado = -1;
        int menorNumeroEncontrado = 1001;
        int quantidadePosicoesPreenchidas = 0;
        int somaDosValores = 0;
        for (int linha = 0; linha < matriz.length; linha++) {
            int[] valorLinha = matriz[linha];
            for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                int valorLinhaColuna = valorLinha[coluna];
                if (valorLinhaColuna < menorNumeroEncontrado) {
                    menorNumeroEncontrado = valorLinhaColuna;
                }
                if (valorLinhaColuna > maiorNumeroEncontrado) {
                    maiorNumeroEncontrado = valorLinhaColuna;
                }
                quantidadePosicoesPreenchidas++;
                somaDosValores += valorLinhaColuna;
            }
        }
        double mediaSimples = (double) somaDosValores / quantidadePosicoesPreenchidas;
        System.out.println("O maior valor encontrado foi: " + maiorNumeroEncontrado
                + ", o menor valor encontrado foi: " + menorNumeroEncontrado
                + ", a média simples foi: " + mediaSimples);
    }
}



