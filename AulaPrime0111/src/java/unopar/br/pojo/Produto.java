package unopar.br.pojo;
// Generated 22/11/2018 00:36:46 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Produto generated by hbm2java
 */
public class Produto  implements java.io.Serializable {


     private Integer id;
     private String nome;
     private Integer quantidade;
     private Double preco;
     private Date datacad;
     private String uf;
     private String descricao;

    public Produto() {
    }

    public Produto(String nome, Integer quantidade, Double preco, Date datacad, String uf, String descricao) {
       this.nome = nome;
       this.quantidade = quantidade;
       this.preco = preco;
       this.datacad = datacad;
       this.uf = uf;
       this.descricao = descricao;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getQuantidade() {
        return this.quantidade;
    }
    
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Double getPreco() {
        return this.preco;
    }
    
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public Date getDatacad() {
        return this.datacad;
    }
    
    public void setDatacad(Date datacad) {
        this.datacad = datacad;
    }
    public String getUf() {
        return this.uf;
    }
    
    public void setUf(String uf) {
        this.uf = uf;
    }
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }




}


