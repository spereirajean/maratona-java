package br.com.maratonajava.arrays;

public class Arrays03 {
    public static void main(String[] args) {
        String[] nomes = {"Luffy, Naruto, Goku, Sasuke, Gojo"};
        for (String personagens : nomes){
            System.out.println(personagens);
        }

        String[] mercado = {"Arroz, feijão, açucar, detergente, sabão"};
        for (String listaCompras : mercado){
            System.out.println(listaCompras);
        }

        int[] posicao = {1, 2, 3,4 ,5 };
        for (int colocados : posicao){
            System.out.println(colocados);
        }
    }
}
