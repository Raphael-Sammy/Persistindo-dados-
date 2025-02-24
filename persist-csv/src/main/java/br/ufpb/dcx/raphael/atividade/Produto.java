package br.ufpb.dcx.raphael.atividade;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Produto {
    private Integer id;
    private String nome;
    private Double preco;
    private String descricao;


    public Produto(Integer id, Double preco, String nome, String descricao) {
        this.id = id;
        this.preco = preco;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void Salvar(){
        boolean fileExits = new File("Produtos").exists(); {
            try(BufferedWriter writer = new BufferedWriter(new FileWriter("Produtos"))){
                if(!fileExits){
                    writer.write("ID, Nome, Preco, Descricao\n");
                }
                writer.write(this.id + "," + this.nome + "," + this.preco + "," + this.descricao + "\n");
                System.out.println("Produto salvo com sucesso!");
            } catch (IOException e) {
                System.err.println("Erro ao salvar o produto: " + e.getMessage());
            }
        }
    }
}
