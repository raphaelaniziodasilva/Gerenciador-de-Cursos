package br.cursos.alura;

// vamos colocar dentro da classe Curso alguns alunos ou seja vamos fazer o relacionamento entre a classe Curso e Aluno

public class TestaCursoComAluno {
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

        // imprimindo todos os alunos matriculados
        System.out.println("Todos os alunos matriculados ");

        javaColecoes.getAlunos().forEach(A -> { // para cada aluno A eu ou fazer alguma coisa
            System.out.println(A); // imprimindo todos os alunos
            // vamos transformar o objeto em string, formatação toString na classe Aluno
        });

        // verificando se o aluno esta matriculado para isso vamos chamar o metodo que criamos para fazer esa verificação
        System.out.println("O aluno " + a1 + " esta matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));

        // criando um aluno com o mesmo node do aluno a1
        Aluno diego = new Aluno("Diego Abramo", 1445);
        System.out.println("E esse diego, está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(diego));

        // agora vou verificar se o aluno a1 e igual ao aluno diego
        // se eu realmente quero ter uma forma de de falar se um objeto e igual ao outro vamos na classe aluno e reescrever o metodo equals do java

        System.out.println("O aluno a1 é equals ao diego?");
        System.out.println(a1.equals(diego));
    }
}
