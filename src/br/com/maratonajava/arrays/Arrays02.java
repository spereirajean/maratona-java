package br.com.maratonajava.arrays;

public class Arrays02 {
    public static void main(String[] args) {
        String[] personagens = new String[5];
        personagens[0] = "Luffy";
        personagens[1] = "Zoro";
        personagens[2] = "Sanji";
        personagens[3] = "Frankyyyyy";
        personagens[4] = "Chopper";

        for (int i=0; i<personagens.length; i++){
            System.out.println("Um dos meus personagens favoritos em One Piece é o "+ personagens[i]);
        }

        System.out.println("\nAgora vamos aos meus personagens de Naruto :) \n");


        personagens = new String[3];
        personagens[0] = "Naruto";
        personagens[1] = "Sasuke";
        personagens[2] = "Shikamaru";

        for (int i=0; i< personagens.length; i++){
            System.out.println("Um dos meus personagens favoritos em Naruto é o "+personagens[i]);
        }
    }
}
