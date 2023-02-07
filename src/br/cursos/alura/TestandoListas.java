package br.cursos.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        // criando aulas
        String aula1 = "Comhecendo mais listas";
        String aula2 = "Modelando a classe aula";
        String aula3 = "Trabalhando com cursos e sets";
        String aula4 = "Aumentando o conhecimento";

        // criando um ArrayLst para guarar as aulas
        ArrayList<String> aulas = new ArrayList<>();
        // adicionando as aula com .add
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);
        // imprimindo a lita de aulas
        System.out.println(aulas);
        // removendo uma aula especifica da lista
        aulas.remove(1);
        System.out.println(aulas);

        // percorrendo uma lista e acessando suas posições
        for (String aula: aulas) {
            System.out.println("Aula " + aula);
        }
        // pegando uma aula de dentro da lista
        String PrimeiraAula = aulas.get(0);
        System.out.println(PrimeiraAula);

        // vamps percorrer a lista e pegar todas as aulas que tem dentro dela
        for (int i = 0; i < aulas.size(); i++) {
            System.out.println("aula: " + aulas.get(i)); // pegar aula
        }
        // imprimindo quantas aulas ja tem guardada dentro da lista
        System.out.println(aulas.size());

        // eu quero que cada aula dentro aulas faça
        aulas.forEach(aula -> {
            System.out.println("Percorrendo:");
            // imprimindo as aulas
            System.out.println("Aula " + aula);
        });

        // Agora vamos ordenar a nosa lista em ordem alfabetica
        Collections.sort(aulas);
        System.out.println("Lista ordenada em ordem Alfabetia");
        System.out.println(aulas);







    }
}
