package CodingTankExercises;

import java.util.Random;

public class ArrayInvertido {
    public static void main(String[] args) {
        int[] array = criarEPreencherArray();
        imprimeConteudoArray(array);
        int[] arrayInvertido = inverterPosicaoArray(array);
        imprimeConteudoArray(arrayInvertido);
    }

    public static int[] criarEPreencherArray() {
        Random random = new Random();
        return new int[]{
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
                random.nextInt(0, 100),
        };

    }
    public static void imprimeConteudoArray(int[] array) {
        System.out.print("[");
        for (int item : array) {
            System.out.print(item + ", ");
        }
        System.out.println("]");
    }
    public static int[] inverterPosicaoArray(int[] array){
        int metadeDoArray = array.length / 2;
        for (int indice = 0; indice < array.length; indice++) {
            if (indice >= metadeDoArray) {
                break;
            }

            int posicaoFinal = array.length - 1 - indice;
            int posicaoInicial = indice;

            int valorInicial = array[posicaoInicial];
            int valorFinal = array[posicaoFinal];

            array[posicaoInicial] = valorFinal;
            array[posicaoFinal] = valorInicial;
        }
        return array;
    }

}




