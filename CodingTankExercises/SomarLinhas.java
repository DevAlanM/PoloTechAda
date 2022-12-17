package CodingTankExercises;

import java.util.Random;
import java.util.Scanner;

public class SomarLinhas {

    public static void main(String[] args) {
        int tamanho = obterTamanho();
        int[][] quadrado = gerarMatrizQuadrada(tamanho);
        imprimirMatriz(quadrado);
        int[] somaLinhas = somatorioPorLinha(quadrado);
        int[] somaColunas = somatorioPorColuna(quadrado);

        int maiorLinha = encontrarPosicaoMaiorValorArray(somaLinhas);
        int maiorColuna = encontrarPosicaoMaiorValorArray(somaColunas);

        System.out.println("A linha com maior soma é a linha número " + maiorLinha +
                " e a soma foi de " + somaLinhas[maiorLinha]);
        System.out.println("A coluna com maior soma é a coluna número " + maiorColuna + " e a soma foi de " + somaColunas[maiorColuna]);

    }
        private static int obterTamanho() {
            Scanner entrada = new Scanner(System.in);
            int tamanho;
            do {
                System.out.println("Digite o tamanho da matriz quadrada.");
                tamanho = entrada.nextInt();
            } while (tamanho < 0);
            return tamanho;
        }

        private static int[][] gerarMatrizQuadrada( int tamanho){
            int[][] matrizQuadrada = new int[tamanho][tamanho];
            for (int i = 0; i < tamanho; i++) {
                for (int j = 0; j < tamanho; j++) {
                    matrizQuadrada[i][j] = new Random().nextInt(10);
                }
            }
            return matrizQuadrada;

        }

        private static void imprimirMatriz( int[][] matriz){
            // matriz.length me entrega quantas linhas eu tenho
            for (int linha = 0; linha < matriz.length; linha++) {
                int[] valorLinha = matriz[linha];
                // valorLinha.length me entrega a quantidade de valorLinha dentro da linha
                for (int coluna = 0; coluna < valorLinha.length; coluna++) {
                    int valorLinhaColuna = valorLinha[coluna];
                    System.out.print("[" + valorLinhaColuna + "]");
                }
                System.out.println();
            }
        }

        private static int[] somatorioPorLinha( int[][] matriz){

            int[] somaLinhas = new int[matriz.length];

            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    somaLinhas[linha] += matriz[linha][coluna];
                }
                System.out.println(somaLinhas[linha]);
            }

            return somaLinhas;
        }

        public static int[] somatorioPorColuna(int[][] matriz) {

        int[] somaColunas = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            int somaColuna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                somaColuna += matriz[j][i];
            }
            somaColunas[i] = somaColuna;
        }
        return somaColunas;
    };


        public static int encontrarPosicaoMaiorValorArray(int[] array) {
        int maiorValor = 0;
        int linha = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maiorValor) {
                maiorValor = array[i];
                linha = i;
            }
        }

        return linha;
    }
}


