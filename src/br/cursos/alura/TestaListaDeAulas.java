package br.cursos.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAulas {
    public static void main(String[] args) {
        // criando aulas
        Aula a1 = new Aula("Revisando ArrayList", 21);
        Aula a2 = new Aula("Lista de Objetos", 17);
        Aula a3 = new Aula("Relacionamento de listas e Objetos", 11);

        // guardando aulas dentro do de uma lista de Aula
        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);

        // imprimindo a lista
        System.out.println(aulas);

        // vamos ordenar a lista de aulas em ordem alfabetica
        // porém o Collections.sort não sabe ordenar o array de aulas, Collections.sort só sabe ordenar array de Strings
        // para resolver esse problema vamos ter que implementar o metodo compareTo na classe Aula
        System.out.println("Ordenador por ordem alfabetica");
        Collections.sort(aulas);
        System.out.println(aulas);

        // agora vamos ordenar a lista de aulas pelo tempo da aula
        // eu quero que ordene as aulas comparando o tempo das aulas
        System.out.println("Ordenador por ordem tempo das aulas");
        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
        System.out.println(aulas);




    }
}
