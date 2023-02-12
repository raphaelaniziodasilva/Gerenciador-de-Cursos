package br.cursos.alura;

public class Aluno {
    private String nome;
    private int numeroMatricula;

    public Aluno(String nome, int numeroMatricula) {
        // se o nome for null vamos lançar um erro
        if(nome == null) {
            throw new NullPointerException("O nome não pode ser null");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    // imprimindo, transformando objeto em string, formatação toString
    @Override
    public String toString() {
        return "[Aluno: " + this.nome + ", matricula: " + this.numeroMatricula + "]";
    }

    // reescrevendo o metodo equals do java para verificar se um objeto e igual a outro objeto


    @Override
    public boolean equals(Object obj) {
         Aluno outroAluno = (Aluno) obj;
         // verificando pelo nome
        return this.nome.equals(outroAluno.nome);

        // vamos no construtor da classe fazer a verificação se o nome for null vamos lançar um erro

        // quando rescrevemos o metodo iquals precisamos tbm reescrever o metodo hashCode
    }

    // o metodo hashCode do java ajuda a fazer uma pesquisa rapida com epalhamento procurando em cada gaveta o nome
    // vamos reescrever o metodo hashCode do java
    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
