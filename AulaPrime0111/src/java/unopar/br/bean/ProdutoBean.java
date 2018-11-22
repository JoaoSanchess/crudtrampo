/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unopar.br.bean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import unopar.br.dao.ProdutoDao;
import unopar.br.pojo.Produto;

/**
 *
 * @author anderson5687
 */
@ManagedBean
@SessionScoped
public class ProdutoBean {

    private Produto produto;
    private List<Produto> produtos;

    public ProdutoBean() {
        produto = new Produto();
        produtos = new ProdutoDao().listar();
    }

    public void salvar() {
        ProdutoDao produtoDao = new ProdutoDao();
        if (produto.getId() != null && produto.getId() > 0) {
            produtoDao.alterar(produto);
        } else {
            produtoDao.inserir(produto);
        }
        produto = new Produto();
        produtos = produtoDao.listar();
    }

    public void editar(Produto u) {
        this.produto = u;
    }
    public void deletar(Produto u) {
        ProdutoDao produtoDao = new ProdutoDao();
        produtoDao.deletar(u);
        produto = new Produto();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
