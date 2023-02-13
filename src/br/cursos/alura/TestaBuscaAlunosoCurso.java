package br.cursos.alura;

public class TestaBuscaAlunosoCurso {
    public static void main(String[] args) {
        // criando curso
        Curso javaColecoes = new Curso("Dominando as coleções Java", "Paulo Silveira");
        // adicionando e criando aulas dentro do curso, vamos usar o metodo adiciona que criamos
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 20));
        javaColecoes.adiciona(new Aula("Utilizando estrutura de dados", 10));
        javaColecoes.adiciona(new Aula("Criando uma aula", 8));

        // criando alunos
        Aluno a1 = new Aluno("Diego Abramo", 1445);
        Aluno a2 = new Aluno("Fabricio Sousa", 1210);
        Aluno a3 = new Aluno("Eloa Tavares", 2523);

        // agora vamos matricular os alunos no curso de javaColecoes
        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        // Agora eu quero saber se o aluno que tem o numero da matricula 1210 quem ele e?
        System.out.println("Quem é o aluno com a matricula 1210?");

        Aluno aluno = javaColecoes.buscaMatriculado(1210);
        System.out.println("Aluno: " + aluno);


    }
}
