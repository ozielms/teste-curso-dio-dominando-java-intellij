package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        Gato gato = new Gato();
        System.out.println(gato);

        Livros livro = new Livros("História da ilha", 300);
        System.out.println(livro);

        /*int a = 2;
        int b = 3;

        System.out.println("Soma: " + (a+b));*/
    }

}

class Livros {
    private String nome;
    private Integer npag;

    public Livros() {
    }

    public Livros(String nome, Integer npag) {
        this.nome = nome;
        this.npag = npag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNpag() {
        return npag;
    }

    public void setNpag(Integer npag) {
        this.npag = npag;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", npag=" + npag +
                '}';
    }
}
