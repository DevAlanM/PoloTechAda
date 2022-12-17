package CodingTankExercises;

import java.util.Random;

public class Arrays {
    public static void main(String[] args) {
        //Array == coleção de informações heterogeneas ou homogeneas
        // Array sempre começa a contar da posição 0
        // Array com tamanho 2 tem posição 0 e 1

        //for (int indice = 0; indice <= args.length; indice++) {
        //    String arg = args[indice];
        //   System.out.println(arg);
        // }

        //int[] idades = {33, 25, 20, 16, 26, 17};
        //double[] salarios = {35.5, 1212.4, 2424.8};
        //String[] nomes = {"William", "Bruno", "Alan"};

        // String[] alunos = new String[3];
        //atribuindo valor a uma posição de array
        //alunos[0] = "Alan";
        //alunos[1] = "Leonardo";
        //alunos[2] = "Georg";
        //alunos[3] = "Andreia";
        // System.out.println(alunos);

        Random random = new Random();
        int[] numeros = {
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
        // todos os numeros sao maiores que -1, até o 0
        int maiorNumeroEncontrado = -1;
        int menorNumeroEncontrado = 101;
        int soma = 0;

        for (int indice = 0; indice < numeros.length; indice++) {
            int numeroAtual = numeros[indice];

            System.out.println("Numeros disponiveis " + numeros[indice]);


            if (numeroAtual > maiorNumeroEncontrado) {
                maiorNumeroEncontrado = numeroAtual;
            }

            if (numeroAtual < menorNumeroEncontrado) {
                menorNumeroEncontrado = numeroAtual;
            }
            soma += numeroAtual;
        }
        double mediaSimples = (double) soma / numeros.length;
        imprimeConteudoArray(numeros);
        System.out.println("O maior número dentro do array é: " + maiorNumeroEncontrado
                + " e o menor é: " + menorNumeroEncontrado
                + " e a média de valores é: " + mediaSimples);
    }
    public static void imprimeConteudoArray(int[] array){
            System.out.println("[");
            for (int item : array) {
                System.out.print(item + ", ");
            }
            System.out.println("]");
        }


    }


