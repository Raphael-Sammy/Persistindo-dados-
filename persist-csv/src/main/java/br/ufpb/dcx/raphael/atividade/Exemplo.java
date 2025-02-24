package br.ufpb.dcx.raphael.atividade;

public class Exemplo{
    public static void main(String[] args){
        Produto p = new Produto(1,00.00,"","");
        p.setId(1);
        p.setNome("Produto 2");
        p.setPreco(Double.valueOf("20.00"));;
        p.setDescricao("Descrição do produto 2");
        p.Salvar();
    }
}


