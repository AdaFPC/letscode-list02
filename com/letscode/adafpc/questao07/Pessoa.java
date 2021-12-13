package com.letscode.adafpc.questao07;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa() {

    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa1 = (Pessoa) o;
        return idade == pessoa1.idade && Objects.equals(nome, pessoa1.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, idade);
    }

    @Override
    public String toString() {
        return "Nome{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
