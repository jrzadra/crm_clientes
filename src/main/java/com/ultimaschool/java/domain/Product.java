package com.ultimaschool.java.domain;

public class Product {

    private int id;

    private float preco;

    private String nome;

    public Product() {

    }

    public Product(float preco, String nome) {
        this.setPreco(preco);
        this.setNome(nome);
    }

    public Product(int id, float preco, String nome) {
        this.setId(id);
        this.setPreco(preco);
        this.setNome(nome);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", preco=" + preco +
                ", nome='" + nome + '\'' +
                '}';
    }
}
